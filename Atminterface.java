 import java.util.Scanner;

class Atminterface
{

    public static void main(String args[]){
        int balance=1000;
        int deposit;
        int Withdraw;
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println(" Welcome to Automated teller machine!..");


            System.out.println("1. Withdraw");
            System.out.println("2. deposite");
            System.out.println("3. Check balance");
            System.out.println("4. exit");
            
            System.out.println(" Select your option !");

            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("enter your amount to withdraw..");
                    Withdraw=sc.nextInt();

                    if(balance>=Withdraw){
                    balance=balance-Withdraw;
                    System.out.println("collect your money");
                    }
                    else
                    {
                        System.out.println("Insufficient balance");

                    
                    }
                    case 2:
                        System.out.println("enter your amount to deposite");
                        deposit=sc.nextInt();
                        balance=balance+deposit;
                        System.out.println("sucefully money depoited");
                        System.out.println(" ");
                        break;

                        case 3:
                            System.out.println("balance" +balance);
                            System.out.println("");
                            break;

                            case 4:
                                System.exit(0);
                                default:
                                    System.out.println("wrong choice");


            }
        }

    }
}