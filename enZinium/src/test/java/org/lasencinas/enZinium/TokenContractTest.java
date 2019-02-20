package org.lasencinas.enZinium;

import static org.junit.Assert.*;

import org.junit.Test;

public class TokenContractTest {

	@Test
	public void comprobarNombre() {
		
		TokenContract ricknillos = new TokenContract();
		String name = "Ricknillos";
		ricknillos.setName(name);
		assertEquals(name, ricknillos.getName());
		
	}


}
