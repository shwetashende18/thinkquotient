class Methodoverloading
{
public static int add(int a,int b,int c,int d)
{
return a+b+c+d;
}

public static double add(double d1,double d2,double d3,double d4)
{
return d1+d2+d3+d4;
}

public static void main(String[] args)
{
System.out.println("main starts");
System.out.println("sum="+add(20,40,20,80));

System.out.println("sum="+add(20.20,40.60,80.43,42.99));
System.out.println("main ends");
}

}