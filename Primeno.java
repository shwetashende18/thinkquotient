class Primeno
{
public static void main(String[] args)
{
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("enter the no");
int n=scn.nextInt();
int a=1;
for(int i=2;i<n;i++)
{
if(n%i==0)
{
a=0;
break;
}
}
if(a==1)
{
System.out.println("number "+n+" is a prime no");
}
else
{
System.out.println("number "+n+" is not a prime no");
}
}
}