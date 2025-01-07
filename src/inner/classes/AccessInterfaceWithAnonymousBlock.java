package inner.classes;

public class AccessInterfaceWithAnonymousBlock {

	public static void main(String[] args) {
		
		InterfaceWithAnonymousBlock infAnoCls = new InterfaceWithAnonymousBlock() {
			
			@Override
			public void subtraction(int a, int b) {
				System.out.println(a+b);
				
			}
			
			@Override
			public void addition(int a, int b) {
				System.out.println(a-b);
				
			}
		};
		
		infAnoCls.addition(100, 200);
		infAnoCls.subtraction(100, 200);
	}

}
