package ATMPROJECT;


import java.util.Scanner;




public class project {
        float balance;
        int pin = 1498;
        Scanner sc = new Scanner(System.in);
        void check_pin(){
            System.out.println();
            System.out.println("********************************");
            System.out.println("enter your pin");
            int enteredpin = sc.nextInt();

            if(enteredpin == pin){
                menu();
            }else{
                System.out.println(" --  Enter a valid pin  --");
                check_pin();
            }
        }


        void menu(){
            System.out.println();
            System.out.println(" Enter your choice ");
            System.out.println(" 1. Check A/C Balance        2. Withdraw Money");
            System.out.println(" 3. Deposit Money            4. EXIT");


            int choice = sc.nextInt();
            switch(choice){
                case 1:check_balance();
                    break;
                case 2 :withdraw_money();
                    break;
                case 3 :deposit_money();
                    break;
                case 4:
                    System.out.println("Successfully Exited .");
                    break;
                default:
                    System.out.println("Enter Correct Choice");
            }

        }
        void check_balance(){
            System.out.println();
            System.out.println("Blance in your Account is : "+balance);
            System.out.println("----*****     checked Successfully       *****---");
            System.out.println();

            System.out.println("Enter Choice :");
            System.out.println("1.Menu    2.Exit");
            int n = sc.nextInt();
            switch(n){
                case 1:menu();
                    break;
                case 2:
                    System.out.println("---******    Exited Successfuly      ******---");
                    break;
                default:
                    System.out.println("Enter Correct Choice");
            }
        }
        void withdraw_money(){
            System.out.println();
            System.out.println("Enter Amount to Withdraw : ");
            float amt = sc.nextFloat();
            if (amt > balance){
                System.out.println("Insufficeient Balance");
            }else{
                balance -= amt;
                System.out.println("---*****    Money Withdrawl Successful    *****--- ");

            }
            System.out.println();

            System.out.println("Enter Choice :");
            System.out.println("1.Menu    2.Exit");
            int n = sc.nextInt();
            switch(n){
                case 1:menu();
                    break;
                case 2:
                    System.out.println("---*****      Exited Successfuly      *****---");
                    break;
                default:
                    System.out.println("Enter Correct Choice");
            }
        }

        void deposit_money(){
            System.out.println();
            System.out.println("Enter Amount to deposit");
            float amt = sc.nextFloat();
            balance += amt;
            System.out.println("---******     Money Deposited Successfully      ******---");
            System.out.println();

            System.out.println("Enter Choice :");
            System.out.println("1.Menu    2.Exit");
            int n = sc.nextInt();
            switch(n){
                case 1:menu();
                    break;
                case 2:
                    System.out.println("----*****      Exited Successfuly     *****-----");
                    break;
                default:
                    System.out.println("Enter Correct Choice");
            }
        }


    
 
        public static void main(String[] args) {

            project obj = new project();
            obj.check_pin();

        }


}
