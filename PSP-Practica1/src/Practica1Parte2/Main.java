package Practica1Parte2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	public static void main(String[] args) {

		Cartera ca = new Cartera();

		ExecutorService es = Executors.newCachedThreadPool();

		for (int i = 0; i < 10; i++) {
			es.execute(new Cliente(ca));

			es.execute(new Worker(ca));
		}

		es.shutdown();

		while (!es.isTerminated()) {
		}

		System.out.println("DINERO ACTUAL " + ca.getDinero());
	}
}
