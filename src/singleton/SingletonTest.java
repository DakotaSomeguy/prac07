
package singleton;


public class SingletonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		s1.HereIAm();
		Singleton s2 = Singleton.getInstance();
		s2.HereIAm();
	}

}
