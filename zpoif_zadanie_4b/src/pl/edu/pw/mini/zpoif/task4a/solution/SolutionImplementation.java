package pl.edu.pw.mini.zpoif.task4a.solution;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Random;

import pl.edu.pw.mini.zpoif.task4a.MyLovelySittingRoom;
import pl.edu.pw.mini.zpoif.task4a.SittingRoom;
import pl.edu.pw.mini.zpoif.task4a.SittingRoom.Table;

public class SolutionImplementation extends Solution {

	@Override
	protected MyLovelySittingRoom task1() {
		try {
			Class<?> clazz = Class.forName("pl.edu.pw.mini.zpoif.task4a.MyLovelySittingRoom");
			MyLovelySittingRoom room = (MyLovelySittingRoom) clazz.newInstance();
			return room;
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	protected void task2() {
		try {
			Class<?> clazz = Class.forName("pl.edu.pw.mini.zpoif.task4a.MyLovelySittingRoom");
			MyLovelySittingRoom room = (MyLovelySittingRoom) clazz.newInstance();
			Field roomLabelField = clazz.getDeclaredField("ROOM_LABEL");
			System.out.println((String) roomLabelField.get(room));
		} catch (ClassNotFoundException | NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException | InstantiationException e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	protected void task3(Object object) {
		try {
			Field roomLabelField = object.getClass().getDeclaredField("pepoleLiving");
			roomLabelField.setAccessible(true);
			roomLabelField.setInt(object, roomLabelField.getInt(object) + 1);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	protected SittingRoom task4(Object object) {
		try {
			Class<?> clazz = object.getClass().getSuperclass();
			System.out.println(clazz.getCanonicalName());
			Class<?> c = Class.forName(clazz.getCanonicalName());
			SittingRoom sittingRoom = (SittingRoom) c.newInstance();
			return sittingRoom;
			
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		
		
		return null;
	}

	@Override
	protected void task5(Object object) {
		Class<?> clazz = object.getClass();

		Method methods[] = clazz.getDeclaredMethods();
		for (Method method: methods) {
			if (method.getParameterCount() >= 2) {
				System.out.println("Nazwa metody: " + method.getName() + ", liczba parametrów: " + method.getParameterCount());
			}
		}
		
	}
	

	@Override
	protected void task6(Object object) {
		Class<?> clazz = object.getClass();
		try {
			Method greetMethod = clazz.getDeclaredMethod("greet", String.class);
			greetMethod.invoke(object, new Object[] {"hello"});
		} catch (NoSuchMethodException | SecurityException | InvocationTargetException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	protected MyLovelySittingRoom task7(Object object) {
		
		
		try {
			Class<?> clazz = object.getClass();
			Constructor constructors[] = clazz.getConstructors();
			Constructor constructorMax = constructors[0];
			for (Constructor constructor: constructors) {
				if (constructor.getParameterCount() > constructorMax.getParameterCount()) {
					constructorMax = constructor;
				}
			}
			System.out.println(constructorMax.getName());
			
			Random random = new Random();
			Integer r1 = random.nextInt(10,21);
			Integer r2 = random.nextInt(10,21);
			Integer r3 = random.nextInt(10,21);
			MyLovelySittingRoom room = (MyLovelySittingRoom) constructorMax.newInstance(new Object[] {r1,r2,r3});
			return room;
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return null;
	}

	@Override
	protected void task8(Object object) {
		
		try {
			Class<?> clazz = object.getClass().getSuperclass();
			Method calculateVolumeMethod = clazz.getDeclaredMethod("calculateVolume");
			calculateVolumeMethod.setAccessible(true);
			int volume = (int) calculateVolumeMethod.invoke(object, new Object[] {});
			System.out.println(volume);
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	protected void task9(Object object) {
		Class<?> clazz = object.getClass().getSuperclass();
		Class<?> clazzTable = clazz.getClasses()[1];
		
		Table table;
		try {
			table = (Table) clazzTable.newInstance();
			Class<?> clazz2 = Class.forName("pl.edu.pw.mini.zpoif.task4a.MyLovelySittingRoom");
			Field field = clazz2.getDeclaredField("myLovelyTable");
			field.setAccessible(true);
			field.set(object, table);
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
