package bank_account;

import java.util.Scanner;

public class Bank_Account {

    public static void main(String[] args) {
        int option = 0;
        int accountOption = 0;
        int depoOption = 0;
        int withOption = 0;

        Scanner input = new Scanner(System.in);

        Check newCheck = new Check();
        Fixed newFixed = new Fixed();
        Savings newSaving = new Savings();

        System.out.println("Welcome, please select an option to proceed");

        // Menu loop
        while (option != 4) {

            System.out.println("*******************************************");
            System.out.println("1 - Check your balance");
            System.out.println("2 - Deposit");
            System.out.println("3 - Withdrawal");
            System.out.println("4 - Exit");
            System.out.println("*******************************************");

            // Input validation
            try {
                option = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number. x");
                continue;
            }

            // Menu options
            switch (option) {

                case 1:
                    System.out.println("Please select the account type: ");
                    System.out.println("*******************************************");
                    System.out.println("1 - Check account");
                    System.out.println("2 - Saving account");
                    System.out.println("3 - Fixed account");
                    System.out.println("*******************************************");

                    try {
                        accountOption = Integer.parseInt(input.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a number. y");
                    }

                    switch (accountOption) {
                        case 1:
                            newCheck.showInfo();
                            break;
                        case 2:
                            newSaving.showInfo();
                            break;
                        case 3:
                            newFixed.showInfo();
                            break;
                        default:
                            System.out.println("Select a valid option");
                            break;
                    }
                    break;

                case 2:
                    System.out.println("Please select the account type: ");
                    System.out.println("*******************************************");
                    System.out.println("1 - Check account");
                    System.out.println("2 - Saving account");
                    System.out.println("3 - Fixed account");
                    System.out.println("*******************************************");

                    try {
                        depoOption = Integer.parseInt(input.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a number.");
                    }

                    switch (depoOption) {
                        case 1:
                            newCheck.deposit(input);
                            break;
                        case 2:
                            newSaving.deposit(input);
                            break;
                        case 3:
                            newFixed.deposit(input);
                            break;
                        default:
                            System.out.println("Select a valid option");
                            break;
                    }

                    break;

                case 3:
                    System.out.println("*******************************************");
                    System.out.println("1 - Check account");
                    System.out.println("2 - Saving account");
                    System.out.println("3 - Fixed account");
                    System.out.println("*******************************************");
                    System.out.println("Please select the account type: ");

                    try {
                        withOption = Integer.parseInt(input.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a number.");
                    }

                    switch (withOption) {
                        case 1:
                            newCheck.withdrawal(input);
                            break;
                        case 2:
                            newSaving.withdrawal(input);
                            break;
                        case 3:
                            newFixed.withdrawal(input);
                            break;
                        default:
                            System.out.println("Select a valid option");
                            break;
                    }
                    break;

                case 4:
                    System.out.println("Thanks for using our ATM");
                    break;
                default:
                    System.out.println("Select a valid option");
                    break;

            }

        }
        input.close();
    }
}
