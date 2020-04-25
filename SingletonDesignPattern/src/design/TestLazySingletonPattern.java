package design;

public class TestLazySingletonPattern {

	public static void main(String[] args) {
		LazySingletonPattern l1=LazySingletonPattern.getSoleInstance();
		LazySingletonPattern l2=LazySingletonPattern.getSoleInstance();
		
		System.out.println(l1==l2);

	}

}
