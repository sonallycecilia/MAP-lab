package main;
import lab5.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<IFuncionarioFilme> funcionarios = new ArrayList<>();
    private static List<Filme> filmes = new ArrayList<>();
    private static List<AcessoFuncionarios> acessos = new ArrayList<>();

    public static void main(String[] args) {
        // a) Cadastrar todos os envolvidos em um filme informando sua(s) função(ões)

        // Cadastrando funcionários
        Diretor diretor1 = new Diretor("Ronaldo", "ronaldo@gmail.com", 001);
        Roteirista roteirista1 = new Roteirista("Jorge", "jorge@gmail.com", 002);
        Ator ator1 = new Ator("Julia", "julia@gmail.com", 003);
        Ator ator2 = new Ator("Sabrina", "sabrina@gmail.com", 004);
        Cinegrafista cinegrafo = new Cinegrafista("fulaninho", "fulano@gmail.com", 005);

        funcionarios.add(diretor1);
        funcionarios.add(roteirista1);
        funcionarios.add(ator1);
        funcionarios.add(cinegrafo);

        // Cadastrando filme
        Filme filme1 = new Filme("Bee movie", 2010, diretor1, roteirista1);
        filme1.adicionarAtor(ator1);
        filme1.adicionarTrilhaSonora("Time");
        filmes.add(filme1);

        // Registrando funções específicas no filme
        AcessoFuncionarios acessoDiretor = new AcessoFuncionarios(diretor1, filme1, "Diretor");
        AcessoFuncionarios acessoRoteirista = new AcessoFuncionarios(roteirista1, filme1, "Roteirista");
        AcessoFuncionarios acessoAtor = new AcessoFuncionarios(ator1, filme1, "Ator");
        AcessoFuncionarios acessoCinegrafo = new AcessoFuncionarios(cinegrafo, filme1, "Cinegrafista");
        
        acessos.add(acessoDiretor);
        acessos.add(acessoRoteirista);
        acessos.add(acessoAtor);
        acessos.add(acessoCinegrafo);

        diretor1.atribuirFuncaoNoFilme(filme1, "Diretor");
        roteirista1.atribuirFuncaoNoFilme(filme1, "Roteirista");
        // b) Informar a filmografia indicando sua função específica

        System.out.println("--- Filmografia de " + ator1.getNome() + " ---");
        for (AcessoFuncionarios acesso : acessos) {
            if (acesso.getFuncionario().equals(ator1)) {
                System.out.println("Filme: " + acesso.getFilme().getNome() + ", Função Específica: " + acesso.getFuncaoEspecifica());
            }
        }
        System.out.println();

        // c) Informar todas as características de um dado filme

        System.out.println("--- Características do Filme: " + filme1.getNome() + " ---");
        System.out.println(filme1);
    }
}