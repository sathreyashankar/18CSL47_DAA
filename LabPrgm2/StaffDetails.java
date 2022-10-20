import java.io.IOException;
import java.util.Scanner;

class Staff {
    int staffid;
    String name;
    long phone;
    float salary;

    Staff(int staffid, String name, long phone, float salary) {
        this.staffid = staffid;
        this.name = name;
        this.phone = phone;
        this.salary = salary;
    }
}

class Teaching extends Staff {
    String domain;
    String publication;

    Teaching(int staffid, String name, long phone, float salary, String domain, String publication) {
        super(staffid, name, phone, salary);
        this.domain = domain;
        this.publication = publication;
    }

    void display() {
        System.out.println(staffid + "\t\t" + name + "\t\t" + phone + "\t" + salary + "\t" +
                domain + "\t" + publication);
    }
}

class Technical extends Staff {
    String skills;

    Technical(int staffid, String name, long phone, float salary, String skills) {
        super(staffid, name, phone, salary);
        this.skills = skills;
    }

    void display() {
        System.out.println(staffid + "\t\t" + name + "\t\t" + phone + "\t" + salary + "\t" +
                skills);
    }
}

class Contract extends Staff {
    int period;

    Contract(int staffid, String name, long phone, float salary, int period) {
        super(staffid, name, phone, salary);
        this.period = period;
    }

    void display() {
        System.out.println(staffid + "\t\t" + name + "\t\t" + phone + "\t" + salary + "\t" +
                period);
    }
}

public class StaffDetails {
    public static void main(String argrs[]) throws IOException
    {
        Staff s[]=new Staff[10];
        boolean yes=true;
        int choice;
        Scanner scn=new Scanner(System.in);
        do
        {
            System.out.println("1).Teaching\n2).Technical\n3).Contract\n4).Exit\n\nEnter Choice");
            choice = scn.nextInt();
            switch(choice)
            {
                case 1:System.out.println("Enter number of teaching staff ");
                int n=scn.nextInt();
                System.out.println("Enter Teaching Staff Details: ID Name Phone Salary Domain Publication");
                for(int i=0;i<n; i++)
                {
                    int id=scn.nextInt();
                    String name=scn.next();
                    long phone=scn.nextLong();
                    float sal=scn.nextFloat();
                    String domain=scn.next();
                    String publ=scn.next();
                    s[i]=new Teaching(id,name,phone,sal,domain,publ);
                }
                System.out.println("StaffID\tName\tPhone\tSalary\tDomain\tPublication");
                for(int i=0;i<n;i++)
                {
                    ((Teaching) s[i]).display();
                }
                break;
                case 2: System.out.println("Enter number of Technical Staff Details");
                int t=scn.nextInt();
                System.out.println("Enter Technical Staff Details: ID Name Phone Salary Skill");
                for(int i=0;i<t;i++)
                {
                    int id=scn.nextInt();
                    String name=scn.next();
                    long phone=scn.nextLong();
                    float sal=scn.nextFloat();
                    String skill=scn.next();
                    s[i]=new Technical(id,name,phone,sal,skill);
                }
                System.out.println("Staff ID\tName\tPhone\tSalary\tSkills");
                for(int i=0;i<t;i++)
                {
                    ((Technical) s[i]).display();
                }
                break;
                case 3: System.out.println("Enter number of Contract Staff");
                int c=scn.nextInt();
                System.out.println("Enter Contract Staff Details: ID Name Phone Salary Period");
                for(int i=0;i<c;i++)
                {
                    int id=scn.nextInt();
                    String name=scn.next();
                    long phone=scn.nextLong();
                    float sal=scn.nextFloat();
                    int period=scn.nextInt();
                    s[i]=new Contract(id,name,phone,sal,period);
                }
                System.out.println("Staff ID\tName\tPhone\tSalary\tPeriod");
                for(int i=0;i<c;i++)
                {
                    ((Contract) s[i]).display();
                }
                break;
                case 4: scn.close();
                System.exit(0);break;
                default:System.out.println("Invalid Choice");
            }
        }while(yes==true);
    }
}