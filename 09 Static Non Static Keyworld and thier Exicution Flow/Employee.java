class Employee {
	int eid;
	String ename;
	String company;

	public String toString(){
		return "eid     "+eid+"\n"+
			"ename    "+ename+"\n"+
			"company  "+company+"\n";
	}
	public static void main(String[] args){
		Employee e1 = new Employee();
			e1.eid=124;
			e1.ename="vishnu biradar";
			e1.company="DY Patil";
			System.out.println(e1);
	}
	
}