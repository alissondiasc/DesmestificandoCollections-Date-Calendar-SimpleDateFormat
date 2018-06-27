package br.com.DateCalendarSimpleDateFomat;

import java.util.Calendar;

public class DataCalendarTeste {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println("Data e Hora atual: " + c.getTime());
		System.out.println("-----------------------------------" + "\n");
		System.out.println("Ano: " + c.get(Calendar.YEAR));
		System.out.println("Mes: " + c.get(Calendar.MONTH));
		System.out.println("Dia: " + c.get(Calendar.DAY_OF_MONTH));

		System.out.println("-----------------------------------" + "\n");
		// Mostra o dia da semana, mês e ano
		Calendar c1 = Calendar.getInstance();
		c1.set(Calendar.YEAR, 1995);
		c1.set(Calendar.MONTH, Calendar.MARCH);
		c1.set(Calendar.DAY_OF_MONTH, 20);

		System.out.println("Data/Hora atual: " + c1.getTime());
		System.out.println("Ano: " + c1.get(Calendar.YEAR));
		System.out.println("Mês: " + c1.get(Calendar.MONTH));
		System.out.println("Dia do Mês: " + c1.get(Calendar.DAY_OF_MONTH));

		System.out.println("-----------------------------------" + "\n");
		MsgBoasVindas_Calendar();
	}

	public static void MsgBoasVindas_Calendar() {
		Calendar c1 = Calendar.getInstance();
		int hora = c1.get(Calendar.HOUR_OF_DAY);

		if (hora > 6 && hora < 12) {
			System.out.println("Bom Dia");
		} else if (hora > 12 && hora < 18) {
			System.out.println("Boa Tarde");
		} else {
			System.out.println("Boa Noite");
		}
	}

}
