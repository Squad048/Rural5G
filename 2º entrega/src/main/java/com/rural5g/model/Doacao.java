package com.rural5g.model;

public class Doacao {

	private int id_doacao;
	private String nome;
	private int id_escola;
	private int id_doador;
	private String entidade_doador;

	public int getId_doacao() {
		return id_doacao;
	}

	public void setId_doacao(int id_doacao) {
		this.id_doacao = id_doacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId_escola() {
		return id_escola;
	}

	public void setId_escola(int id_escola) {
		this.id_escola = id_escola;
	}

	public int getId_doador() {
		return id_doador;
	}

	public void setId_doador(int id_doador) {
		this.id_doador = id_doador;
		
	}

	public String getEntidade_doador() {
		return entidade_doador;
	}

	public void setEntidade_doador(String entidade_doador) {
		this.entidade_doador = entidade_doador;
	}
	
	


}
