package com.itb.lip2.academiclogininf3a.model;

import java.time.LocalDate;

public class Usuario {
	private Long id;
	private String nome;
	private String sobrenome;
	private String email;
	private String senha;
	private boolean codStatusUsuario;
	private LocalDate dataNascimento;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public boolean isCodStatusUsuario() {
		return codStatusUsuario;
	}
	public void setCodStatusUsuario(boolean codStatusUsuario) {
		this.codStatusUsuario = codStatusUsuario;
	}
	public LocalDate getDataNasimento() {
		return dataNascimento;
	}
	public void setDataNasimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
}
