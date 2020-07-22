import java.util.Scanner;

class Condtn3{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter string:");
String txt=sc.next();
switch(txt){
 case "upcase" :
   System.out.println("All characters in string will be in upper case");
   break;
 case "lowcase" :
   System.out.println("All characters in string will be in lower case");
   break;
 case "pascal" :
   System.out.println("First character of each word in string will be in upper case");
   break;
 case "camel" :
   System.out.println("First character from second word in string will be in upper case");
   break;
 default :
   System.out.println("No case is specified in string");
}
}
}