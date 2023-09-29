

import java.util.Scanner;

public class wordCounter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the scentence : ");
        String s = sc.nextLine();
        
        int wordCount=0;
        boolean indicator = false;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==' ' || s.charAt(i)== '\n' || s.charAt(i) == '\t'){
                indicator=true;
            }
            else if(indicator==true){
                indicator=false;
                wordCount++;
            }
        }
        System.out.println("\nNumber of words in the scentence you entered : ");
        System.out.println(wordCount+1);
        sc.close();
    }
}
