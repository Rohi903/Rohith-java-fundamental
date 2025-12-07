public class BankingSystem {

    public static void main(String[] args) {
        Bank user1 = new Bank(); // object for Bank class  for user 1
        user1.add(101, "mohit", 20000);
        user1.deposit(100000);
        user1.withDraw(40000);
        user1.enquiry();

        Bank user2 = new Bank();// object for Bank class for user 
        user2.add(1012, "Rohith", 10000);
        user2.deposit(20000);
        user2.withDraw(5000);
        user2.enquiry();

    }

   
    
}



  class Bank{
    int accountNo; // 53565672
    String name; // xyz
    int balance; // 50000.35 = 50000

    Bank (){ // blank argument 
    }


    Bank(String name){
        
    }

    void add(int accountNo, String name, int balance){
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
    }


    void deposit(int amount){
        balance =  balance+ amount;
    }


    void withDraw(int amount){
       if( balance > amount){
        balance = balance - amount;
       } else {
        System.out.println("Insufficient Balance");
       }
    }

    void enquiry(){
        System.out.println(" Name : " +name);
        System.out.println("Account number: "+accountNo);
        System.out.println("Balance:" +balance);
        System.out.println("*******");

    }
}
