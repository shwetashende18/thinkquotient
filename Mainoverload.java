class Mainoverload
{
public static void main(String[] args)
{
System.out.println("main starts");
main(83.99);
main();
System.out.println("main ends");
}
public static void main(double args)
{
System.out.println("main with double argument no="+args);
}
public static void main()
{
System.out.println("main with no argument");
}
}