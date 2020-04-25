package design;

public class TestEagerSingletonPattern {

	public static void main(String[] args) {
		EagerSingletonPattern p1=EagerSingletonPattern.getInstance();
		EagerSingletonPattern p2=EagerSingletonPattern.getInstance();
		
		System.out.println(p1.hashCode()+","+p2.hashCode());
		System.out.println(p1.equals(p2));
		
		

	}

}
