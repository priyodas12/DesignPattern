package design;

public class TestSingletonPattern {

	public static void main(String[] args) {
		SingletonPattern p1=SingletonPattern.getInstance();
		SingletonPattern p2=SingletonPattern.getInstance();
		
		System.out.println(p1.hashCode()+","+p2.hashCode());
		System.out.println(p1.equals(p2));
		
		

	}

}
