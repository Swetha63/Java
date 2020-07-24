import java.util.Scanner;

class While{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int age=sc.nextInt();
while(age<18){
System.out.println("Age = "+age+";"+"Not eligible to vote");
age++;
}
}
}

/*

String str="FOX";
int i=0;
while(i<str.length())
{
System.out.print(str.charAt(i));
i++;
}

*/