package pl.edu.pw.mini.zpoif.task3.solution;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import pl.edu.pw.mini.zpoif.task3.model.StatekNawodny;
import pl.edu.pw.mini.zpoif.task3.model.jacht.Jacht;
import pl.edu.pw.mini.zpoif.task3.model.jacht.JachtKabinowy;
import pl.edu.pw.mini.zpoif.task3.model.jacht.JachtMotorowy;
import pl.edu.pw.mini.zpoif.task3.model.jacht.JachtOdkrytopokladowy;
import pl.edu.pw.mini.zpoif.task3.model.jacht.JachtZaglowy;

public class StreamClass implements Statki2 {

	
	
	private List<StatekNawodny> statki;
	
	
	public StreamClass(List<StatekNawodny> statki) {
		this.statki = statki;
	}

	@Override
	public StatekNawodny getNajlzejszyStatek() {
		return statki.stream().min((s1,s2)->Integer.compare(s1.getMasa(),s2.getMasa())).orElse(null);
	}

	@Override
	public StatekNawodny getNajdluzszyStatekOdJanmor() {
		return statki.stream().filter(s->s.getNazwaProducenta().toUpperCase().equals("JANMOR"))
				.max((s1,s2)->Integer.compare(s1.getDlugosc(),s2.getDlugosc())).orElse(null);
		
	}

	@Override
	public JachtZaglowy getJachtZagowyONajwiekszejPowierzchniZagla() {
		return statki.stream().filter((s) -> s instanceof JachtKabinowy || s instanceof JachtOdkrytopokladowy)
				.map(s-> (JachtZaglowy) s)
				.max((s1,s2) -> Double.compare(s1.getPowierzchniaZagla(), s2.getPowierzchniaZagla())).orElse(null);
				
	}

	@Override
	public JachtMotorowy getCiezkiJachtMotorowyONajwiekszejMocyDo200KM() {
		return statki.stream().filter(s-> s instanceof JachtMotorowy && ((JachtMotorowy) s).getMocSilnika() <= 200)
				.map(s-> (JachtMotorowy) s)
				.max((s1,s2)->Integer.compare(((JachtMotorowy) s1).getMocSilnika(), ((JachtMotorowy) s2).getMocSilnika())).orElse(null);
	}

	@Override
	public Set<JachtMotorowy> getCoNajwyzej20CiezkichIMocnychJachtowMotorowych() {
		return statki.stream().skip(2).filter(s->s.getMasa()>= 1400 && s.getDlugosc() >= 800)
				.map(s-> (JachtMotorowy) s)
				.limit(20)
				.collect(Collectors.toSet());
	}

	@Override
	public List<JachtKabinowy> get15JachtowKabinowychPosortowanychWgZanurzenia() {
		return statki.stream().skip(4)
				.map(s-> (JachtKabinowy) s)
				.sorted((s1,s2)->Integer.compare(s2.getZanurzenie(),s1.getZanurzenie()))
				.limit(15)
				.collect(Collectors.toList());
	}

	@Override
	public List<JachtMotorowy> get4NajsilniejszeJachtyMotorowe() {
		return statki.stream().skip(2)
				.map(s-> (JachtMotorowy) s)
				.sorted((s1,s2)->Integer.compare(s1.getMocSilnika(),s2.getMocSilnika()))
				.limit(4)
				.collect(Collectors.toList());
	}

	@Override
	public void zaproponujMotorowskiDlaCrocketa() {
		Stream stream = statki.stream().filter(s-> s instanceof JachtMotorowy && ((JachtMotorowy) s).getMocSilnika() >= 500)
				.skip(1)
				.limit(3);
		
		stream.forEach(s-> System.out.println("Model " + s + " jest dobry do Miami Vice!"));		
	}

	@Override
	public String get12UnikalnychNazwTypow() {
		return Integer.toString(statki.stream().skip(6)
				.filter(s->s instanceof JachtKabinowy || s instanceof JachtOdkrytopokladowy)
				.filter(s->s.getMasa()>=500)
				.distinct()
				.limit(10)
				.collect(Collectors.summingInt(s->s.getDlugosc())));
	}

	@Override
	public Map<Integer, JachtKabinowy> getMapaJachtowKabinowych() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Jacht> getJachtyOdkrytopokladoweIMotoroweJednePoDrugich() {
		Stream<StatekNawodny> stream1 = statki.stream()
				.filter(s-> s instanceof JachtMotorowy && ((JachtMotorowy) s).getMocSilnika() > 300);
		long count = stream1.count();
		List<Jacht> list1 = stream1.skip((count - 4) > 0 ? count - 4 : 0)
				.map(s-> (Jacht) s)
				.collect(Collectors.toList());
		
		List<Jacht> list2 = statki.stream().sorted((s1,s2)->Integer.compare(s1.getDlugosc(), s2.getDlugosc()))
				.limit(2)
				.map(s-> (Jacht) s)
				.collect(Collectors.toList());
		
		list1.addAll(list2);
		
		return list1;
	}

}
