package org.lasencinas.enZinium;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class AddressTest {

	@Test
	public void comprobarAdress() {
		Address address = new Address();
		assertNotNull(address);
	}

	@Test
	public void comprobarBalance() {
		Address address = new Address();
		double balanceActual = 0.0;
		assertEquals(balanceActual, address.getBalance(), 0);
	}

	@Test
	public void comprobarSimbolo() {
		Address address = new Address();
		String symbol = "EZI";
		assertEquals(symbol, address.getSymbol());
	}

}
