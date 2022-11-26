package pl.edu.pw.mini.zpoif.task3.solution;

import java.util.List;
import java.util.Map;
import java.util.Set;

import pl.edu.pw.mini.zpoif.task3.model.StatekNawodny;
import pl.edu.pw.mini.zpoif.task3.model.jacht.Jacht;
import pl.edu.pw.mini.zpoif.task3.model.jacht.JachtKabinowy;
import pl.edu.pw.mini.zpoif.task3.model.jacht.JachtMotorowy;
import pl.edu.pw.mini.zpoif.task3.model.jacht.JachtZaglowy;

public interface Statki2 {
	StatekNawodny getNajlzejszyStatek();
	StatekNawodny getNajdluzszyStatekOdJanmor();
	JachtZaglowy getJachtZagowyONajwiekszejPowierzchniZagla();
	JachtMotorowy getCiezkiJachtMotorowyONajwiekszejMocyDo200KM();
	Set<JachtMotorowy> getCoNajwyzej20CiezkichIMocnychJachtowMotorowych();
	List<JachtKabinowy> get15JachtowKabinowychPosortowanychWgZanurzenia();
	List<JachtMotorowy> get4NajsilniejszeJachtyMotorowe();
	void zaproponujMotorowskiDlaCrocketa();
	String get12UnikalnychNazwTypow();
	Map<Integer, JachtKabinowy> getMapaJachtowKabinowych();
	List<Jacht> getJachtyOdkrytopokladoweIMotoroweJednePoDrugich();
}
