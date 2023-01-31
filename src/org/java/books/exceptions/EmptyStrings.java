package org.java.books.exceptions;

public class EmptyStrings extends Exception {

	public EmptyStrings(String text) {
		super("non hai inserito nessun valore nel: " + text.toUpperCase() + ", devi ripetere l'inserimento");
		// TODO Auto-generated constructor stub
	}

}
