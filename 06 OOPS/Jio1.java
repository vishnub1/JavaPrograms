// implementation of interface progrmas include
// SimMainFile
//Airtel1
//Vodafone1
//Jio1

class Jio implements SimMainFile {
	public void call(){
		System.out.println("JIo call");
	}
	public void sms(){
		System.out.println("JIO sms");
	}
} 
class Jio1 {
	public static void main(String[] args){
		Jio j1 = new Jio();
		j1.call();
		j1.sms();
	}
}