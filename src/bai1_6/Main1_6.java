package bai1_6;

public class Main1_6 {
        public static void main(String[] args) {
            account a1 = new account("A9", "Quyển", 26);
            System.out.println(a1);
            account a2 = new account("A4", "Thư");
            System.out.println(a2);
            System.out.println( "id: " + a1.getId() );
            System.out.println("name: " + a1.getname());
            System.out.println("balance: " + a1.getbalance());
            a1.credit(100);
            System.out.println(a1);
            a1.debit(50);
            System.out.println(a1);
            a1.debit(500);
            System.out.println(a1);
            a2.transferTo(a2, 100);
            System.out.println(a1);
            System.out.println(a2);
        }
    }

