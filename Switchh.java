class Switchh
{
public static void main(String[] args)
{
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("enter operation");
String oper=scn.next();
System.out.println("enter 1st");
int a=scn.nextInt();
System.out.println("enter 2nd");
int b=scn.nextInt();
switch(oper)
{
case "add":
System.out.println("sum of "+a+" and "+b+" is"+(a+b));
break;
case "sub":
System.out.println("sum of "+a+" and "+b+" is"+(a-b));
break;
case "mul":
System.out.println("sum of "+a+" and "+b+" is"+(a*b));
break;
case "div":
System.out.println("sum of "+a+" and "+b+" is"+(a/b));
break;
}
}
}