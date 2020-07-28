package model.entities;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Atendimento {
	
	private Integer ID;
	//private AtendimentoStatus status;
	private Cliente cliente;
	private Instant data;
	
	List<Funcionario> funcionarios = new ArrayList<>();
	List<Servico> servicos = new ArrayList<>();
	
	public Atendimento() {
		
	}
	
}
