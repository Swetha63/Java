class Optr3{
public static void main(String args[]){
int x=6,y=7,a=3,b=5;

System.out.println(x&y);//0110-----return 6
System.out.println(x|y);//0111-----return 7
System.out.println(x^y);//0001-----return 1

System.out.println(a&b);//0001-----return 1
System.out.println(a|b);//0111-----return 7
System.out.println(a^b);//0110-----return 6
}
}
