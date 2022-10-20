import java.io.IOException;
import java.util.Scanner;

class Stack{
    private int top;
    private int item[];

    Stack(int size) {
        top = -1;
        item = new int[size];
    }

    void pushItem(int data) {
        if (top == item.length - 1) {
            System.out.println("Stack is Full");
        } else {
            item[++top] = data;
            System.out.println("Pushed Item :" + item[top]);
        }
    }

    int popItem() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            System.out.println("Pop Item : " + item[top]);
            return item[top--];
        }
    }

    public void displayStack() {
        if (top >= 0) {
            System.out.println("Elements in stack are:");
            for (int i = 0; i <= top; i++) {
                System.out.println(item[i]);
            }
        } else {
            System.out.println("Stack is Empty");
        }
    }
}

class StackExample {
    public static void main(String[] args) throws IOException
    {
        Stack stk = new Stack(5);
        boolean yes=true;
        int choice;
        Scanner s=new Scanner(System.in);
        do
        {
            System.out.println("\n");
            System.out.println("1).Push\n2).Pop\n3).Display\n4).Exit\n\nEnter Choice");
            choice = s.nextInt();
            switch(choice)
            {
                case 1: System.out.println("Enter Push Item: ");
                stk.pushItem(s.nextInt());
                break;
                case 2: stk.popItem();break;
                case 3: stk.displayStack();break;
                case 4: System.exit(0);break;
                default: System.out.println("Invalid Choice");
            }
        }while(yes==true);
        s.close();
        }
}
