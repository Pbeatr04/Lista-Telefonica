package agenda;

public class SysAgenda {

	public static void main(String[] args) {

		//Instanciando AgendaTelefonica
		AgendaTelefonica agenda = new AgendaTelefonica();

		//Adicionando contatos
		agenda.adicionarContato("Elle", "5555-5555");
		agenda.adicionarContato("Jennie", "2828-2828");
		agenda.adicionarContato("Jay", "0202-0202");
		agenda.adicionarContato("Evan", "0101-0101");

		//Procurar contato existente
		String nomeBusca = "Jennie";
		String telefone = agenda.procurarTelefone(nomeBusca);
		if (telefone != null) {
			System.out.println("Contato encontrado : " + nomeBusca + " - " + telefone);
		} else {
			System.out.println("Contato: " + nomeBusca + " não encontrado ");
		}

		//Procurar contato não existente
		nomeBusca = "Narin";
		telefone = agenda.procurarTelefone(nomeBusca);
		if (telefone != null) {
			System.out.println("Contato encontrado : " + nomeBusca + " - " + telefone);
		} else {
			System.out.println("Contato: " + nomeBusca + " não encontrado ");
		}
		System.out.println("\nLista de contatos:");
		System.out.println(agenda.toString());

	}

}