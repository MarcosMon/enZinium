package org.lasencinas.enZinium;

import java.security.PublicKey;

public class TokenContract {

	private PublicKey ownerPK = null;
	private String name = null;
	private int totalSupply = 0;

	public TokenContract() {
	}

	public TokenContract(PublicKey PK) {

		this.setOwnerPK(PK);

	}

	private void setOwnerPK(PublicKey PK) {
		this.ownerPK = PK;
	}

	public PublicKey getAddres() {
		return this.ownerPK;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

}
