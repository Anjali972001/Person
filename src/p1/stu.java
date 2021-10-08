package p1;

public class stu extends Person {
    int marks;
    int roll_no;

    public stu(int marks, int roll_no ,int age,String name) {
        super(age,name);
        this.marks = marks;
        this.roll_no = roll_no;
        // this.age=age;
       // this.name=name;

    }
}
