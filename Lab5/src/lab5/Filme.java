package lab5;
import java.util.ArrayList;
import java.util.List;

public class Filme {
	private String nome;
	private int ano;
	private Diretor diretor;
	private Roteirista roteirista;
	private List<Ator> elenco;
	private List<String> trilhaSonora;
	
	public Filme(String nome, int ano, Diretor diretor, Roteirista roteirista) {
		this.nome = nome;
		this.ano = ano;
		this.diretor = diretor;
		this.roteirista = roteirista;
		this.elenco = new ArrayList<>();
		this.trilhaSonora = new ArrayList<>();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public Diretor getDiretor() {
		return diretor;
	}
	public void setDiretor(Diretor diretor) {
		this.diretor = diretor;
	}
	
	public Roteirista getRoteirista() {
		return roteirista;
	}
	public void setRoteirista(Roteirista roteirista) {
		this.roteirista = roteirista;
	}
	
	public List<Ator> getElenco() {
		return elenco;
	}
	public void setElenco(List<Ator> elenco) {
		this.elenco = elenco;
	}
	
	public List<String> getTrilhaSonora() {
		return trilhaSonora;
	}
	public void setTrilhaSonora(List<String> trilhaSonora) {
		this.trilhaSonora = trilhaSonora;
	}

	public void adicionarAtor(Ator ator) {
		this.elenco.add(ator);
	}
	public void adicionarTrilhaSonora(String musica) {
		this.trilhaSonora.add(musica);
	}
	
	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder("--- Informações do Filme ---\n");
        sb.append("Nome: ").append(nome).append("\n");
        sb.append("Ano: ").append(ano).append("\n");
        sb.append("Diretor: ").append(diretor != null ? diretor.getNome() : "Não informado").append("\n");
        sb.append("Roteirista: ").append(roteirista != null ? roteirista.getNome() : "Não informado").append("\n");
        sb.append("Elenco:\n");
        if (!elenco.isEmpty()) {
            for (Ator ator : elenco) {
                sb.append("- ").append(ator.getNome()).append("\n");
            }
        } else {
            sb.append("Nenhum ator cadastrado.\n");
        }
        sb.append("Trilha Sonora:\n");
        if (!trilhaSonora.isEmpty()) {
            for (String musica : trilhaSonora) {
                sb.append("- ").append(musica).append("\n");
            }
        } else {
            sb.append("Nenhuma música cadastrada.\n");
        }
        sb.append("----------------------------");
        return sb.toString();
    }
}
