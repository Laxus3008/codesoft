import java.util.Scanner;

class user{
    String user_name = "Ayush Verma";
    String password = "0123";
    static float acc_balance = 696969;
}

class ATM extends user{
    Scanner sc=new Scanner(System.in);

    public void password_validation(){
        System.out.println("Enter your password : ");
        String insert_pass = sc.nextLine();
        if(insert_pass.equals(password)){
            System.out.println("\nValid User");
            System.out.println("User name : "+ user_name);
            oprations();
        }else{
            System.out.println("\nIncorrect password");
            System.out.println(("Press 1 to try again otherwise press 0 to exit :\n"));
            int c = sc.nextInt();
            sc.nextLine();
            if(c==1){
                password_validation();
            }else{
                System.out.println("Operation ended");
            }
        }
    }

    public void oprations(){
        System.out.println("Welcome");
        System.out.println("Press 1 to withdraw cash");
        System.out.println("Press 2 to deposit cash");
        System.out.println("Press 3 to to check balance");
        System.out.println("Press 4 to log out");
        int x = sc.nextInt();
        sc.nextLine();

        switch(x){
            case 1 :
                withdraw();
                break;
            
            case 2:
                deposit();
                break;
            
            case 3 :
                show_balance();
                break;

            case 4 :
                System.out.println("Logged out");
                break;
        }
    }

    public void withdraw(){
        System.out.println("Enter the amount : ");
        float amt = sc.nextFloat();
        if(amt<=acc_balance){
            acc_balance = acc_balance - amt;
            System.out.println("Amount withdrawn");
            System.out.println("\nPress 1 if you wish to continue, 0 to log-out");
            int x = sc.nextInt();
            sc.nextLine();
            if(x == 1){
                System.out.println("Please enter valid amount\n");
                oprations();
            }else{
                System.out.println("Logged out");
            }
        }else{
            System.out.println("Amount entered exceeds the current account balance");
            System.out.println("\nPress 1 if you wish to continue, 0 to log-out");
            int x = sc.nextInt();
            sc.nextLine();
            if(x == 1){
                System.out.println("Please enter valid amount\n");
                oprations();
            }else{
                System.out.println("Logged out");
            }

        }
    }
    public void deposit(){
        System.out.println("Enter the amount : ");
        float amt = sc.nextFloat();
        acc_balance = acc_balance + amt;
        System.out.println("Amount deposited");
        System.out.println("\nPress 1 if you wish to continue, 0 to log-out");
        int x = sc.nextInt();
        sc.nextLine();
        if(x == 1){
            System.out.println("Please enter valid amount\n");
            oprations();
        }else{
        System.out.println("Logged out");
        }
    }
    public void show_balance(){
        System.out.println("Your accout balance is : "+ acc_balance + "\n");
        System.out.println("\nPress 1 if you wish to continue, 0 to log-out");
        int x = sc.nextInt();
        sc.nextLine();
        if(x == 1){
            System.out.println("Please enter valid amount\n");
            oprations();
        }else{
        System.out.println("Logged out");
        }
    }
}

public class atmInterface {
    public static void main(String[] args) {
        ATM a = new ATM();
        a.password_validation();
    }
}
