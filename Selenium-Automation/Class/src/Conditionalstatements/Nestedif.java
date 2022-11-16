package Conditionalstatements;

public class Nestedif {

	public static void main(String[] args) {
		
		int a= 20;
		int b= 30;
		 
		if(a<b){
		System.out.println("if1");
		}
		
		if(a>b) {
			System.out.println("if2");
			
		if(a>b) {
			
		System.out.println("if3");
		
		}
		
		else {
		
		System.out.println("else1");
		}
	
	
		
		System.out.println("else2");
		
		}
		else {
			System.out.println("else");
		}
		
		
			
		

	}

}
