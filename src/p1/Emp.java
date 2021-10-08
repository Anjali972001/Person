package p1;

public class Emp extends Person{
    int eid;
    int sal;
    public Emp(int eid , int sal, int age , String name)
    {
        super(age,name);
        //to perform constructor chaining within the class we use super
        //we can utilize it only in constructor not inside any method.
        //used to reduce redundancy.

        this.eid =eid;
        this.sal =sal;
         //this.age =age;
        //this.name=name;
    }


}
