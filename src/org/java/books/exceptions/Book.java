package org.java.books.exceptions;

import java.util.EmptyStackException;

public class Book {
	String titolo;
	String autore;
	String editore;
	int numeroPagine;
	public Book(String titolo, String autore, String editore, int nPagine) throws Exception {
		super();
		validateStgring(titolo, "titolo");
		this.titolo=titolo;
		validateStgring(autore, "autore");
		this.autore=autore;
		validateStgring(editore, "editore");
		this.editore=editore;
		validatePageNumber(nPagine);
		this.numeroPagine=nPagine;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) throws EmptyStrings {
		validateStgring(titolo, "titolo");
		this.titolo = titolo;
	}
	public String getAutore()  {
		return autore;
	}
	public void setAutore(String autore) throws EmptyStrings {
		validateStgring(autore, "autore");
		this.autore = autore;
	}
	public String getEditore() {
		return editore;
	}
	public void setEditore(String editore) throws EmptyStrings {
		validateStgring(editore, "editore");
		this.editore = editore;
	}
	public int getNumeroPagine() {
		return numeroPagine;
	}
	public void setNumeroPagine(int numeroPagine) throws Exception {
		validatePageNumber(numeroPagine);
		this.numeroPagine = numeroPagine;
	}
	
	public void validateStgring(String stringa, String text) throws EmptyStrings {
		if(stringa.isBlank())
			throw new EmptyStrings(text);
	}
	public void validatePageNumber(int pagine) throws IsANumber{
		if(pagine<=0) 
			throw new IsANumber();
	}
	@Override
	public String toString() {
		return "Il titolo e': " + titolo + " Autore: " + autore + " Editore: " + editore + " Numero di pagine: " + numeroPagine ;
		
	}
}
