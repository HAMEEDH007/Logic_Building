package LogicBuildingLevel1;

// 8. Take a temperature value and print “Cold”,“Warm”, or “Hot” using range conditions.

import java.util.Scanner;

public class Logic8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Tempature around you");
        int  i = sc.nextInt();
        if(i >= 0 && i < 20){
            System.out.printf("%d is a cold tempature",i);

        }else if(i < 20 && i <= 30){
            System.out.printf("%d is a warm tempature",i);
        }else if (i > 30 ){
            System.out.printf("%d is a HOT tempature",i);
        }
        sc.close();
    }
}
