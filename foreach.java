import java.util.Scanner;

class ForEach{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String colors[]={"a","b","c","d","e","f","g"};
colors[0]=sc.next();
colors[1]=sc.next();
colors[2]=sc.next();
colors[3]=sc.next();
colors[4]=sc.next();
colors[5]=sc.next();
colors[6]=sc.next();
//String colors[]={"Violet","Indigo","Blue","Green","Yellow","Orange","Red"};
System.out.println("Colors in rainbow are: ");
for(String i:colors){
System.out.println(i);
}
}
}

