import java.util.*;
class Account {
int id = 0;
static double balance = 500;
double annualInterestRate = 0;
Date date = new Date();
Scanner sc = new Scanner(System.in);
Account() {
// to create a new id
String uniqueID = UUID.randomUUID().toString();
        System.out.println("The Account Number is : " + uniqueID);
        System.out.println("Your Account balance is : " + balance);
    }

    void getMonthlyInterestRate() {
        double k = 4.9 / 12;
        System.out.println(" Monthly Interest Rate is : " + k);
    }

    void withdraw() {
        System.out.println("Enter Amount you want to Withdraw : ");
        double with = sc.nextDouble();
        if (with > balance) {
            System.out.println("Account have insufficient balance");
        } else {
            balance = balance - with;
            System.out.println("updated balnce is : " + balance);
        }

    }

    void deposit() {
        System.out.println("Enter Amount ypu want to Deposit : ");
        double depo = sc.nextDouble();
        balance = balance + depo;
        System.out.println(" updated balnce is : " + balance);

    }

    void data() {
        System.out.println();
        System.out.println("1.Deposit");
        System.out.println("2.Widthdraw");
        System.out.println("3.GetMonthlyInterestRate");
        System.out.println();
    }

    public Double getBalance() {
        return balance;
    }

    public int getId() {
        return 0;
    }

}

public class Pr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account a = new Account();
        System.out.println("       Welcome To  BANK        ");
        System.out.println();
        System.out.println(" Account Creation Date is : ");
        System.out.println(a.date.toString());
        System.out.println();
        a.data();
        for (int i = 1; i >= 1; i++) {
            System.out.println("Enter Your Input : ");
            int k = sc.nextInt();
            switch (k) {
                case 1: {
                    a.deposit();
                    a.data();
                    continue;
                }
                case 2: {
                    a.withdraw();
                    a.data();
                    continue;
                }
                case 3:
                    a.getMonthlyInterestRate();
                    a.data();
                    continue;
                default:
                    System.out.println("Error has coccured");

            }
        }
        sc.close();
}

