package singleton;


public class SingletonClass {
	/* Rule 1 - Only one instance of class means one time object creation and store into private static variable. */
	private static SingletonClass singletonobj = new SingletonClass();

	
	/* Rule 2-  Constructor should be private so outside of class cannot create object of this singleton class. */
	private SingletonClass() {
		System.out.println("This is constructor of Singleton class create only once");
	}

	/* Rule 3 -Create a method should static and public must to access outside of class. */
	public static SingletonClass getInstanceOfSingleton() {
		if(singletonobj == null)
			singletonobj = new SingletonClass();
		return singletonobj;
	}
	
	public String getMessage() {
		return "This method called by singleton class object";
	}
	
}
