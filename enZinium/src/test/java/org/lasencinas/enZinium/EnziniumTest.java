package org.lasencinas.enZinium;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class EnziniumTest {

	@Test
	public void comprobarAdress() {
		Address address = new Address();
		assertNotNull(address);
	}

	@Test
	public void comprobarBalance() {
	Address address = new Address();
	assertEquals(0.0, address.getBalance(), 0);
	}

}
