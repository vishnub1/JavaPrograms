public class Manager {
   private int managerId;
   private String managerName;
   
   Manager(Employee employee) {//Employee data we are copying to Manager
	   managerId = employee.employeeId;
	   managerName = employee.employeeName;
   }
   
   public void show(){
	   System.out.println("Manager id is :"+managerId);
	   System.out.println("Manager Name is :"+managerName);
   }
}
