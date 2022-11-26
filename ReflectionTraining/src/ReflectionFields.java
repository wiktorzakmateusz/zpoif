import java.lang.reflect.*;

public class ReflectionFields {
	public static void main(String[] args) {
		try {
			Class<?> clazz = Class.forName("MoneyMaker");
			Constructor constructor = clazz.getConstructor(int.class, String.class, boolean.class);
			MoneyMaker moneyMaker = (MoneyMaker) constructor.newInstance(new Object[] {1000, "Eurycy", true});
			
			//Field of balance
			Field fieldBalance = clazz.getDeclaredField("balance");
			
			
			//Checking modifiers of balance
			int modifierBeforeSetAccessible = fieldBalance.getModifiers();
			System.out.println("Is balance private (before setAccessible)? " + Modifier.isPrivate(modifierBeforeSetAccessible));
			
			fieldBalance.setAccessible(true);
			
			int modifierAfterSetAccessible = fieldBalance.getModifiers();
			System.out.println("Is balance private (after setAccessible)? " + Modifier.isPrivate(modifierAfterSetAccessible));
			
			int balance = fieldBalance.getInt(moneyMaker);
			
			//Field of nick
			Field fieldString = clazz.getDeclaredField("nick");
			fieldString.setAccessible(true);
			String nick = (String) fieldString.get(moneyMaker);
			System.out.println("\nBalance of " + nick + " is " + balance);
			
			//Increasing balance
			System.out.println("\nLet's increase balance...");
			moneyMaker.increaseBalance(1750);
			balance = fieldBalance.getInt(moneyMaker);
			System.out.println("\nNow Balance of " + nick + " is " + balance);
			
			//Printing all fields
			System.out.println("\nWypiszmy wszystkie pola:");
			Field[] fields = clazz.getDeclaredFields();
			for (Field field: fields) {
				field.setAccessible(true);
				System.out.println(field.getName() + ": " + field.get(moneyMaker));
			}
			
			
		} catch(ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchFieldException e) {
			e.printStackTrace();
		}
		
	}
}
