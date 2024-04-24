package singleton;

public class SingletonImpl {
	public static void main(String[] args) {
		SingletonClass instance1 = SingletonClass.getInstanceOfSingleton();
		System.out.println("Test1: "+instance1.hashCode());
		
		SingletonClass instance2 = SingletonClass.getInstanceOfSingleton();
		System.out.println("Test2: "+instance2.hashCode());
		
		SingletonClass instance3 = SingletonClass.getInstanceOfSingleton();
		System.out.println("Test3: "+instance3.hashCode());
		
		SingletonClass instance4 = SingletonClass.getInstanceOfSingleton();
		System.out.println("Test4: "+instance4.hashCode());
		
		if(instance1 == instance2 && instance2 == instance3 && instance3 == instance4) {
			System.out.println("All instance of Singleton class connecting single referance memory location of object");
			System.out.println("So all are one and occuping one memory location");
			String msg = instance4.getMessage();
			System.err.println(msg);
		}
		else {
			System.out.println("All are different object and occuping different memory location");
		}
	}
}
