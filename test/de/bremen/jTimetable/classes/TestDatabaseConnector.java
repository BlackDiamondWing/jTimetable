package de.bremen.jTimetable.classes;

import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDatabaseConnector {

    @Test
    public void testConnection() {
        DatabaseConnector connector = new DatabaseConnector();

        // Statement Objekt erstellen
        Statement stm = null;
        try (Connection con = connector.connect()) {
            stm = con.createStatement();

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
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
