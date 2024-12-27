package fundamentals;

public class Operators {

	public static void main(String[] args) {
		int a, b;
		a = 100; b =200;
		
		System.out.println("------------Arithemtic Operators---------------------");
		System.out.println("Addition: "+(a+b));
		System.out.println("Subtraction: "+(a-b));
		System.out.println("Multiplication: "+(a*b));
		System.out.println("Division: "+(b/a));
		System.out.println("Modular Division: "+(a%3));
		
		System.out.println("------------Assignment Operators---------------------");
		int c = 300;
		
		c+=100; //c = c+100;
		System.out.println(c);
		
		c-=100;  // c=c-100;
		System.out.println(c);
		
		c*=5;  // c=c*5;
		System.out.println(c);
		
		c/=5;  // c=c/5;
		System.out.println(c);
		
		c%=4;   // c=c%4;
		System.out.println(c%4);
		
		System.out.println("------------Increment/Decrment Operators---------------------");
		int d = 100;
		
		System.out.println(++d);  // pre-increment
		System.out.println(d++);  // post-increment
		System.out.println(d);
		
		System.out.println(--d); // pre-decrement
		System.out.println(d--); // post-decrement
		System.out.println(d);
		
		
		System.out.println("------------Comparision Operators---------------------");
		int x=10; int y=20;
		
		System.out.println(x<y); // true
		System.out.println(x>y); // false
		System.out.println(x==y); // false
		System.out.println(x!=y); // true
		System.out.println(x<=y);  // x<y or x==y -> T or F = T  -> true
		System.out.println(x>=y);  // x>y or x==y -> F or F = F  -> false
		
		boolean b1 = x>=y;
		System.out.println(b1);
		
		System.out.println("------------Logical Operators---------------------");
		
		System.out.println(x>=y || x<=y || x==y || x!=y); // F || T || F || T -> T || F || T -> T || T -> T
		System.out.println(x>=y && x<=y && x==y && x!=y); // false
		System.out.println(!(x>=y && x<=y && x==y && x!=y)); // true
		
		System.out.println("------------Ternary Operator---------------------");
		int p=10; int q = 20;
		
		System.out.println(p>q?true:false); //false
		System.out.println(p>q?p:q);
		System.out.println(p>q?"P is greater than Q":"Q is greater than P");
		
		boolean bool1 = p>q?true:false;
		int int1 = p>q?p:q;
		String str1 = p>q?"P is greater than Q":"Q is greater than P";
		

	}

}
