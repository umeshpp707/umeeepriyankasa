package constructor;

public class class10 {

	int a=10;
	float b;

	class10(){
		
	}
	 
	class10(int c){
		 a=c;
		 b=100f;
		 
	}
	class10(int c, String s){
		this.a=c;
		b=200f;
		
	}
	 class10(int a, float b){
		 this.a=a;
		 this.b=b;
		 
	 }
	public static void main(String [] args ) {
		
		class10 cc1=new class10();
		System.out.println(cc1.a);
		System.out.println(cc1.b);
		
		class10 cc2=new class10(100);
		System.out.println(cc2.a);
		System.out.println(cc2.b);
		
		class10 cc3=new class10(200,"class");
		System.out.println(cc3.a);
		System.out.println(cc3.b);
		
		class10 cc4 =new class10(1000,200.00f);
		System.out.println(cc4.a);
		System.out.println(cc4.b);
		 
		
		
	}
	

}

	

