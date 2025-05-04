package lab5;

public class Diretor extends Funcionario {
	public Diretor(String nome, String contato, int ID) {
		super(nome, contato, ID);
		adicionarFuncao("Diretor");
	}
}
