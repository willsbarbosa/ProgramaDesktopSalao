package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private Integer id;
	private Cliente cliente;
	//private PedidoStatus status;
	
	List<Produto> produtos = new ArrayList<>();
	
	
}
