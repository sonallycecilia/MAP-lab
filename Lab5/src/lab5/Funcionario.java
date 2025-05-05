package lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Funcionario implements IFuncionarioFilme{
	private String nome;
	private int ID;
	private List<String> funcoes;
	private String contato;
	private List<String> funcoesGerais;
    private Map<Filme, List<String>> funcoesPorFilme; 
	
	public Funcionario(String nome, String contato, int ID) {
		this.nome = nome;
		this.contato = contato;
		this.ID = ID;
		this.funcoes = new ArrayList<>();
		this.funcoesGerais = new ArrayList<>();
        this.funcoesPorFilme = new HashMap<>();
	}
	@Override
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}
	@Override
	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public void setFuncoes(List<String> funcoes) {
		this.funcoes = funcoes;
	}
	
	public List<String> getFuncoesGerais() {
        return funcoesGerais;
    }

    public void adicionarFuncaoGeral(String funcao) {
        this.funcoesGerais.add(funcao);
    }
	@Override
	public List<String> getFuncoesNoFilme(Filme filme) {
		return funcoesPorFilme.getOrDefault(filme, new ArrayList<>());
	}

	@Override
	public void atribuirFuncaoNoFilme(Filme filme, String funcaoEspecifica) {
		funcoesPorFilme.computeIfAbsent(filme, k -> new ArrayList<>()).add(funcaoEspecifica);
		
	}
	
	 @Override
	    public String toString() {
	        return "Nome: " + nome +
	               ", Contato: " + contato +
	               ", Numero de identificação: " + ID +
	               (funcoesGerais.isEmpty() ? "" : ", Funções Gerais: " + String.join(", ", funcoesGerais));
	    }
}
