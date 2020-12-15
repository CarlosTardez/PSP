package Practica1Parte2;

import java.util.*;

public class Worker extends Thread {

	Cartera ca;

	public Worker(Cartera ca) {
		this.ca = ca;
	}

	@Override
	public void run() {
		try {
			System.out.println(getId() + " thread retirando dinero..., 	Dinero actual: "
					+ ca.decrementarDinero(new Random().nextInt(101)));

		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}
}
