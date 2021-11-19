package upcasting;

public class Child extends Parent { 
	public void method() {
		System.out.println("Murugan");
		super.method();
	}

	public static void main(String[] args) {
      Child c=new Child();
      Parent p=new Child();
      p.method();
	}

}
