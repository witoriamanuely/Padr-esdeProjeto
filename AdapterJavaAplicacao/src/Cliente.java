public class Cliente {
    public static void main(String[] args){
        int[][] matriz = {{0, 1, 2,3,4,5,6}, {6,5,4,3,2, 1, 0}};
        Adaptador a = new Adaptador(matriz);
        a.adicionaMap();
        a.imprimeMap();

    }
}
