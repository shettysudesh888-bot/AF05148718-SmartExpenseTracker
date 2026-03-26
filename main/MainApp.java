package com.jdbc.main;

import java.util.Scanner;
import com.jdbc.dao.ExpenseDAO;
import com.jdbc.model.Expense;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ExpenseDAO dao = new ExpenseDAO();

        while (true) {
            System.out.println("\n1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Delete Expense");
            System.out.println("4. Total Spending");
            System.out.println("5. Filter by Category");
            System.out.println("6. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Title: ");
                    String title = sc.next();

                    System.out.print("Amount: ");
                    double amount = sc.nextDouble();

                    System.out.print("Category: ");
                    String category = sc.next();

                    System.out.print("Date (YYYY-MM-DD): ");
                    String date = sc.next();

                    Expense e = new Expense(title, amount, category, date);
                    dao.addExpense(e);
                    break;

                case 2:
                    dao.viewExpenses();
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    dao.deleteExpense(id);
                    break;

                case 4:
                    dao.totalSpending();
                    break;

                case 5:
                    System.out.print("Enter Category: ");
                    String cat = sc.next();
                    dao.filterByCategory(cat);
                    break;

                case 6:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}