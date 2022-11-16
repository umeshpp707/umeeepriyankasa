package constructor;

public class class2 {

	int a=10;
	float b;
	

	
	class2(){
		
	}

	class2(int c) {
		  a=c;
		 b=200f;
	}
	 class2(int c, String s){
		  this.a=c;
		  b= 500f;
				  
	 }
	class2(int a,float b){
		this.a=a;
		this.b=b;
		
	}
 public static void main(String[] args) {
	  
	 class2 ref1=new class2();
	 System.out.println(ref1.a);
	 System.out.println(ref1.b);
	 
	  class2 ref2 =new class2(100);
	  System.out.println(ref2.a);
	  System.out.println(ref2.b);
	  
	   class2 ref3=new class2(100,"class");
	   System.out.println(ref3.a);
	   System.out.println(ref3.b);
	   
	   class2 ref4=new class2(1000,500.00f);
	   System.out.println(ref4.a);
	   System.out.println(ref4.b);
	   
	   
	   
	   
 }
}
