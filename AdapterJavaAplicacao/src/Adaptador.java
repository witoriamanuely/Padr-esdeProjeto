import java.util.HashMap;
import java.util.Map;

public class Adaptador extends Aplicacao implements Alvo {
    protected Map<Integer, Integer> mapa = new HashMap<Integer, Integer>();


    public Adaptador(int[][] matriz){
        super(matriz);
    }

    public void adicionaMap() {
        for (int i = 0; i < getChave().length; i ++){
                this.mapa.put(getChave()[i],getValor()[i]);
            }
    }
    public void imprimeMap(){
        for (int chave : this.mapa.keySet()){
            System.out.println("Chave: "+chave+" Valor: "+this.mapa.get(chave));
        }
    }

}
