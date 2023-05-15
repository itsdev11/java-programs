import java.util.Scanner;
class pattern2{
public static void main(String args[])
{
int i,j;
Scanner sc=new Scanner(System.in);

System.out.println("enter the string for pyramid");

String m= sc.nextLine();


for(i=0;i<=m.length()-1;i++)
{
for(j=0;j<=i;j++)
{
System.out.print(m.charAt(j)+" ");

}
System.out.println("");
}}}

