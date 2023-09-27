import java.util.Random;
import java.util.Scanner;


public class numbergame{
    static void game(){
        System.out.println("Game has been started....GoodLuck");
       
        Random rand=new Random();
        Scanner sc=new Scanner(System.in);
        int count=5;
        int genNum = rand.nextInt(100);
        while(count>0){
            
            int userNum =sc.nextInt();
            if(genNum==userNum){
                System.out.println("You won");
                break;
            }else{
                System.out.println("You lost");
                int diff = userNum-genNum;
                if(diff<10 && diff>-10){
                    System.out.println("But you are close...Try Again");
                }
                if(count>1){
                    System.out.println("You have "+(count-1)+" chances left");
                }else{
                    System.out.println("You have "+(count-1)+" chance left");
                }
            }
            count--;
        }
       
    }
    public static void main(String[] args) {
       System.out.print("\n");

        System.out.println("GAME INSTRUCTIONS :");
        System.out.println("Player has to guess the correct number between 1 to 100. ");
        System.out.println("He/She will be given 5 chances.");

        Scanner sc=new Scanner(System.in);
         
        int permission = 1;
        while(permission==1){
            game();
            System.out.print("\n");
            System.out.println("Press 1 to play again and 0 to exit the game : ");
            permission=sc.nextInt();
        }
        if(permission==0){
            System.out.println("Goodbye :)");
        }
        sc.close();
    }
}