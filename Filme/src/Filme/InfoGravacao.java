package Filme;

import java.util.List;
public class InfoGravacao {
    public String nomeDoFilme;
    public String genero;

    public java.lang.String getGenero() {
        return genero;
    }

    public void setGenero(java.lang.String genero) {
        this.genero = genero;
    }

    public List<Ator> getListaAtores() {
        return listaAtores;
    }

    public void setListaAtores(List<Ator> listaAtores) {
        this.listaAtores = listaAtores;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public List<Ator> listaAtores;

    public Diretor diretor;

    public java.lang.String getNomeDoFilme() {
        return nomeDoFilme;
    }

    public void setNomeDoFilme(java.lang.String nomeDoFilme) {
        this.nomeDoFilme = nomeDoFilme;
    }

}
