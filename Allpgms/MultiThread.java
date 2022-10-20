import java.util.Random;

class Square implements Runnable {
    public int x;
    public Square(int x) {
        this.x = x;
    }
    public void run() {
        System.out.println("Square of " + x + " is: " + x * x);
    }
}

class Cube implements Runnable {
    public int x;
    public Cube(int x) {
        this.x = x;
    }
    public void run() {
        System.out.println("Cube of " + x + " is: " + x * x * x);
    }
}

class JavaThread extends Thread {
    public void run() {
        int num = 0;
        Random r = new Random();
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(1000);
                System.out.println("--------------------------------------");
                num = r.nextInt(10);
                System.out.println("Random Number Generated is " + num);
                Thread t1 = new Thread(new Square(num));
                t1.start();
                Thread t2 = new Thread(new Cube(num));
                t2.start();
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}

public class MultiThread {
    public static void main(String args[]) {
        JavaThread j = new JavaThread();
        j.start();
    }
}
