package de.bremen.jTimetable.Classes;

import java.sql.*;

public class DatabaseConnector {

    private Connection connection;

    /**
     *
     */
    public DatabaseConnector() {
        this.connection = connect();
    }

    /**
     * @return
     */
    private Connection connect() {
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String jdbcURL = "jdbc:h2:file:C:/Users/loreen.roose1/test.mv.db";
        try {
            //Treiber laden und verbinden
            Class.forName("org.h2.Driver");
            return DriverManager.getConnection(jdbcURL, "sa", "");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * @param table
     * @param value
     */
    private void addValueToTable(String table, GeneralValue value) {

        String addString = "INSERT INTO ? VALUES";

        try {
            PreparedStatement prep = this.connection.prepareStatement(addString);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        throw new UnsupportedOperationException(
                "Method addValueToTable in class DatabaseConnector " +
                        "isn't implemented yet.");
        //TODO
    }

    private void addValuesToTable(String table, GeneralValue[] values) {
    }

    /**
     * TODO Das ist eine Testmethode (weg damit)
     *
     * @param args
     */
    public static void main(String[] args) {
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String jdbcURL = "jdbc:h2:file:C:/Users/loreen.roose1/test.mv.db";
        try {
            //Treiber laden und verbinden
            Class.forName("org.h2.Driver");
            Connection con = DriverManager.getConnection(jdbcURL, "sa", "");

            // Statement Objekt erstellen
            Statement stm = con.createStatement();

            // Tabelle erstellen
            String sql_create =
                    "CREATE TABLE IF NOT EXISTS kunden(id INTEGER, name VARCHAR(50), vip BOOLEAN);";
            stm.execute(sql_create);
            System.out.println("Tabelle kunden wurde angelegt");
            // Datensatz einfügen
            String sql_insert = "INSERT INTO kunden(id, name, vip) VALUES(1, 'Elon Musk', TRUE)";
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

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

