import java.lang.reflect.*;

public class ReflectionMethods {
	public static void main(String[] args) {
		try {
			Class<?> clazz = Class.forName("MoneyMaker");
			Object object = clazz.newInstance();
			
			//increaseBalance method invocation
			try {
				
				
				System.out.println("increaseBalance method:\nOur instance: " + object.toString());
				
				Method increaseBalanceMethod = clazz.getDeclaredMethod("increaseBalance", int.class);
				
				increaseBalanceMethod.invoke(object, new Object[] {2000});
				
				System.out.println("Our instance: " + object.toString());
				
				
			} catch (NoSuchMethodException | SecurityException | InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//setNick method invocation
			try {
				System.out.println("\nsetNick method:\nOur instance: " + object.toString());
				Method setNickMethod = clazz.getDeclaredMethod("setNick", String.class);
				
				try {
					setNickMethod.invoke(object, new Object[] {"Johnny"});
				} catch (IllegalAccessException | InvocationTargetException e) {
					System.out.println("(Nie mo¿na u¿yæ prywatnej metody bez \"setAccessible\")");
				}
				
				setNickMethod.setAccessible(true);
				setNickMethod.invoke(object, new Object[] {"Alfredo"});
				
				System.out.println("Our instance: " + object.toString());
				
			} catch (NoSuchMethodException | SecurityException | InvocationTargetException e) {
				e.printStackTrace();
			}
			
			
			
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
