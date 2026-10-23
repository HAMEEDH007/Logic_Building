package LogicBuildingLevel4;
// Take two numbers and check if both are positive and their sum is less than 100.
public class Logic0006{
    public static void main(String[] args) {
        int a= 13;
        int b = 455;
        if(a>=0 && b>=0){
            if(a+b<100){
                int sum = a+b;
                System.out.println("Yes "+ sum);
            }else{
                int sum = a+b;
                System.out.println("The are positive but their sum is greater than 100: " + sum);
            }
        }else{
            int sum = a+b;
            System.out.println("their are negative and their sum is "+ sum);
        }
    }
}