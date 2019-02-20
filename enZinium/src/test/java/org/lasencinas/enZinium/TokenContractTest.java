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
	@Test
	public void coprobarSymbol() {
		TokenContract ricknillos = new TokenContract();
		String symbol = "RNiLL";
		ricknillos.setSymbol(symbol);
		assertEquals(symbol, ricknillos.getSymbol());
	}
	@Test
	public void comprobarTotalSupply() {
		TokenContract ricknillos = new TokenContract();
		int totalSupply = 100;
		ricknillos.setTotalSupply(totalSupply);
		assertEquals(totalSupply, ricknillos.getTotalSupply());
	}


}
