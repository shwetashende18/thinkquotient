class Methodparameter
{
public static void methodname(int a)
{
System.out.println("methodname1 in classname a="+a);
}
public static void methodname1(int a, double d)
{
	System.out.println("methodname1 in classroom1 a="+a+",d="+d);
}
public static void main (String[] args)
{
System.out.println("main start");
methodname(45);
methodname1(123,120.456);
System.out.println("main end");
}
}