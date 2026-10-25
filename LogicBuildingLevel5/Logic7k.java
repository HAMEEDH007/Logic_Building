package LogicBuildingLevel5;
// Take a 3-digit number and check if the sum of the first and last digit equals the middle digit.
public class Logic7k {
    public static void main(String[] args) {
        int number = 132;
        int first = number /100;
        int last = number % 10;
        int middle = (number /10 ) % 10;
        if(first + last == middle ) {
            System.out.printf("Yes first %d + last %d = %d ",first,last,middle);
        }else {
            System.out.println("The middle element is not same");
        }
    }
}
