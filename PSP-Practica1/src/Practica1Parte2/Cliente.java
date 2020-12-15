package Practica1Parte2;

import java.util.*;

public class Cliente extends Thread {

	Cartera ca;

	public Cliente(Cartera ca) {
		this.ca = ca;
	}
	
	@Override
	public void run() {
		try {
			System.out.println(getId() + " thread añadiendo dinero..., 	Dinero actual: " + ca.incrementarDinero(new Random().nextInt(101)));

		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}
}
