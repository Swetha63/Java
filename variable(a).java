class Patient{
int id;
float bill_amount;
static String hosp_name;
static int hosp_pincode;
}
class Doctor{
int doc_id;
float salary;
static String company;
}
class PracticeDemo{
public static void main(String args[]){
Patient john=new Patient();
john.id=1023;
john.bill_amount=2300.75f;
john.hosp_name="Yashoda";
john.hosp_pincode=400052;

Doctor arman=new Doctor();
arman.doc_id=1122;
arman.salary=555000.48f;

System.out.println("Patient details");
System.out.println("id="+john.id);
System.out.println("Bill amount="+john.bill_amount);
System.out.println("Doctor details");
System.out.println("doc_id="+arman.doc_id);
System.out.println("Doctor salary="+arman.salary);
}
}