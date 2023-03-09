package Introduction;

public class finalizeMethod {
	final void a1() {
	System.out.println("this is finalize method");
	}

}
class test{
	finalizeMethod obj = new finalizeMethod();
	obj = new finalizeMethod();
	obj = new finalizeMethod();
	Runtime.getRuntime().gc();
	
}
}
