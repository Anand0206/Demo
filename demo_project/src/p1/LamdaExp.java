package p1;


@FunctionalInterface
interface B{
	
	void show(int y);
}
public class LamdaExp {

	public static void main(String[] args) {
		B a1 = (int y)-> 
		{
			System.out.println("Hi Welcome");
			System.out.println("Its Anand Here");
			System.out.println(y);
		};
		a1.show(800);
	}
}
