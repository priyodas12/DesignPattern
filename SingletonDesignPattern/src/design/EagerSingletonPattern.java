package design;
//as soon as class loaded this class instance will be created
//Runtime class is example of singleton pattern
public class EagerSingletonPattern {
	
	private int id;
	
	private  static EagerSingletonPattern soleInstance=new EagerSingletonPattern();
	
	private EagerSingletonPattern() {
		System.out.println("Creating sole instance");
	}
	
	public static EagerSingletonPattern getInstance() {
		return soleInstance;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EagerSingletonPattern other = (EagerSingletonPattern) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
}
