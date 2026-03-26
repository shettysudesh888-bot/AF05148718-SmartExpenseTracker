package com.jdbc.dao;

import java.sql.*;
import com.jdbc.model.Expense;
import com.jdbc.util.DBConnection;

public class ExpenseDAO {

    public void addExpense(Expense e) {
        try {
            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO expenses(title, amount, category, date) VALUES (?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, e.getTitle());
            ps.setDouble(2, e.getAmount());
            ps.setString(3, e.getCategory());
            ps.setDate(4, Date.valueOf(e.getDate()));

            ps.executeUpdate();
            System.out.println("Expense Added!");

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public void viewExpenses() {
        try {
            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM expenses");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("title") + " | " +
                        rs.getDouble("amount") + " | " +
                        rs.getString("category") + " | " +
                        rs.getDate("date")
                );
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void deleteExpense(int id) {
        try {
            Connection con = DBConnection.getConnection();

            String sql = "DELETE FROM expenses WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ps.executeUpdate();
            System.out.println("Expense Deleted!");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void totalSpending() {
        try {
            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT SUM(amount) FROM expenses");

            if (rs.next()) {
                System.out.println("Total Spending: " + rs.getDouble(1));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void filterByCategory(String category) {
        try {
            Connection con = DBConnection.getConnection();

            String sql = "SELECT * FROM expenses WHERE category=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, category);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("title") + " | " +
                        rs.getDouble("amount") + " | " +
                        rs.getString("category") + " | " +
                        rs.getDate("date")
                );
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}