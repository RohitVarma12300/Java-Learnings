import java.util.Scanner;

public class Loop {
 public static  void main(String[] args){
     System.out.println("inside Loop");
     //conditional statement
     boolean raining=true;
     if(raining){
         System.out.println("Carry Umbrella");
         //codeA
     }else{
         //codeB
         System.out.println("it's not raining");
     }

     //lets take input from user and on the basis of that print their Grade
     // (91-100) A
     // (81- 90)-B
     // (71 -80) -C
     // below 70 -D

//     Scanner sc= new Scanner(System.in);
//     int marks=sc.nextInt();
     int marks=100;

     if(marks>90){
         System.out.println("Grade A");
     }else if(marks>80  && marks<=90){
         System.out.println("Grade B");
     }else if(marks>70 && marks<=80){
         System.out.println("Grade C");
     }else{
         System.out.println("Grade D");
     }

     //Loop
     // for loop

//     System.out.println("Rohit");
//     System.out.println("Rohit");
//     System.out.println("Rohit");
//     System.out.println("Rohit");
//     System.out.println("Rohit");
//     System.out.println("Rohit");

     for(int i=0;i<5;i++){
         System.out.println("Rohit");

     }
    int j=0;
     while(j<=2){
         System.out.println("while loop");
         j++;
     }

 }
}
