import java.util.Scanner;
class Student{
int id;
float percentage;
static String clg;
static int clg_pincode;
}
class Employee{
int empid;
float salary;
static String cmpy_name;
}
class ScnrDemo{
public static void main(String args[]){
Student rahul=new Student();
Employee varma=new Employee();
Scanner sc=new Scanner(System.in);
System.out.println("Enter student details below:");
rahul.id=sc.nextInt();
rahul.percentage=sc.nextFloat();
Student.clg=sc.next();
Student.clg_pincode=sc.nextInt();
System.out.println("*****Student details*****");
System.out.println("id="+rahul.id);
System.out.println("percentage="+rahul.percentage);
System.out.println("college name="+rahul.clg);
System.out.println("college pincode="+rahul.clg_pincode+"\n");
System.out.println("Enter employee details below:");
varma.empid=sc.nextInt();
varma.salary=sc.nextFloat();
varma.cmpy_name=sc.next();
System.out.println("*****Employee details*****");
System.out.println("Emloyee id="+varma.empid);
System.out.println("Employee salary="+varma.salary);
System.out.println("Employee company name="+varma.cmpy_name);
}
}