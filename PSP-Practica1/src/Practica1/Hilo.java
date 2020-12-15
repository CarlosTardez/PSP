package Practica1;

public class Hilo extends Thread {

	public Hilo() {

	}

	public void run() {
		try {
			int random = ((int) (Math.random() * 4000)) + 1000;
			System.out.println("Soy el hilo " + getName() + " y me duermo " + random + " milisegundos");
			sleep(random);
			System.out.println("Soy el hilo " + getName() + " y he terminado de dormir");
		} catch (InterruptedException e) {
			e.getStackTrace();
		}
	}
}
