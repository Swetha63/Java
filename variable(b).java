class Customer{
int order_id;
float bill_amount;
int num_orders;
static String company_name;
static int company_pincode;
}
class Sales_executive{
int emp_id;
float salary;
static String company;
}
class PracticeDemo2{
public static void main(String args[]){
Customer rahul=new Customer();
rahul.order_id=553302;
rahul.bill_amount=3500.56f;
rahul.num_orders=6;
rahul.company_name="Car Gurus";
rahul.company_pincode=500062;

Sales_executive jeffery=new Sales_executive();
jeffery.emp_id=5533;
jeffery.salary=78034.56f;

System.out.println("****Customer details******");
System.out.println("id="+rahul.order_id);
System.out.println("Bill amount="+rahul.bill_amount);
System.out.println("*******Sales executive details*****");
System.out.println("emp_id="+jeffery.emp_id);
System.out.println("Sales executive salary="+jeffery.salary);
}
}