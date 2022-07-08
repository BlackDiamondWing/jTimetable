package de.bremen.jTimetable.classes;

import java.sql.*;

/**
 * This class represents the connection to the database and is the only class with direct access
 * to it.
 */
public class DatabaseConnector {

    /**
     * Default Constructor.
     * Create tables if they don't already exist
     */
    protected DatabaseConnector() {
        //Establish a connection to the database to create tables if they don't exist
        try (Connection con = connect()) {
            //PreparedStatementString for Location and Subject
            String prepStringLocSub = "CREATE TABLE IF NOT EXISTS " +
                    "?(id_? INTEGER AUTO_INCREMENT NOT NULL PRIMARY KEY, " +
                    "caption VARCHAR NOT NULL, " +
                    "active BOOLEAN NOT NULL)";
            //Create Location table
            PreparedStatement prepLoc = con.prepareStatement(prepStringLocSub);
            prepLoc.setString(1, "LOCATION");
            prepLoc.setString(2, "location");
            prepLoc.executeQuery();
            //Create Subject table
            PreparedStatement prepSub = con.prepareStatement(prepStringLocSub);
            prepSub.setString(1, "SUBJECT");
            prepSub.setString(2, "subject");
            prepSub.executeQuery();

            String prepStringRoom = "CREATE TABLE IF NOT EXISTS " +
                    "ROOM(id_room INTEGER AUTO_INCREMENT NOT NULL PRIMARY KEY, " +
                    "caption VARCHAR NOT NULL, " +
                    "active BOOLEAN NOT NULL, " +
                    "id_location_room INTEGER NOT NULL)";
            //Create Room table
            Statement stmRoom = con.createStatement();
            stmRoom.executeQuery(prepStringRoom);

            String prepStringCourseOfStudy = "CREATE TABLE IF NOT EXISTS " +
                    "COURSE_OF_STUDY(id_courseOfStudy INTEGER AUTO_INCREMENT NOT NULL PRIMARY KEY, " +
                    "caption VARCHAR NOT NULL, " +
                    "active BOOLEAN NOT NULL, " +
                    "begin DATE NOT NULL, " +
                    "end DATE NOT NULL)";
            //Create CourseOfStudy table
            Statement stmCourseOfStudy = con.createStatement();
            stmCourseOfStudy.executeQuery(prepStringCourseOfStudy);

            String prepStringLecturer = "CREATE TABLE IF NOT EXISTS " +
                    "Lecturer(id_lecturer INTEGER AUTO_INCREMENT NOT NULL PRIMARY KEY, " +
                    "caption VARCHAR, " +
                    "active BOOLEAN NOT NULL, " +
                    "firstname VARCHAR NOT NULL, " +
                    "lastname VARCHAR NOT NULL, " +
                    "id_location_lecturer INTEGER NOT NULL)";
            //Create Lecturer table
            Statement stmLecturer = con.createStatement();
            stmCourseOfStudy.executeQuery(prepStringLecturer);

        } catch (SQLException e) {
            System.err.println("The tables could not be created properly.");
            e.printStackTrace();
        }
    }

    /**
     * Creates a connection to the database. The returned connection needs to be closed!
     */
    protected Connection connect() {
        //Generic path to db within the project structure TODO check
        String jdbcURL = "jdbc:h2:file:./TimetableDB.mv.db";
        try {
            //Load drivers and establish connection
            Class.forName("org.h2.Driver");
            return DriverManager.getConnection(jdbcURL, "sa", "");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(
                    "Connection could not be established, because the driver class wasn't found.");
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * One value will bei added to the table.
     *
     * @param table specifies in which table the value should be added
     * @param value the value that will be added
     */
    private void addValueToTable(String table, GeneralValue value) {

        StringBuilder addString = new StringBuilder("INSERT INTO ? VALUES");
        StringBuilder message = new StringBuilder("The following value: ");

        try (Connection con = connect()) {
            PreparedStatement prep = con.prepareStatement(addString.toString());

            //TODO Check whether general value type and table match
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
        } catch (SQLException e) {
            System.err.println("The value couldn't be added to the specified table properly.");
            e.printStackTrace();
        }
    }

    /**
     * Several values of the same type will be added to the specified table
     *
     * @param table  specifies in which table the values should be added
     * @param values the values that will be added
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
            System.err.println("The value couldn't be added to the specified table properly.");
            e.printStackTrace();
        }
    }

    /**
     * TODO nach welchen kriterien wird selektiert?
     *
     * @param table
     * @param id
     * @return
     */
    public ResultSet select(String table, Integer[] id) {
        throw new UnsupportedOperationException();
    }

}

