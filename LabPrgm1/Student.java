import java.util.Scanner;

class Student
  {
    String usn;
    String name;
    String branch;
    int phone;
    Student(String usn, String name, String branch, int phone)
    {
      this.usn = usn;
      this.name =name;
      this.branch = branch;
      this.phone = phone;
    }
    public static void main(String args[])
    {
      Scanner s1 = new Scanner(System.in);
      Student s[] = new Student[5];
      String usn;
      String name;
      String branch;
      int phone;
      int n;
      System.out.println("Enter the numer of students: ");
      n = s1.nextInt();
      System.out.println("Enter student's details: USN NAME BRANCH PHONENO");
      for(int i=0; i<n;i++)
        {
          usn = s1.next();
          name = s1.next();
          branch = s1.next();
          phone = s1.nextInt();
          s[i] = new Student(usn, name, branch, phone);
        }
          System.out.println("Student's Details : ");
          System.out.println("USN\t NAME\t BRANCH\t PHONENO");
          for(int i=0; i<n; i++)
            {
              System.out.println(s[i].usn+ "\t "+s[i].name+ "\t "+s[i].branch+ "\t "+s[i].phone);              
            }          
        s1.close();
    } 
  }
