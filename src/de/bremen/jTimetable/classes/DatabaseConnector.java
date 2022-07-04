package de.bremen.jTimetable.classes;

import java.sql.*;

public class DatabaseConnector {

    /**
     * Fills the class variable connection with a connection to the database
     * The returned connection needs ti closed!
     */
    protected Connection connect() {
        //TODO generalisieren
        String jdbcURL = "jdbc:h2:file:C:/Users/loreen.roose1/test.mv.db";
        try {
            //Load drivers and establish connection
            Class.forName("org.h2.Driver");
            return DriverManager.getConnection(jdbcURL, "sa", "");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Connection could not be established, because the driver class wasn't found.");
            e.printStackTrace();
            //TODO wenn keine Exception im catch-Block geschmissen wird, dann wäre weiteres return nötig
            throw new RuntimeException(e);
        }
    }

    /**
     * @param table
     * @param value
     */
    private void addValueToTable(String table, GeneralValue value) {

        StringBuilder addString = new StringBuilder("INSERT INTO ? VALUES");
        StringBuilder message = new StringBuilder("The following value: ");

        try (Connection con = connect()) {
            PreparedStatement prep = con.prepareStatement(addString.toString());

            if (value instanceof CourseOfStudy) {

                addString.append("(?, ?, ?, ?, ?)");
            //    prep.setString();
            } else if (value instanceof Lecturer) {
                addString.append("(?, ?, ?, ?, ?, ?)");
            } else {
                addString.append("(?, ?, ?)");
            }

            prep.execute();
            System.out.println();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        throw new UnsupportedOperationException(
                "Method addValueToTable in class DatabaseConnector " +
                        "isn't implemented yet.");
        //TODO
    }

    /**
     * @param table
     * @param values
     */
    private void addValuesToTable(String table, GeneralValue[] values) {
        //try with resources --> automatically closed after try-block
        try (Connection con = connect()) {
            //create statement object
            PreparedStatement ps = con
                    .prepareStatement("SELECT * FROM " + table + " WHERE id=?");

            if (values != null) {
                StringBuilder sqlString = new StringBuilder("INSERT INTO ").append(table);
                for (GeneralValue value : values) {
                    if (value instanceof CourseOfStudy) {

                    } else if (value instanceof Lecturer) {

                    }
                }
                ps.execute(sqlString.toString());
            }
        } catch (SQLException e) {
            //TODO
            throw new RuntimeException(e);
        }
    }

    public ResultSet select(String table, Integer[] id) {
        throw new UnsupportedOperationException();
    }

    /**
     * TODO Das ist eine Testmethode (weg damit)
     *
     * @param args
     */
    public static void main(String[] args) {
        String jdbcURL = "jdbc:h2:file:C:/Users/loreen.roose1/test.mv.db";
        try {
            //Treiber laden und verbinden
            Class.forName("org.h2.Driver");
            Connection con = DriverManager.getConnection(jdbcURL, "sa", "");

            // Statement Objekt erstellen
            Statement stm = con.createStatement();

            // Tabelle erstellen
            String sql_create = "CREATE TABLE IF NOT EXISTS kunden(id INTEGER, name VARCHAR(50), vip BOOLEAN);";
            stm.execute(sql_create);
            System.out.println("Tabelle kunden wurde angelegt");
            // Datensatz einfügen
            String sql_insert = "INSERT INTO kunden(id, name, vip) VALUES(1, 'El Haberer', FALSE)";
            stm.execute(sql_insert);
            System.out.println("Werte in Kunden eingefügt.");
            // Datensatz auslesen
            String sql_select = "SELECT * FROM kunden";
            ResultSet rs = stm.executeQuery(sql_select);
            while (rs.next()) {
                System.out.println(rs.getString(1) + " " +
                        rs.getString(2) + " " +
                        rs.getString(3));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

