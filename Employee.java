class Employee
{
float sal=60000;
}
class Dev extends Employee
{
float b=1500;
float temp= sal + b;
public static void main(String args[])
{
Dev ob=new Dev();
System.out.println("Salary amount is:"+ob.sal);
System.out.println(" Extra Bonous is:"+ob.temp);
}
}