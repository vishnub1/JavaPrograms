// implementation of interface progrmas include
// SimMainFile
//Airtel1
//Vodafone1
//Jio1

class Airtel implements SimMainFile {
	public void call(){
		System.out.println("this is calla from Airtel");
	}
	public void sms(){
		System.out.println("SMS from Airtel");
	}
}
	
class Airtel1 {
	public static void main(String[] args){
		Airtel a1 = new Airtel();
		a1.call();
		a1.sms();
	}
}

