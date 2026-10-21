package LogicBuildingLevel1;

// Check if a number is divisible by both 3 and 5.

import java.util.Scanner;

public class Logic4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a number to check");
        int i = sc.nextInt();
        if(i % 3 ==0 & i % 5 ==0 ){
            System.out.printf("%d is divisible by both 3 and 5",i);

        }
        else{
            System.out.printf("%d is not divisible by 3 and 5",i);
        }
        sc.close();

    }
}
