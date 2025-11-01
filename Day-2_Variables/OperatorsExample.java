public class OperatorsExample{
    public static void main(String[] args){
        int a = 10, b = 5;
        System.out.println("Add: " + (a + b));
        System.out.println("Sub: " + (a - b));
        System.out.println("Mul: " + (a * b));
        System.out.println("Div: " + (a / b));
        System.out.println("Remainder: " + (a % b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));
        boolean x = true;
        boolean y = false;
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
        String result = (a > b) ? "a is greater" : "b is greater";
        System.out.println(result);
    }
}
