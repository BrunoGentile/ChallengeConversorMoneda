package conversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedasAPesos {
	public void ConvertirDolaresAPesos(double valor) {
		double monedaDolar = valor * 349.69;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Pesos Argentino");
	}
	
	public void ConvertirEurosAPesos(double valor) {
		double monedaEuro = valor * 373.18;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " Pesos Argentino");
	}
	
	public void ConvertirLibrasAPesos(double valor) {
		double monedaLibra = valor * 433.12;
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaLibra+ " Pesos Argentino");
	}
	
	public void ConvertirYenAPesos(double valor) {
		double monedaYen = valor * 2.36;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYen+ " Pesos Argentino");
	}
	
	public void ConvertirWonAPesos(double valor) {
		double monedaWon = valor * 3.80;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaWon+ " Pesos Argentino");
	}
}
