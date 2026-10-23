package LogicBuildingLevel4;
// Take income and age, and check if eligible for tax (age > 18 and income > 5 L)
public class Logic0005 {
    public static void main(String[] args) {
        int income = 6;
        int age = 18;
        if(age>=18 && income > 5){
            System.out.println("Your are eligible to TAX");
        }else{
            System.out.println("You're not eligible to TAX");
        }

    }
}
