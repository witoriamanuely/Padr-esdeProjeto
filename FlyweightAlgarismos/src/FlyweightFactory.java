import java.io.SyncFailedException;
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
            System.out.print((i+1)+"º N: ");
            for (int j = 0; j < flyweights.size(); j++){
                System.out.print(flyweights.get(aleatorio.nextInt(flyweights.size())));

            }
            System.out.print("\n");
        }

    }


}
