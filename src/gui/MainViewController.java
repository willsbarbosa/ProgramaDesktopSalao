package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.function.Consumer;

import application.Main;
import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.VBox;
import model.services.ClienteService;

public class MainViewController implements Initializable{

	/* Componentes da Main View */
	
	@FXML
	private MenuItem menuItemClientes;
	
	@FXML 
	private MenuItem menuItemAgendamendos;
	
	@FXML
	private MenuItem menuItemServi�os;
	
	@FXML
	private MenuItem menuItemAtendimentos;
	
	@FXML
	private MenuItem menuItemFornecedores;
	
	@FXML
	private MenuItem menuItemSair;
	
	@FXML
	private MenuItem menuItemRelatoriosCliente;
	
	@FXML
	private MenuItem menuItemRelatoriosFuncionario;
	
	@FXML
	private MenuItem menuItemRelatoriosGeral;
	
	@FXML
	private MenuItem menuItemRelatoriosProduto;
	
	@FXML
	private MenuItem menuItemFolhaDePagamento;
	
	@FXML
	private MenuItem menuItemSobre;
	
	/* ____________________________________________________________________________________________ */
	
	@FXML
	public void onMenuItemClientesAction() {
		loadView("/gui/ClienteList.fxml", (ClienteListController controller) -> { 
			controller.setClienteService(new ClienteService());
			controller.updateTableView(); });;
	}
	
	@FXML
	public void onMenuItemSobreAction() {
		loadView("/gui/Sobre.fxml", x -> {});
	}
	
	@Override
	public void initialize(URL uri, ResourceBundle rb) {

	}
	
	private <T> void loadView(String absoluteName, Consumer<T> initializingAction) {
		
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName)); //FXMLLoader carrega o fxml correspondente na tela
			
			VBox newVbox = loader.load(); // load no Vbox pois � o tipo da nova scene
			
			Scene mainScene = Main.getMainScene();
			
			VBox mainVbox = (VBox)((ScrollPane)mainScene.getRoot()).getContent();
			
			Node mainMenu = mainVbox.getChildren().get(0);
			
			mainVbox.getChildren().clear();
			
			mainVbox.getChildren().add(mainMenu);
			
			mainVbox.getChildren().addAll(newVbox.getChildren());
			
			T controller = loader.getController();
			initializingAction.accept(controller);
			
		}
		catch (IOException e){
			Alerts.showAlert("IOException", "Error loading view!", e.getMessage(), AlertType.ERROR);
			
		}
	}
	
}
