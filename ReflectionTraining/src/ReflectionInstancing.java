import java.lang.reflect.*;

public class ReflectionInstancing {
	public static void main(String[] args) {
		var moneyMaker = new MoneyMaker(10000, "Jay");
		try {
			Class<?> c = moneyMaker.getClass();
			System.out.println("Canonical Name: " + c.getCanonicalName());
		} catch (Exception e) {
			System.out.println("getName() proceeded in wrong way");
		}
		
		
		try {
			Class<?> c = Class.forName("MoneyMaker");
			Constructor constructor = c.getConstructor(int.class, String.class);
			
			Object object = constructor.newInstance(new Object[] {1000, "John"});
			
			MoneyMaker moneyMaker1 = (MoneyMaker) object;
			
			System.out.println(moneyMaker1);
			
		} catch (Exception e) {
			System.out.println("Error in instancing new instance of class");
		}
		
		System.out.println("\nAll constructors:");
		try {
			Constructor constructors[] = Class.forName("MoneyMaker").getConstructors();
			for (Constructor constructor: constructors) {
				System.out.println(constructor + "\nNumber of parameteres: " + constructor.getParameterCount() +
						"\nTypes of parameteres: " + constructor.getParameterTypes() + "\n");
			}
		} catch (Exception e) {
			System.out.println("Error in printing constructors");
		}
		
	}
}
