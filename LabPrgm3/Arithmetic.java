import java.util.Scanner;

public class Arithmetic {
    Arithmetic() {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the value of a");
            a = sc.nextInt();
            System.out.println("Enter the value of b");
            b = sc.nextInt();
            sc.close();
            if (b == 0)
                throw new ArithmeticException(" Divide by Zero Error");
            c = a / b;
            System.out.println("value of a is: " + a);
            System.out.println("value of b is: " + b);
            System.out.println("a/b is: " + c);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    public static void main(String srgs[]) {
        new Arithmetic();
    }
}
