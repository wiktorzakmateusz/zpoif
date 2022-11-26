import java.lang.reflect.*;

//shows private fields of class
public class ReflectionDemo2 {
	public static void main(String[] args) {
		var moneyMaker = new MoneyMaker(10000, "Jay", true);
		
		Class<?> c = moneyMaker.getClass();
		
		Field fields[] = c.getDeclaredFields();
		
		System.out.println("Private fields:");
		for (Field field: fields) {
			int modifier = field.getModifiers();
			if (Modifier.isPrivate(modifier)) {
				System.out.println(field);
			}
			
		}
		
		System.out.println("\nPublic fields:");
		for (Field field: fields) {
			int modifier = field.getModifiers();
			if (Modifier.isPublic(modifier)) {
				System.out.println(field);
			}
			
		}
		
		
		
	}
}
