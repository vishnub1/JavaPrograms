// find the compile time errors in the program

class Example4 {
	void m1() {}
	void m2() {return;}
//	void m3() {return 10;}  // error: incompatible types: unexpected return value
//	int m4(){}                  java:5: error: missing return statement
	
//	int m5(){return;}        error: incompatible types: missing return value
	int m6(){return 10;}
	int m7(){return 'a';}
//	int m8(){return 10.323;}    error: incompatible types: possible lossy conversion from double to int
 //   int m9(){return true;}      error: incompatible types
}