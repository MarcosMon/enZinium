package org.lasencinas.enZinium;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;

public class Address {

	private PublicKey PK = null;
	private PrivateKey SK = null;
	private double balance = 0d;
	private String symbol = "EZI";

// Inicialización  del contructor
	public Address() {

	}

//Setter && Getters
	public String getSymbol() {
		return this.symbol;
	}

	public PublicKey getPK() {
		return this.PK;
	}

	public PrivateKey getPrivateKey() {
		return this.SK;
	}

	public double getBalance() {
		return this.balance;
	}

	public void setPublicKey(PublicKey PK) {

		this.PK = PK;

	}

	public void setPrivateKey(PrivateKey SK) {
		this.SK = SK;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	// Logica
	public void generateKeyPair() {

		KeyPair pair = GenSig.generateKeyPair();
		setPublicKey(pair.getPublic());
		setPrivateKey(pair.getPrivate());
	}

//Método toString
	@Override
	public String toString() {
		return "PK = " + getPK().hashCode() + "\n" + "Balance = " + getBalance() + " " + getSymbol() + "\n";
	}

}
