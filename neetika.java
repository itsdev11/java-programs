import java.util.Scanner;
class pattern{
public static void main(String args[])
{
int i,j;
Scanner sc=new Scanner(System.in);

System.out.println("enter the string for pyramid");

String m= sc.nextLine();

StringBuilder n=new StringBuilder(m);
for(i=0;i<=n.length()-1;i++)
{
for(j=0;j<=i;j++)
{
System.out.print(n.charAt(j)+" ");

}
System.out.println("");
}}}

