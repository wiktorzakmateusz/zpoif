import java.lang.reflect.*;

//shows constructors, fields and methods of class
public class ReflectionDemo {
	public static void main(String[] args) {
		try {
			Class<?> c = Class.forName("MoneyMaker");
			Constructor constructors[] = c.getConstructors();
			System.out.println("Constructors:");
			for (Constructor construktor: constructors) {
				System.out.println(" " + construktor);
			}
			
			Field fields[] = c.getFields();
			System.out.println("Fields:");
			for (Field field: fields) {
				System.out.println(" " + field);
			}
			
			Method methods[] = c.getDeclaredMethods();
			System.out.println("Methods:");
			for (Method method: methods) {
				System.out.println(" " + method);
			}
			
			
		}  catch (ClassNotFoundException e) {
			System.out.println("Nie znaleziono klasy");
		}
	}
}
