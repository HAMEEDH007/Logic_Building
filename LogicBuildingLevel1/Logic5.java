package LogicBuildingLevel1;

// Check if a given year is a leap year.

import java.util.Scanner;

public class Logic5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a Number to check leap year");
        int i = sc.nextInt();
        if(i % 4 ==0 ){
            System.out.printf("%d is a leap year",i);
        }
        else{
            System.out.printf("%d is not a leap year",i);
        }

        sc.close();
    }
}
