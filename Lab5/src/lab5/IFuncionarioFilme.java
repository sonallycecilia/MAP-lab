package lab5;

import java.util.List;

public interface IFuncionarioFilme {
    String getNome();
    String getContato();
    int getID();
    List<String> getFuncoesNoFilme(Filme filme); // Funções específicas que exerce NESTE filme
    void atribuirFuncaoNoFilme(Filme filme, String funcaoEspecifica);
}