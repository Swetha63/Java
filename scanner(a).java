import java.util.Scanner;
class Patient{
int id;
float bill_amount;
static String hosp_name;
static int hosp_pincode;
}

class Doctor{
int doc_id;
float salary;
static String hosp_name;
static int hosp_pincode;
}

class Scnr_a_Demo{
public static void main (String args[]){
Patient john=new Patient();
Doctor arman=new Doctor();
Scanner sc=new Scanner(System.in);

System.out.println("Enter patient details:");
john.id=sc.nextInt();
john.bill_amount=sc.nextFloat();
john.hosp_name=sc.next();
john.hosp_pincode=sc.nextInt();
System.out.println("Patient id="+john.id);
System.out.println("Patient bill amount="+john.bill_amount);
System.out.println("Hospital name="+john.hosp_name);
System.out.println("Hospital pin code="+john.hosp_pincode+"\n");

System.out.println("Enter doctor details:");
arman.doc_id=sc.nextInt();
arman.salary=sc.nextFloat();
arman.hosp_name=sc.next();
arman.hosp_pincode=sc.nextInt();
System.out.println("Doctor id="+arman.doc_id);
System.out.println("Doctor salary="+arman.salary);
System.out.println("Hospital name="+arman.hosp_name);
System.out.println("Hospital pin code="+arman.hosp_pincode);
}
}