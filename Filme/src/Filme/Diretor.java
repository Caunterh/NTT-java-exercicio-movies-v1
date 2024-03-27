package Filme;

import java.util.List;
public class Diretor extends Pessoa{

    public List<String> filmesDirigidos;
    public String estudio;

    public List<String> getFilmesDirigidos() {
        return filmesDirigidos;
    }

    public void setFilmesDirigidos(List<String> filmesDirigidos) {
        this.filmesDirigidos = filmesDirigidos;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
}
