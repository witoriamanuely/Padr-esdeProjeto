import java.util.ArrayList;
import java.util.List;

public class Linha implements Componente{

    private List<Componente> celulas = new ArrayList<Componente>();

    public void imprimir() {

        // Imprime a borda lateral.

        System.out.println(" |");

        // Imprime a linha.

        int tamanho = (celulas.size() * 17) + 5;

        char[] linha = new char[tamanho];

        for (int i = 0; i < tamanho; i++) linha[i] = '-';

        System.out.println(" " + new String(linha));

        for (Componente a: celulas) {
            //System.out.println(a.getConteudo());
            a.imprimir();
        }

    }

    public void adicionar(Celula c) {
        celulas.add(c);
    }

}