package com.jahid.assignment.assignment12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySqlJdbc {
    private static final String URL = "jdbc:mysql://localhost:3306/mydatabase";
    private static final String USER = "root";
    private static final String PASSWORD = "StrongP@ssw0rd!";

    // JDBC variables for opening and managing connection
    private static Connection connection;

    public static void main(String[] args) {
        try {
            // Establish the connection
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connection established.");

            // Perform CRUD operations
            createUser(1, "jahid khan", "jahid@gmail.com");
            readUsers();
            updateUser(1, "faiz", "faiz@example.com");
            deleteUser(1);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the connection
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    // Create a new user
    public static void createUser(int id, String username, String email) {
        String sql = "INSERT INTO users (id, username, email) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.setString(2, username);
            pstmt.setString(3, email);
            pstmt.executeUpdate();
            System.out.println("User created: " + username);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Read all users
    public static void readUsers() {
        String sql = "SELECT * FROM users";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String username = rs.getString("username");
                String email = rs.getString("email");
                System.out.println("ID: " + id + ", Username: " + username + ", Email: " + email);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Update an existing user
    public static void updateUser(int id, String newUsername, String newEmail) {
        String sql = "UPDATE users SET username = ?, email = ? WHERE id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, newUsername);
            pstmt.setString(2, newEmail);
            pstmt.setInt(3, id);
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("User updated: " + newUsername);
            } else {
                System.out.println("No user found with ID: " + id);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Delete a user
    public static void deleteUser(int id) {
        String sql = "DELETE FROM users WHERE id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("User deleted with ID: " + id);
            } else {
                System.out.println("No user found with ID: " + id);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
