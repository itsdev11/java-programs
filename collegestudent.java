class student{
int id=123;
String name="Dev";
}
 class Collegestudent extends student
{
String course="MCA";
void display()

{
System.out.println("student id="+id);
System.out.println("student name="+name);
System.out.println("student course="+course);
}}
class test{
public static void main(String args[])
{
Collegestudent obj=new Collegestudent();



obj.display();
}}