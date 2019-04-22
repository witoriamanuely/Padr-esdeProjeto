import java.util.ArrayList;
import java.util.List;

public class Tabela implements Componente {

    private List<Componente> linhas = new ArrayList<Componente>();

    public void adicionar(Linha l) {
        linhas.add(l);

    }

    @Override
    public void imprimir() {

        for(Componente l: linhas) {
            l.imprimir();
        }


    }

}