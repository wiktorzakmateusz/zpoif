package pl.edu.pw.mini.zpoif.task3.solution;

import java.util.Map.Entry;
import pl.edu.pw.mini.zpoif.task3.generator.GeneratorStatkow;

public class Demonstrator {
	public static void main(String[] args) {
		StreamClass s = new StreamClass(GeneratorStatkow.generujStatkiNawodne());
		
		System.out.println("Najl¿ejszy statek:");
		System.out.println(s.getNajlzejszyStatek());
		System.out.println("");
		System.out.println("Najdluzszy statek od Janmor");
		System.out.println(s.getNajdluzszyStatekOdJanmor());
		System.out.println("");
		System.out.println("Jacht Zaglowy o najwieksej powierzchni zagla");
		System.out.println(s.getJachtZagowyONajwiekszejPowierzchniZagla());
		System.out.println("");
		System.out.println("getCiezkiJachtMotorowyONajwiekszejMocyDo200KM():");
		System.out.println(s.getCiezkiJachtMotorowyONajwiekszejMocyDo200KM());
		System.out.println("");
		System.out.println("getCoNajwyzej20CiezkichIMocnychJachtowMotorowych():");
		System.out.println(s.getCoNajwyzej20CiezkichIMocnychJachtowMotorowych());
		System.out.println("");
		System.out.println("get15JachtowKabinowychPosortowanychWgZanurzenia():");
		System.out.println(s.get15JachtowKabinowychPosortowanychWgZanurzenia());
		System.out.println("");
		System.out.println("get4NajsilniejszeJachtyMotorowe():");
		System.out.println(s.get4NajsilniejszeJachtyMotorowe());
		System.out.println("");
		System.out.println("zaproponujMotorowskiDlaCrocketa():");
		s.zaproponujMotorowskiDlaCrocketa();
		System.out.println("");
		System.out.println("get12UnikalnychNazwTypow():");
		System.out.println(s.get12UnikalnychNazwTypow());
		System.out.println("");
		System.out.println("getJachtyOdkrytopokladoweIMotoroweJednePoDrugich():");
		System.out.println(s.getJachtyOdkrytopokladoweIMotoroweJednePoDrugich());
		System.out.println("");
		
	}
}
