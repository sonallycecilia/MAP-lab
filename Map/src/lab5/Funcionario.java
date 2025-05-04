package lab5;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {
	private String nome;
	private int ID;
	private List<String> funcoes;
	private String contato;
	
	public Funcionario(String nome, String contato, int ID) {
		this.nome = nome;
		this.contato = contato;
		this.ID = ID;
		this.funcoes = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}
	
	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public List<String> getFuncoes() {
		return funcoes;
	}

	public void setFuncoes(List<String> funcoes) {
		this.funcoes = funcoes;
	}
	
	public void adicionarFuncao(String funcao){
		this.funcoes.add(funcao);
	}
	
	@Override
    public String toString() {
        return "Nome: " + nome +
               ", Contato: " + contato +
               ", Número de identificação: " + ID +
               (funcoes.isEmpty() ? "" : ", Funções: " + String.join(", ", funcoes));
    }
}
