package LogicBuildingLevel3;

public class Logic004 {
    public static void main(String[] args) {
        int number = 100;
        int count =0;
        while(number >0){
            number /= 10;
            count++;
        }
        // System.out.println(count);
        if(count == 1){
            System.out.println("Single digit ");
        }
        else if(count == 2){
            System.out.println("double digit ");
        }
        else{
            System.out.println("Multi digit ");
        }
       
    }
}
