package org.java.books.exceptions;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Book[] arrayBooks = new Book[1];
		int i =0;
		String titolo="";
		String autore="";
		String editore="";
		int nPagine = 0;
		while(i<arrayBooks.length) {
			System.out.println("Inserisci il titolo del libro: ");
			titolo= s.nextLine();
			System.out.println("Inserisci il autore del libro: ");
			autore= s.nextLine();
			System.out.println("Inserisci il editore del libro: ");
			editore= s.nextLine();
			System.out.println("Inserisci il numero di pagine del libro: ");
			nPagine = Integer.parseInt(s.nextLine());
			try {
				Book book = new Book(titolo, autore, editore, nPagine);
				arrayBooks[i]= book;
				i++;
				System.out.println("Libro inserito correttamente");
			} catch (EmptyStrings e) {
				System.out.println(e.getMessage());	
			}catch(IsANumber e) {
				System.out.println(e.getMessage());
			}
		}
		for(int j =0; j< arrayBooks.length; j++) {
			System.out.println(j + ") "+ arrayBooks[j].toString());
		}
	
		
		
	
	
		
	}
}


