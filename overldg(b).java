class Employee{
void email(){
System.out.println("Request for leave");
}
void info(int num){
System.out.println("Number of days requested= "+num);
}
void info(int num, String reason){
System.out.println("Reason for "+num+"day leave request: "+reason);
}
String process(String processed){
System.out.println("Request received and accepted by manager: "+processed);
return "Processed";
}
void info(int num, float ded){
System.out.println("Pay deducted for "+num+ "day leave = "+ded);
}
String reply(){
return "Leave approved";
}
}


class Manager{
public static void main(String args[]){
Employee john=new Employee();
john.email();
john.info(1);
john.info(1, "Fever");
System.out.println("Request "+john.process("Yes"));
john.info(1,240.45f);
System.out.println("Final status: "+john.reply());
}
}