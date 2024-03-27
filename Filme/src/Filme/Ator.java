package Filme;
import java.util.List;
public class Ator  extends Pessoa{

    public List<String> filmesTrabalhados;
    public String estudio;

    public List<String> getFilmesTrabalhados() {
        return filmesTrabalhados;
    }

    public void setFilmesTrabalhados(List<String> filmesTrabalhados) {
        this.filmesTrabalhados = filmesTrabalhados;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
}
