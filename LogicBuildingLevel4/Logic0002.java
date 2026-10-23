package LogicBuildingLevel4;
// Take a number and print "Fizz" if divisible by 3, "Buzz " if divisible by 5 and "FizzBuzz" if divisible by both.
public class Logic0002 {
    public static void main(String[] args) {
        int a = 15;
        if(a % 3 == 0 && a % 5 ==0){
            System.out.println("FizzBuzz");
        }else if(a % 3 ==0){
            System.out.println("Fizz");
        }else if(a % 5 ==0 ){
            System.out.println("Buzz");
        }
    }
}
