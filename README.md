# SmartSpend Monthly Budget Tracker 💰

A Java console application that helps users track their monthly budget. Enter your income and main expenses, and the app calculates your remaining balance and tells you how healthy your finances are.

## Features
- Takes monthly income, rent, transport and grocery expenses as input
- Calculates total expenses and remaining balance
- Assigns a financial status based on the remaining balance
- Currency formatted in Rand (R) to 2 decimal places

## Financial Status Rules
| Remaining Balance | Status |
|---|---|
| Below R0 | Overspending |
| R0 to R1000 | At Risk |
| Above R1000 | Financially Stable |

## Built With
- Java
- `Scanner` for user input
- Methods for modular calculations

## How to Run
1. Clone the repo:
   ```
   git clone https://github.com/funowritescode/Budget-Tracker.git
   ```
2. Open the folder in your IDE, or compile from the terminal:
   ```
   javac MonthlyBudgetTracker.java
   java MonthlyBudgetTracker
   ```
3. Enter your figures when prompted.

## Example Output
```
=== SmartSpend Monthly Budget Tracker ===
Enter your monthly income: R15000
Enter your rent expense: R6000
Enter your transport expense: R1500
Enter your grocery expense: R3000

===== Monthly Budget Summary =====
Monthly Income    : R15000.00
Total Expenses    : R10500.00
Remaining Balance : R4500.00
Financial Status  : Financially Stable
==================================
```

## Planned Improvements
- Input validation (reject negative or non-numeric values)
- Add more expense categories (utilities, savings, entertainment)
- Save budget history to a file
- Build a GUI version

## Author
Lufuno Sello, Network Systems student learning Java and data analysis
