import java.util.Scanner;
class word{
String name;
void words()
{
    System.out.println("Details of the string that you've entered ");
Scanner sc=new Scanner(System.in);
name=sc.nextLine();

}}
class vowcos extends word{
int vow=0,cons=0,i;
char c;
void vowels()
{


for (i=0;i<name.length();i++)
{
 c=name.charAt(i);
if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')

{
vow++;}
else
{
cons++;}}
System.out.println("The total number of vowels are "+vow);
System.out.println("The total number of consonants are "+cons);
}
}

class length extends vowcos {

void lnth()
{

System.out.println("The length of string is "+name.length());
}
public static void main(String args[])
{
    System.out.println("Enter the string");

length len=new length();
len.words();
len.vowels();
len.lnth();
}}












































