package design;

public class LazySingletonPattern {
	
	//static-its class property,volatile-can't be cached
	private static volatile LazySingletonPattern soleLazySingletonInstance;
	
	//no inheritance
	private LazySingletonPattern() {
		System.out.println("Singleton instance created....");
	}
	//single access end point
	public static LazySingletonPattern  getSoleInstance() {
		if(soleLazySingletonInstance==null) {
			synchronized(LazySingletonPattern.class) {
				if(soleLazySingletonInstance==null) {
					soleLazySingletonInstance=new LazySingletonPattern();
				}
			}
		}
		return soleLazySingletonInstance;
	}
}
