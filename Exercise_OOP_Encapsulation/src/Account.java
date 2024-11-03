public class Account {

    private String   id ;
    private String fullName;
    private int balance = 0 ;


    //////////////////constauct

    Account(){

    }
    Account(String id , String fullName ){
        this.id = id ;
        this.fullName = fullName;

    }

    Account(String id ,String fullName , int balance ){

        this.id = id ;
        this.fullName = fullName;
        this.balance = balance;
    }

//////////////seter////////////////////
    public void setId(String id) {
        if(id.length() == 10)
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setBalance(int balance) {
        if(balance>=0)
        this.balance = balance;
        else System.out.println("please enter correct number");
    }
    /////////////geter///////////////


    public String getId() {
        if(id.length()<10)
        return "please Enter correct id ";
        else
            return id;

    }

    public String getFullName() {
        return fullName;
    }

    public int getBalance() {
        return balance;
    }
   ///////////////////////////////////////////////////////////

    public int credit(int amount){
         return balance +=amount;
    }

    public int debit(int amount){
        return balance-=amount;
    }

    public int tranferTo(Account a , int amount){

       balance-=amount;
        return a.balance +=amount;
    }


    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
