class student{
int id=123;
String name="Kajal";
}
public class collegestudent extends student
{
String course="MCA";
public void display()
{
System.out.println("student id="+id);
System.out.println("student name="+name);
System.out.println("student course="+course);
}
public static void main(String args[])
{
collegestudent obj=new collegestudent();



obj.display();
}}