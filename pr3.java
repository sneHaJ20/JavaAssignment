import java.util.*;

class Account_1 
{
    double balance = 100;
    int[] Accn = new int[10];

    void data() 
    {
        System.out.println();
        System.out.println("1.Deposit");
        System.out.println("2.Widthdraw");
        System.out.println("3.GetMonthlyInterestRate");
        System.out.println();
    }
}

class pr3 {
    public static void main(String[] args) {
        Account_1 a = new Account_1();
        Account ac = new Account();
        try (Scanner sc = new Scanner(System.in)) {
            int i;
            for (i = 0; i < a.Accn.length; i++) {
                a.Accn[i] = i;
            }
            System.out.println("Enter Your Account Number :  ");
            int k = sc.nextInt();
            if (k != a.Accn[i]) {
                System.out.println("Please Enter A Valid ID*");
            } else {
                System.out.println("*******Welcome To A.R.INTELLIGENCE BANK******");
                System.out.println();
                System.out.println("The Account Creation Date is : ");
                System.out.println(ac.date.toString());
                System.out.println();
                a.data();
                for (int j = 1; j >= 1; j++) {
                    System.out.println("Enter Your Input : ");
                    int m = sc.nextInt();
                    switch (m) {
                        case 1:
                            ac.deposit();
                            a.data();
                            continue;
                        case 2:
                        ac.withdraw();
                        a.data();
                        continue;
                    case 3:
                        ac.getMonthlyInterestRate();
                        a.data();
                        continue;
                    case 99:
                        break;
                    default:
                        System.out.println(":: 404 The Error Accurs ::");

                }
            }
        }
    }
}
}

