public class Swaping {
    public static void main(String[] args) {
        int num1=10;
        int num2=20;
        System.out.println("before swaping");
        System.out.println("number1:"+num1);
        System.out.println("number2:"+num2);
        int temp =num1;
        num1=num2;
        num2=temp;
        System.out.println("after swapping");
        System.out.println("number1:"+num1);
        System.out.println("number2:"+num2);
    }
}
