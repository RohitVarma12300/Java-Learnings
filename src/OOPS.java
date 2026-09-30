public class OOPS {
    public  void main(String[] args){

        //creata abankaccount object
        BankAccount ba1= new BankAccount(1000);
//        ÷System.out.println(ba1.balance);
        //ba1.balance=-100;
        // we will be able to see our balance if this is our account
       if(userauthencticate()){
          int currBalance= ba1.getbalance();
          System.out.println(currBalance);
       }

       // creating an object of dog
        Dog d1= new Dog();
        d1.eat();
        d1.drink();

        // runtime polymorphism
        square sq1= new square();
        sq1.sides();

        // creating an object of ADdd
        //complie time polymorphism
        Add sum= new Add();
        sum.add(3,4);
        sum.add(1,2,3);

        // lets create car and electric car object
        Vehicle car =new Car();
        car.startEngine();

        Vehicle electirCar = new ElectricCar();
        electirCar.startEngine();

    }

    //Polymorphism - when a method have many form (have same name)

    class Shape{
        void sides(){
            System.out.println("Unknown");
        }
    }

    class square extends Shape{
        @Override
        void sides(){
            System.out.println("Square has 4 sides");
        }
    }

    class Add{
        void add(int a, int b){
            int result=a+b;
            System.out.println(result);
        }
        void add(int a,int b ,int c){
            int result =a+b+c;
            System.out.println((result));
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

    //Inheritance -> passing some properties from parent ot child

    class Animals {
        void eat(){
            System.out.println("Eating from Animal");
        }
        void drink(){
            System.out.println("Drinking form Animal");
        }
    }
     class Dog extends Animals {
        void bark(){
            System.out.println("Dog Barks");
        }
    }


//Abstraction - hidden complex details from the user

    abstract class Vehicle{
        //just startEngine no details
         abstract void startEngine();
    }


    class Car extends Vehicle{

        @Override
        void startEngine() {
            //how it actually strat is hidden here
            System.out.println("Turn key to start your car");
        }
    }

    class ElectricCar extends Vehicle{
        //whenever we extend a abstract class we have to implement the abstract method
        @Override
        void startEngine() {
            //
            System.out.println("Press start button to strat youe electric car");
        }
    }

    //interfaces
    interface Payment{
        void pay();
        void credit();
    }

    class CreditCard implements Payment {
        @Override
        public void pay() {
            //implementation will be done here
        }
        @Override
        public void credit(){

        }
    }
    class OnlinePayment implements Payment{

        @Override
        public void pay() {

        }

        @Override
        public void credit() {
    //any functionality of the online payment for credit
        }
    }

}
