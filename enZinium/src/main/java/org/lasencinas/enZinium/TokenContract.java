package org.lasencinas.enZinium;

import java.security.PublicKey;

public class TokenContract {

	private Address ownerPK = null;
	private String name = null;
	private double totalSupply = 0d;
	private String symbol = null;

	public TokenContract() {
	}

	public TokenContract(Address rick) {

		this.setOwnerPK(rick);

	}

	private void setOwnerPK(Address rick) {
		this.ownerPK = rick;
	}

	public Address getAddres() {
		return this.ownerPK;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;

	}

	public String getSymbol() {
		return this.symbol;
	}

	public void setTotalSupply(double totalSupply) {
		this.totalSupply = totalSupply;

	}

	@Override
	public String toString() {
		return "Name = " + getName() + "\n"  + "symbol = " + getSymbol() + "\n"
				+ "TotalSupply = " + getTotalSupply() + "\n" + "owner PK = " + getAddres().hashCode();
	}

	public double getTotalSupply() {
		return this.totalSupply;
	}

}
