class Factorial
{
public static void main(String[] args)
{
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("enter the number");
int n=scn.nextInt();
int fact=1;
for(int i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println("the factorial of "+n+" is "+fact);
}
}