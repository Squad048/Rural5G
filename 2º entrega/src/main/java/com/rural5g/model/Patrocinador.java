package com.rural5g.model;

public class Patrocinador {
	private int id_patrocinador;
	private String nome;
	private String email;
	private String celular;
	private String cpf;
	private String estado;
	private String cidade;
	private String bairro;

	public int getId_patrocinador() {
		return id_patrocinador;
	}

	public void setId_patrocinador(int id_patrocinador) {
		this.id_patrocinador = id_patrocinador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

}
