package com.curso.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="libros")
public class Libro {
	@Id
	private int isbn;
	private String titulo;	
	private String tematica;
	
	public Libro() {
		super();
	}

	public Libro(int isbn, String titulo, String tematica) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.tematica = tematica;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTematica() {
		return tematica;
	}

	public void setTematica(String tematica) {
		this.tematica = tematica;
	}

	
}
