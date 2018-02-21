package org.mvpigs.Wallet;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import org.mvpigs.GenSig.GenSig;
import org.mvpigs.Transaction.*;
import org.mvpigs.BlockChain.*;

public class Wallet {
	private PublicKey address;
	private PrivateKey sKey;
	private double total_input;
	private double total_output;
	private double balance;
	private String inputTransactions;
	private String outputTransactions;
	
	public void generateKeyPair() {
	     KeyPair pair = GenSig.generateKeyPair();
	     setSK(pair.getPrivate());
	     setAddress(pair.getPublic());
	}

	public PublicKey getAddress() {
		return address;
	}

	public void setAddress(PublicKey address) {
		this.address = address;
	}

	public PrivateKey getSK() {
		return sKey;
	}

	public void setSK(PrivateKey sKey) {
		this.sKey = sKey;
	}
		 
}