package org.lasencinas.enZinium;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;

public class Address {

	private PublicKey PK = null;
	private PrivateKey SK = null;
	private double balance = 0d;
	private String symbol = "EZI";

	public Address() {

	}
	
	public String getSymbol() {
		return this.symbol;
	}
	

	public PublicKey getPublicKey() {
		return this.PK;
	}

	public void setPublicKey(PublicKey PK) {

		this.PK = PK;

	}

	public PrivateKey getPrivateKey() {
		return this.SK;
	}

	public void setPrivateKey(PrivateKey SK) {
		this.SK = SK;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return this.balance;
	}

	public void generateKeyPair() {

		KeyPair pair = GenSig.generateKeyPair();
		setPublicKey(pair.getPublic());
		setPrivateKey(pair.getPrivate());
	}

	@Override
	public String toString() {
		return "PK = " + getPublicKey().hashCode()  + "\n" + "Balance = "
				+ getBalance() + "\n";
	}

}
