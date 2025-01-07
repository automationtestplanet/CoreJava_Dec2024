package inner.classes;

abstract public class AbstractClassWithAnnonymousBlock {

	abstract public void addition(int a, int b);

	public void subtraction(int a, int b) {
		System.out.println(a - b);
	}

//	public static void main(String[] args) {
//
//		AbstractClassWithAnnonymousBlock absAnoCls = new AbstractClassWithAnnonymousBlock() {
//			@Override
//			public void addition(int a, int b) {
//				System.out.println(a + b);
//
//			}
//		};
//
//		absAnoCls.addition(10, 20);
//	}

}
