public class Class_Object {
    public static void main(String[] args){
        String studentname ="Anand";
        int studentage=20;
        int studentMarks =90;
        String House ="Yellow";

        //object s1 is created using Student class
        Student s1= new Student("Rohit",25,98 );
        s1.printDetails();

        Student s2= new Student("Shubam", 28, 99);
        s2.printDetails();
        Student s3= new Student("RAJU", 35,87);


        //change the marks of student 3 from 87 to 91
        s3.changeMarks(91);
        s3.changeAge(45);
        s3.printDetails();
        //create new method in Student class , which will help us to change the age of student


    }
    static class Student{
        //this will refer to variables and method inside Student class
        String name;
        int age;
        int marks;
        Student(String name,int age,int mark)
        {
            this.name =name;
            this.age =age;
            marks =mark;
        }

        void printDetails(){
            System.out.println("Student name is "+ this.name +" and he/she is "+this.age +"years old and secured "+this.marks +" percent");
        }

        void changeMarks(int newMarks){
            this.marks =newMarks;
        }
        void changeAge(int newAges){
            this.age =newAges;}
    }
}
