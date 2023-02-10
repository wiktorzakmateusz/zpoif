package pl.edu.pw.mini.zpoif.task4a.solution;

import pl.edu.pw.mini.zpoif.task4a.MyLovelySittingRoom;

public class Demonstrator {
	public static void main(String[] args) throws ClassNotFoundException {
		
		MyLovelySittingRoom room = new MyLovelySittingRoom();
		SolutionImplementation simp = new SolutionImplementation();
		
		System.out.println("task1:");
		System.out.println(simp.task1());
		System.out.println("");

		System.out.println("");
		System.out.println("task2:");
		simp.task2();

		System.out.println("");
		System.out.println("task3:");
		System.out.println("Przed: " + room);
		simp.task3(room);
		System.out.println("Po: " + room);
		room = new MyLovelySittingRoom();

		System.out.println("");
		System.out.println("task4:");
		
		System.out.println(simp.task4(room));
		
		System.out.println("");
		System.out.println("task5:");
		simp.task5(simp);
		
		System.out.println("");
		System.out.println("task6: (metoda siê wykonuje i tego nie widaæ)");
		
		System.out.println("");
		System.out.println("task7:");
		System.out.println(simp.task7(room));
		
		System.out.println("");
		System.out.println("task8:");
		simp.task8(room);
		
		System.out.println("");
		System.out.println("task9:");
		System.out.println("Przed" + room);
		simp.task9(room);
		System.out.println("Po: " + room);
		
	}
}
