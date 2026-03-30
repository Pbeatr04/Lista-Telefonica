package agenda;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaTelefonica {
   //Atributo principal
	private HashMap<String, String> agendaTelefonica;
	
	//Construtor
	public AgendaTelefonica() {
		this.agendaTelefonica = new HashMap<>();
		
	}
	
	//Método adicionar contato
	public void adicionarContato(String nome, String telefone) {
		agendaTelefonica.put(nome, telefone);
	}
	
	//Método procurar telefone pelo nome
	public String procurarTelefone(String nome) {
		return agendaTelefonica.getOrDefault(nome, null);
	}
	
	//Sobrescrevendo toString
	public String toString() {
		//TreeMap organiza em ordem alfabética
		TreeMap<String, String> ordenado = new TreeMap<>(agendaTelefonica);
		StringBuilder sb = new StringBuilder();
		for (Map.Entry<String, String> entrada : ordenado.entrySet()) {
			sb.append("Nome: ").append(entrada.getKey()).append(" | Telefone: ").append(entrada.getValue()).append("\n");
		}
		return sb.toString();
	}
	
}
