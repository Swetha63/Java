class Employee{
void email(){
System.out.println("Request for leave");
}
void number(int num){
System.out.println("Number of days requested= "+num);
}
String process(String processed){
System.out.println("Request received and accepted by manager: "+processed);
return "Processed";
}
String reply(){
return "Leave approved";
}
}


class Manager{
public static void main(String args[]){
Employee john=new Employee();
john.email();
john.number(1);
System.out.println("Request "+john.process("Yes"));
System.out.println("Final status: "+john.reply());
}
}