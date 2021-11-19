package variables;

public class Variable1 {
	static int a=10;
	public static void add() {
		int a=20;
		System.out.println(a);
	}
	public static void sub() {
		System.out.println(a);
	}
	

	public static void main(String[] args) {
       add();
       sub();
	}

}
