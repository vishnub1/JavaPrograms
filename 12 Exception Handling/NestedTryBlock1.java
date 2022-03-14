package ExceptionHandling;
public class NestedTryBlock1 {
	public static void main(String[] args) {
/*
 		======Nested try block======
 		
 in Java. using a try block inside another try block is permitted .
 it is called as nested try block. Every statement that we enter a 
 statement i try block , context of that exception is pushed onto the stack.		
		
 for example the inner try block can be used to handle ArrayaindecOutOfBoundsException
 while the outer try block can handle the ArithemeticException.
 
 =====Q) Why use nested try block?
 
 Sometimes a situation may arise where a part of block may cause one error and
 the entire block itself may cause another error.in such cases, exception handlers
 have to be nested.
 
 //main try block  
try    
{    
    statement 1;    
    statement 2;    
//try catch block within another try block  
    try    
    {    
        statement 3;    
        statement 4;    
//try catch block within nested try block  
        try    
        {    
            statement 5;    
            statement 6;    
     }    
        catch(Exception e2)    
        {    
//exception message  
        }    
  
    }    
    catch(Exception e1)    
    {    
//exception message  
    }    
}    
//catch block of parent (outer) try block  
catch(Exception e3)    
{    
//exception message  
}    
 
 
 
 
 
 
 
 
 
 
 
 
  
*/
		System.out.println("Nested try block read the source code.");
	}

}
