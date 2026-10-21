package LogicBuildingLevel1;

//  Check if a number is even or odd.

import java.util.Scanner;

public class Logic2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check");
        int i;
        i = sc.nextInt();
        if(i %2 == 0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
        sc.close();
    }
}
