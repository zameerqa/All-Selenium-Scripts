package SimpleJavaPgms;

public class JavaMethods {
	static int x,y,z;

	public static void main(String[] args) {
//		m1(10, 5);
//		int q=m2(1,2);
//        System.out.println(q);
		int w=m3();
		System.out.println(w);
	}
	
	/*public static void m1(int x, int y){
		z=x+y;
		System.out.println(z);
	}*/
	
	/*public static int m2(int a, int b){
		
		int c=a+b;
		
		return c;
	}*/
	
	public static int m3(){
		x=10;
		y=20;
		z=x+y;
		return z;
	}

}
