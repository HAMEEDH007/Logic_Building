// 1. Take three sides and check if they form a valid triangle.
package LogicBuildingLevel2;

import java.util.Scanner;

public class Logic01 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter First Side Of Triangle : ");
        int a = sc.nextInt();
        System.out.println("Enter Second Side Of Triangle : ");
        int b = sc.nextInt();
        System.out.println("Enter Third Side Of Triangle : ");
        int c = sc.nextInt();

        if( a+b > c && a+c >b && b+c >a) {
            System.out.println("Vaild Triangle can form");
        }
        else{
            System.out.println("Vaild Triangle can't form");
        }
        
        
    }
}
