package bai1_4;

public class Main14 {
        public static void main(String[] args) {
            Employee e1 = new Employee(2006, "Quyển", "Vương",1090000);
            System.out.println(e1);
            System.out.println("ID is: " + e1.getID());
            System.out.println("Name is: " + e1.getName());
            System.out.println("Salary is: " + e1.getSalary());
            System.out.println("name is: " + e1.getName());
            System.out.println("annualSalary is: " + e1.getAnnualSalary());
            System.out.println(e1.raiseSalary(10));
        }
    }

