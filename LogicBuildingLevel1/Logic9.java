package LogicBuildingLevel1;

import java.util.Scanner;

public class Logic9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the charater to check ");
        char c = sc.next().charAt(0);
        sc.close();
        CheckVowel checkVowel = new CheckVowel(c);

        checkVowel.check();
        
    }
}

class CheckVowel{
    private char c;
    CheckVowel(char c){
        this.c = c;
    }
    private static final char arr [] = {'a','e','i','o','u','A','E','I','O','U'};

    void check(){
        for(int i=0;i<arr.length;i++){
            if(this.c == arr[i]){
                System.out.printf("%c is a vowel",this.c);
                return;
            }
        }
        System.out.printf("%c is a consonant",this.c);
        return;
    }

}