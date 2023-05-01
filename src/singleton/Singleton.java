package singleton;

public class Singleton {
	private String name; 
	private Singleton(String s) {
		this.name=s; 
	}
	 
	private static class SingletonHolder {
	   private final static Singleton INSTANCE = new Singleton("SingletonHolder Call");
	}
	
	public static Singleton getInstance() {
	   return SingletonHolder.INSTANCE;
	}
	
	public void HereIAm() {
		System.out.println("This is a Singleton class");
		System.out.println("My name is: " + this.name);
	}
}
