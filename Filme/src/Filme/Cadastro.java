package Filme;

import Filme.Ator;
import Filme.Diretor;
import Filme.InfoGravacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Cadastro {

    public static void main(String[] args){
        System.out.println("Aplicativo Iniciado!");
        System.out.println("Cadastro NTT - Movies");

        Scanner ler = new Scanner(System.in);

        InfoGravacao GravacaoInfo = criarInfoGravacao(ler);

        System.out.println("Sinopse Filme:");
        System.out.println("Nome do Filme: " + GravacaoInfo.getNomeDoFilme());
        System.out.println("Nome do Diretor: " + GravacaoInfo.getDiretor().getNome());
        System.out.println("Nome do Ator: " + GravacaoInfo.getListaAtores().get(0).getNome());
        System.out.println("Nome do Estúdio : " + GravacaoInfo.getListaAtores().get(0).getEstudio());
    }

    public static InfoGravacao criarInfoGravacao (Scanner ler){
        InfoGravacao GravacaoInfo = new InfoGravacao();

        System.out.println("Informe o nome do Filme:");
        GravacaoInfo.setNomeDoFilme(ler.next());

        System.out.println("Informe o genero:");
        GravacaoInfo.setGenero(ler.next());

        GravacaoInfo.setDiretor(criarDiretor(ler));
        List<Ator> atores = new ArrayList<>();

        atores.add(createAtor(ler));

        GravacaoInfo.setListaAtores(atores);

        return GravacaoInfo;
    }

    private static Diretor criarDiretor(Scanner ler){
        Diretor diretor = new Diretor();

        System.out.println("Digite o nome do Diretor:");
        diretor.setNome(ler.next());

        return diretor;
    }

    private static Ator createAtor(Scanner ler){
        Ator ator = new Ator();

        System.out.println("Digite o nome do Ator:");
        ator.setNome(ler.next());

        return ator;
    }
}
