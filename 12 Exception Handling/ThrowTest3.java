package ExceptionHandling;

import java.security.PublicKey;

class UserDefinedException extends Exception {  
    public UserDefinedException(String str){  
        super(str);  
    }  
}  
// Class that uses above MyException  
public class ThrowTest3 {  
    public static void main(String[] args) {  
        try {  
            // throw an object of user defined exception  
            throw new UserDefinedException("This is user-defined exception");  
        }  
        catch (UserDefinedException ude) {  
            System.out.println("Caught the exception");  
            System.out.println(ude.getMessage()); 
        
        }  
    }  
}

//Caught the exception
//This is user-defined exception