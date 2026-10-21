package LogicBuildingLevel1;

// Take two numbers and print the larger one.

import java.util.Scanner;

public class Logic6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int i = sc.nextInt();
        System.out.println("Enter secound number:");
        int j = sc.nextInt();
        if(i > j ){
            System.out.printf("The Largest Number in these Two numbers is: %d",i);
        }
        else{
            System.out.printf("The Largest number in these Two number is: %d",j);
        }
        sc.close();
    }
}
