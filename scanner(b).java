import java.util.Scanner;
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
static String company_name;
static int company_pincode;
}

class Scnr_b_Demo{
public static void main (String args[]){
Customer rahul=new Customer();
Sales_executive jeffery=new Sales_executive();
Scanner sc=new Scanner(System.in);

System.out.println("Enter customer details:");
rahul.order_id=sc.nextInt();
rahul.bill_amount=sc.nextFloat();
rahul.num_orders=sc.nextInt();
rahul.company_name=sc.next();
rahul.company_pincode=sc.nextInt();
System.out.println("Customer id="+rahul.order_id);
System.out.println("Customer bill amount="+rahul.bill_amount);
System.out.println("Customer number of orders="+rahul.num_orders);
System.out.println("Company name="+rahul.company_name);
System.out.println("Company pin code="+rahul.company_pincode+"\n");

System.out.println("Enter sales executive details:");
jeffery.emp_id=sc.nextInt();
jeffery.salary=sc.nextFloat();
jeffery.company_name=sc.next();
jeffery.company_pincode=sc.nextInt();
System.out.println("Sales executive id="+jeffery.emp_id);
System.out.println("Sales executive salary="+jeffery.salary);
System.out.println("Company name="+jeffery.company_name);
System.out.println("Company pin code="+jeffery.company_pincode);
}
}