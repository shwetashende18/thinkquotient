class If1
{
public static void main(String[] args)
{
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("enter 1st no");
int a=scn.nextInt();
System.out.println("enter 2nd no");
int b=scn.nextInt();
if(a>b)
{
System.out.println("a is greater than b");
}
else if(a<b)
{
System.out.println("a is less than b");
}
else
{
System.out.println("a is equal to b");
}

}
}