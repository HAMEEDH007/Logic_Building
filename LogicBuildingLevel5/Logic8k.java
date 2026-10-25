package LogicBuildingLevel5;
// Take an integer (1–9999) and check if the sum of its digits is greater than the product
// of its digits.
public class Logic8k {
    public static void main(String[] args) {
        int number = 123;
        int sum =0;
        int product = 1;

        while(number >0){
            int lastDigit = number % 10;
            number /= 10;
            sum += lastDigit;
            product *=lastDigit;
        }
        // System.out.println(sum);
        // System.out.println(product);
        if(sum  == product) {
            System.out.println("both product and sum are equal");
        }else if(sum > product){

            System.out.println("sum is greater than product");
        }else{
            System.out.println("product is greater than sum");
        }
    }
}
