package Assignment2;

public class Overloading {
	
	public int add(int a,int b) {
		return a+b;
	}
	public int add(int a,int b,int c) {
		return a+b;
	}
	public double add(Double a,Double b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		
		Overloading overloading=new Overloading();
		System.out.println(overloading.add(11, 220));
		
		System.out.println(overloading.add(100, 400, 550));
		
		System.out.println(overloading.add(50.55, 77.66));
	}

}
