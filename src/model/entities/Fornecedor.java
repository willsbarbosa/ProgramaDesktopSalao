package model.entities;

public class Fornecedor {
	private Long id;
	private String name;
	private Endereco end;
	private String tel;
	
	public Fornecedor() {
		
	}

	public Fornecedor(Long id, String name, Endereco end, String tel) {
		this.id = id;
		this.name = name;
		this.end = end;
		this.tel = tel;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Endereco getEnd() {
		return end;
	}

	public void setEnd(Endereco end) {
		this.end = end;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
}
