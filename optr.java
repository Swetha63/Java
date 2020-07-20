class Optr{
public static void main(String args[]){
int x=5,y,y1,y2,y3;
y=++x;//x=6,y=6----pre increment
System.out.println(x);
System.out.println(y);
y1=x++;//x=7,y1=6----post increment
System.out.println(x);
System.out.println(y1);
y2=--x;//x=6,y2=6-----pre decrement
System.out.println(x);
System.out.println(y2);
y3=x--;//x=5,y3=6------post decrement
System.out.println(x);
System.out.println(y3);
}
}