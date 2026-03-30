package agenda;

import java.util.*;


public class ListaTelefonica {
    private Map<String, String> agendaTelefonica = new HashMap<>();

    // Adicionar dados na agenda
    public void addAgenda(String nome, String telefone) {
        agendaTelefonica.put(nome, telefone);
    }

    // Método para procurar um telefone na agenda
    public String procura(String nome) {
        return agendaTelefonica.getOrDefault(nome, null);
    }

    @Override
    public String toString() {
        StringBuilder resultado = new StringBuilder();
        List<String> nomesOrdenados = new ArrayList<>(agendaTelefonica.keySet());
        Collections.sort(nomesOrdenados);

        for (String nome : nomesOrdenados) {
            resultado.append(nome).append(": ").append(agendaTelefonica.get(nome)).append("\n");
        }

        return resultado.toString();
    }
}
