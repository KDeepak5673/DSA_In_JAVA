

public class Class_Object {
    public static void main(String[] args) {

        Student Deepak = new Student();

        Deepak.rno = 98;
        Deepak.name = "Deepak Kumar";
        Deepak.marks = 9.87f;

        System.out.println(Deepak.rno);
        System.out.println(Deepak.name);
        System.out.println(Deepak.marks);

        Student S2 = new Student(88 , "Subhadeep Haldar" , 8.46f);

        System.out.println(S2.rno);
        System.out.println(S2.name);
        System.out.println(S2.marks);

        Student S3 = new Student();

        System.out.println(S3.name);

    }
}

//Creating a class
//for every single student
class Student{
    int rno;
    String name;
    float marks;

    Student(){
        this(00 , "Please Enter Any Name" , 0.0f);
    }
    Student(int Rno , String Name , float Marks ){
        this.rno = Rno;
        this.name = Name;
        this.marks = Marks;
    }
}