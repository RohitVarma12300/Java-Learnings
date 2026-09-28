public class OOPS {
    public static void main(String[] args){

        //creata abankaccount object
        BankAccount ba1= new BankAccount(1000);
//        ÷System.out.println(ba1.balance);
        //ba1.balance=-100;
        // we will be able to see our balance if this is our account
       if(userauthencticate()){
          int currBalance= ba1.getbalance();
          System.out.println(currBalance);
       }

    }

//Encapsulation = keeping the data protected
    //we are creating a bank in our code
    static class BankAccount{
         private int balance;
        public int getbalance(){
            return balance;
        }
        //constructor
        BankAccount(int startingbalance){
            this.balance=startingbalance;
        }
    }


    public static boolean userauthencticate(){
        //
        //
        return true;
    }

}
