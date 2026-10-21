package LogicBuildingLevel1;

//  Take a character and check whether it’s uppercase, lowercase, a digit, or a special character

import java.util.Scanner;

public class Logic10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Character you want to check:");

        Character c = sc.next().charAt(0);
        CharacterCheck charactercheck = new CharacterCheck(c);
        charactercheck.check(c);
        
    }
}

class CharacterCheck{
    private Character c;

    CharacterCheck(Character c){
        this.c = c;
    }
    void check(char c){
        if (Character.isUpperCase(c)) {
            System.out.println("Uppercase letter");
        } else if (Character.isLowerCase(c)) {
            System.out.println("Lowercase letter");
        } else if (Character.isDigit(c)) {
            System.out.println("Digit");
        } else {
            System.out.println("Special character");
        }
    }
}