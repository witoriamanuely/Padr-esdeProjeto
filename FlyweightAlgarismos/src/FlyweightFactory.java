import java.util.ArrayList;
import java.util.Random;

public class FlyweightFactory {
    protected ArrayList<Integer> flyweights = new ArrayList<Integer>();
    Random aleatorio = new Random();
    RealizaOperacao[] objeto = new RealizaOperacao[11];

    public FlyweightFactory(){
        for (int i = 0; i <10; i++) {
           objeto[i] = new RealizaOperacao(i);
           flyweights.add(objeto[i].algarismo());
        }
    }
    public void imprimeAleatorio(){
        for (int i = 0; i < flyweights.size(); i++){
        System.out.println(flyweights.get(aleatorio.nextInt(flyweights.size())));
    }}


}
