package LogicBuildingLevel1;

// Take Three numbers and Print the largest number

import java.util.Scanner;

public class Logic7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int i = sc.nextInt();

        System.out.println("Enter Secound number:");
        int j = sc.nextInt();
        
        System.out.println("Enter third number:");
        int k = sc.nextInt();

        if(i > j && i > k ){
            System.out.printf("%d is the largest number in these three numbers:",i);
        }
        else if(j>i && j>k){
            System.out.printf("%d is the largest number in these three numbers:",j);            
        }
        else{
            System.out.printf("%d is the largest number in these three numbers:",k);
        }
        sc.close();

    }
}
