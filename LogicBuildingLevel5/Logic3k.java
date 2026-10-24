package LogicBuildingLevel5;
// Take day and month and check if it forms a valid calendar date (ignoring leap years).
public class Logic3k {
    public static void main(String[] args) {
        int day = 31;
        int month = 3;

        int maxDays =0;

        if(month <1 || month >12){
            System.out.println("Invalid Date");
            return;
        }

        if(month == 2){
            maxDays = 28;
        }else if(month ==4 || month ==6 || month ==9 || month ==11){
            maxDays = 30;
        } else{
            maxDays =31;
        }

        if(day >= 1 && day <= maxDays){
            System.out.println("Valid Date");
        }else {
            System.out.println("Invalid Dat");
        }
    }
}
