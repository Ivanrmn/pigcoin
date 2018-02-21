package org.mvpigs.Transaction;

import java.security.PublicKey;

public class Transaction {
	
	private String hash;
	private String prev_hash;
	private PublicKey pKey_sender;
	private PublicKey pKey_recipient;
	private double pigcoins=0d;
	private String message;
	private byte[] signature;

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public String getPrev_hash() {
		return prev_hash;
	}

	public void setPrev_hash(String prev_hash) {
		this.prev_hash = prev_hash;
	}

	public PublicKey getpKey_sender() {
		return pKey_sender;
	}

	public void setpKey_sender(PublicKey pKey_sender) {
		this.pKey_sender = pKey_sender;
	}

	public PublicKey getpKey_recipient() {
		return pKey_recipient;
	}

	public void setpKey_recipient(PublicKey pKey_recipient) {
		this.pKey_recipient = pKey_recipient;
	}

	public double getPigcoins() {
		return pigcoins;
	}

	public void setPigcoins(int pigcoins) {
		this.pigcoins = pigcoins;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public byte[] getSignature() {
		return signature;
	}

	public void setSignature(byte[] signature) {
		this.signature = signature;
	}
		


}