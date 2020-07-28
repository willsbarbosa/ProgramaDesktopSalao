package model.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Cliente implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nome;
	private String tel;
	private Endereco end;
	
	List<Pedido> pedidos = new ArrayList<>();	
	List<Atendimento> atendimentos = new ArrayList<>();
	
	public Cliente() {
		
	}

	public Cliente(Long id, String nome, String tel, Endereco end) {
		this.id = id;
		this.nome = nome;
		this.tel = tel;
		this.end = end;
	}

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

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public List<Atendimento> getAtendimentos() {
		return atendimentos;
	}	
	
	
}
