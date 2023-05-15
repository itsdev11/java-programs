class A
{
int age=15;
String name="dev";
void disply()
{
System.out.println(""+age);
System.out.println(""+name);
}
}

class B extends A
{
int rollno=1234;
void print()
{

System.out.println(""+rollno);
}
}
class Main
{
public static void main(String []args)
{
 
B obj=new B();
obj.disply();
obj.print();
}}
