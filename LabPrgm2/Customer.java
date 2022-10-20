import java.util.Scanner;
import java.util.StringTokenizer;

public class Customer {
    int Display() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Customer Data");
        String data = sc.nextLine();
        StringTokenizer st = new StringTokenizer(data, "/");
        System.out.print("Customer Data is ");
        while (st.hasMoreTokens()) {
            String val = st.nextToken();
            System.out.print(val);
            if (st.countTokens() != 0)
                System.out.print("," + " ");
        }
        sc.close();
        return 0;
    }

    public static void main(String[] args) {
        Customer c = new Customer();
        c.Display();
    }
}