class Student{
int id;
float percentage;
static String clg;
static int clg_pincode;
}
class Employee{
int empid;
float salary;
static String company;
}
class VariableDemo{
public static void main(String args[]){
Student rahul=new Student();
rahul.id=1023;
rahul.percentage=56.7f;
Student.clg="THR";
Student.clg_pincode=500062;
System.out.println("Student details");
System.out.println("id="+rahul.id);
System.out.println("Percentage="+rahul.percentage);
}
}