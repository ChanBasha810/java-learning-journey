public class NestedIf{
    public static void main(String[] args){
        int age = 20;
        boolean hasId = true;
        if (age >= 18){
            if (hasId){
                System.out.println("You can enter the club.");
            }else{
                System.out.println("You need an ID to enter.");
            }
        }else{
            System.out.println("You are underage.");
        }
    }
}
