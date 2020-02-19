package design;

public class SingletonPattern {
	
	private int id;
	
	private  static SingletonPattern soleInstance=new SingletonPattern();
	
	private SingletonPattern() {
		System.out.println("Creating sole instance");
	}
	
	public static SingletonPattern getInstance() {
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
		SingletonPattern other = (SingletonPattern) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
}
