package inner.classes;

import inner.classes.OuterClass.StaticInnerClass;

public class AccessOuterClass {

	public static void main(String[] args) {
		System.out.println("This is Main method");		
		OuterClass outCls = new OuterClass();
		
		OuterClass.InstaneInnerClass.method2();
		OuterClass.StaticInnerClass.method4();
	
		OuterClass.InstaneInnerClass insIneCls = outCls.new InstaneInnerClass();
		OuterClass.StaticInnerClass statInCls = new StaticInnerClass();
		
		insIneCls.method1();
		statInCls.method3();

	}

}
