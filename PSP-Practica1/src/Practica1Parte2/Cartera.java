package Practica1Parte2;

public class Cartera {
	private static double dinero;

	public Cartera() {
		dinero = 2;
	}

	public double getDinero() {
		return dinero;
	}

	public synchronized double incrementarDinero(double a�adir) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		dinero += a�adir;
		return dinero;
	}

	public synchronized double decrementarDinero(double retirar) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (retirar > dinero) {
			return dinero;
		} else {
			dinero -= retirar;
		}
		return dinero;
	}
}
