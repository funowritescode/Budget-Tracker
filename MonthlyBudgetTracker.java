import java.util.Scanner;

/**
 * SmartSpend Solutions - Monthly Budget Tracker (console application)
 */
public class MonthlyBudgetTracker {

    // Constant: the minimum safe remaining balance
    static final double RISK_THRESHOLD = 1000.0;

    /**
     * Calculates the total of rent, transport and grocery expenses.
     */
    public static double calculateTotalExpenses(double rent, double transport, double grocery) {
        return rent + transport + grocery;
    }

    /**
     * Calculates the remaining balance after expenses are deducted from income.
     */
    public static double calculateRemainingBalance(double monthlyIncome, double totalExpenses) {
        return monthlyIncome - totalExpenses;
    }

    /**
     * Determines the financial status based on the remaining balance.
     */
    public static String determineFinancialStatus(double remainingBalance) {
        if (remainingBalance < 0) {
            return "Overspending";
        } else if (remainingBalance <= RISK_THRESHOLD) {
            return "At Risk";
        } else {
            return "Financially Stable";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variables
        double monthlyIncome;
        double rentExpense;
        double transportExpense;
        double groceryExpense;
        double totalExpenses;
        double remainingBalance;
        String financialStatus;

        // User input
        System.out.println("=== SmartSpend Monthly Budget Tracker ===");
        System.out.print("Enter your monthly income: R");
        monthlyIncome = input.nextDouble();

        System.out.print("Enter your rent expense: R");
        rentExpense = input.nextDouble();

        System.out.print("Enter your transport expense: R");
        transportExpense = input.nextDouble();

        System.out.print("Enter your grocery expense: R");
        groceryExpense = input.nextDouble();

        // Calculations
        totalExpenses = calculateTotalExpenses(rentExpense, transportExpense, groceryExpense);
        remainingBalance = calculateRemainingBalance(monthlyIncome, totalExpenses);
        financialStatus = determineFinancialStatus(remainingBalance);

        // Output
        System.out.println();
        System.out.println("===== Monthly Budget Summary =====");
        System.out.printf("Monthly Income    : R%.2f%n", monthlyIncome);
        System.out.printf("Total Expenses    : R%.2f%n", totalExpenses);
        System.out.printf("Remaining Balance : R%.2f%n", remainingBalance);
        System.out.println("Financial Status  : " + financialStatus);
        System.out.println("==================================");

        input.close();
    }
}