

public class Cliente {
    Adaptador a = new Adaptador();

    public void multiplica(int v1, int v2){
        System.out.println(a.soma(v1,v2));

    }
    public void divide (int v1, int v2){
        System.out.println(a.subtrai(v1,v2));
    }

}
