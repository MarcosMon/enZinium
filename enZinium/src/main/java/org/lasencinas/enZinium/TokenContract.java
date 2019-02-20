package org.lasencinas.enZinium;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

public class TokenContract {

	private Address ownerPK = null;
	private String name = null;
	private double totalSupply = 0d;
	private String symbol = null;
	private Double units = 0d;
	private Map<Integer, Double> balances = new HashMap<Integer, Double>();

//Inicialización de constructores
	public TokenContract() {
	}

	public TokenContract(Address rick) {

		this.setOwnerPK(rick);

	}

//Setters && Getters
	public Address getAddres() {
		return this.ownerPK;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;

	}

	private void setOwnerPK(Address rick) {
		this.ownerPK = rick;
	}

	public void setTotalSupply(double totalSupply) {
		this.totalSupply = totalSupply;

	}

	public String symbol() {
		return this.symbol;
	}

	public double totalSupply() {
		return this.totalSupply;
	}

	public void addOwner(PublicKey PK, double totalSupply) {
		balances.putIfAbsent(PK.hashCode(), totalSupply);
	}

	public int numOwners() {
		return balances.size();
	}

	public Double balanceOf(PublicKey pk) {

		return balances.get(pk.hashCode());
	}

	public void transfer(PublicKey sender, PublicKey recipient, double units) {

	}

	public void transfer(PublicKey recipient, double rnill) {
		balances.putIfAbsent(recipient.hashCode(), rnill);
	}

	// ToString

	@Override
	public String toString() {
		return "Name = " + getName() + "\n" + "symbol = " + symbol() + "\n" + "TotalSupply = " + totalSupply() + "\n"
				+ "owner PK = " + getAddres().hashCode();
	}

}
