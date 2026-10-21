package LogicBuildingLevel1;




import java.util.Scanner;


public class Logic1{
    public static void main(String []agrs){
        Scanner sc = new Scanner(System.in);
        int i;
       System.out.println("Please Enter your number:");
       i = sc.nextInt();

       if(i <0){
        System.out.println("Negative");
       }
       else if(i ==0){
        System.out.println("Neutral");
       }
       else{
        System.out.println("Positive");
       }
       sc.close();

    }
}