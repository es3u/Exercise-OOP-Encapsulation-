public class Main {
    public static void main(String[] args) {
        System.out.println("************ this is Account Class *********");

        Account a = new Account("4400140000" , "Essa ALmutiri" );
        a.setBalance(10000);
        Account a1 =new Account("4400150000" ,"muqrin ALmutiri" , 5000 );
        Account a2 =new Account();

        a.tranferTo(a1,500 );
        a.credit(500);
        a.debit(1000);
        System.out.println("balance Essa: "+a.getBalance());

        a1.credit(20000);
        a1.tranferTo(a2 , 10000);
        System.out.println("balance muqrin: "+a1.getBalance());

        a2.setId("4400160000");
        a2.setFullName("Obaid Almutiri");
        a2.setBalance(3000000);
        a2.debit(5000);
        a2.credit(20000);
        a2.tranferTo(a , 1000000);
        a2.tranferTo(a1 , 1000000);



        System.out.println(a.toString());
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println("************ end the Employee Class *********");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("************ this is Employee Class *********");


        Employee e =new Employee();

        e.setFullName("Essa almutiri");
        e.setId("4400140000");
        e.setSalary(10000);
        e.raisedSalray(1);///The increase here is 100%.
        System.out.println("the salary of Essa is: "+e.getSalary());

        Employee e1 = new Employee("4400150000" , "Muqrin ALmutiri" , 20000);

        e1.setSalary(30000);
        e1.raisedSalray(0.13);
        System.out.println(e1.getId());

        System.out.println(e1.getFullName() +" his salary after the increase: " + e1.getSalary());
        System.out.println("********************************************************************");

        System.out.println(e.toString() +" ,His annual salary is : " + e.getAnnualSalary());

        System.out.println(e1.toString() +" ,His annual salary is : " + e1.getAnnualSalary());




















    }
}