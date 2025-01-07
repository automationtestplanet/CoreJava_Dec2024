package inner.classes;

public interface InterfaceWithAnonymousBlock {

	void addition(int a, int b);

	void subtraction(int a, int b);

	public static void main(String[] args) {
		InterfaceWithAnonymousBlock infAnoCls = new InterfaceWithAnonymousBlock() {

			@Override
			public void addition(int a, int b) {
				System.out.println(a + b);

			}

			@Override
			public void subtraction(int a, int b) {
				System.out.println(a - b);

			}

		};
		
		infAnoCls.addition(10,20);
		infAnoCls.subtraction(10,20);
		
		
	}
}
