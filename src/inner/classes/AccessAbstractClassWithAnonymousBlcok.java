package inner.classes;

public class AccessAbstractClassWithAnonymousBlcok {
	
	public static void main(String[] args) {
			
		AbstractClassWithAnnonymousBlock absAnoCls = new AbstractClassWithAnnonymousBlock() {				
				@Override
				public void addition(int a, int b) {
					System.out.println(a+b);
				}
			};
			
			absAnoCls.addition(100, 200);
			absAnoCls.subtraction(100, 200);
	}
}
