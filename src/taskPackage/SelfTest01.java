package taskPackage;

public class SelfTest01 extends SelfTest1{

	public SelfTest01(String a) {
		super(a);
		System.out.println("D");
	}
	
	public SelfTest01(int a) {
		super(a);
		System.out.println("number 2");
	}
	
		public static void main(String[] args) {
			new SelfTest01("C");
			new SelfTest01(1);
			System.out.println(" ");
		}

}
