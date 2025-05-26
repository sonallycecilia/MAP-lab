package lab5;

public class AcessoFuncionarios { //testes
	private Funcionario funcionario;
	private Filme filme;
	private String funcaoEspecifica;
	
	public AcessoFuncionarios(Funcionario funcionario, Filme filme, String funcaoEspecifica) {
		this.funcionario = funcionario;
		this.filme = filme;
		this.funcaoEspecifica = funcaoEspecifica;
	}
	
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public Filme getFilme() {
		return filme;
	}
	public void setFilme(Filme filme) {
		this.filme = filme;
	}
	public String getFuncaoEspecifica() {
		return funcaoEspecifica;
	}
	public void setFuncaoEspecifica(String funcaoEspecifica) {
		this.funcaoEspecifica = funcaoEspecifica;
	}
	
	public void registrarAcesso() {
		System.out.println("Acesso registrado para: "+funcionario.getNome()+ 
				". Na função de: " + funcaoEspecifica + 
				". No filme: " + filme.getNome());
	}

}
