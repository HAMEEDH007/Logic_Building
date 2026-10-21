package LogicBuildingLevel2;

// 6. Check voting eligibility for a given age (18+).
public class Logic06{
    public static void main(String[] args) {
        int age =17;
        if(age >= 18){
            System.out.println("you are eligibile to vote");
        }
        else {
            System.out.println("you are not eligibile to vote");
        }
    }
}