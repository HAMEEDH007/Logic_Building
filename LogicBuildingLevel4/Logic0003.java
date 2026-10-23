package LogicBuildingLevel4;
// Take three numbers and print the median value (neither maximum nor minimum).
public class Logic0003 {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        int c = 20;
        
        if((a >= b) && (a <= c )){
            System.out.println("Median :"+a);
        }
        else if((b >=a )&& (b <=c) ){
            System.out.println("Median :" +b);
        }else{
            System.out.println("Median :"+c);
        }
    }
}
