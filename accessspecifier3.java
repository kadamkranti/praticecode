

	
	class accessspecifier3 
	{ 
	   private void display() 
	    { 
	        System.out.println("You are using private access specifier"); 
	    } 
	} 

	public class accessspecifier3 {

		public static void main(String[] args) {
			//private
			System.out.println("Private Access Specifier");
			accessspecifier3  obj = new accessspecifier3(); 
	        //trying to access private method of another class 
	        //obj.display();

		}
	}


	//1. Class is having Default access modifier 
	class defAccessSpecifier
	{ 
	  void display() 
	     { 
	         System.out.println("You are using defalut access specifier"); 
	     } 
	}

