package inner.classes;

public class OuterClass {

	class InstaneInnerClass {
		void method1() {
			System.out.println("This is Instance Inner class Instance Method1");
		}
		
		static void method2() {
			System.out.println("This is Instance Inner class static Method2");
		}
	}

	static class StaticInnerClass {
		void method3() {
			System.out.println("This is Static Inner class Instance Method3");
		}
		
		static void method4() {
			System.out.println("This is STatic Inner class static Method4");
		}
	}

	{ // anonymous class
		int a = 100;
		int b = 200;
		System.out.println("This is Anonyous block: " + (a + b));
	}

	static { // static block
		String str1 = "Hello";
		String str2 = "Java";
		System.out.println("This is Static BLock: " + str1 + str2);
	}
	
	public static void main(String[] args) {
		System.out.println("This is Main method");		
		OuterClass outCls = new OuterClass();
		
		OuterClass.InstaneInnerClass.method2();
		OuterClass.StaticInnerClass.method4();
		
//		OuterClass.InstaneInnerClass.method1();
//		OuterClass.StaticInnerClass.method3();
		
		OuterClass.InstaneInnerClass insIneCls = outCls.new InstaneInnerClass();
		OuterClass.StaticInnerClass statInCls = new StaticInnerClass();
		
		insIneCls.method1();
		statInCls.method3();
		
	}

}
