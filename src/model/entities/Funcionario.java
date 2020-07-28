package model.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Funcionario implements Serializable{
	
	private Integer id;
	private String nome;
	private String tel;
	private Endereco end;
	private Double taxa;
	private Double salarioBase;
	
	public Funcionario() {
		
	}

	public Funcionario(Integer id, String nome, String tel, Endereco end, Double taxa, Double salarioBase) {
		this.id = id;
		this.nome = nome;
		this.tel = tel;
		this.end = end;
		this.taxa = taxa;
		this.salarioBase = salarioBase;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Endereco getEnd() {
		return end;
	}

	public void setEnd(Endereco end) {
		this.end = end;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	
	
}
