public class Adaptador extends CalculadoraExistente {
    private int total = 0, cont = 0;

    public int soma(int v1, int v2){
        for (int i = 0; i < v1; i++){
            this.total += v2;
        }
        return this.total;
    }
    public int subtrai(int v1, int v2){
        while(v1 > 0 && v2 <= v1) {
            v1 -= v2;
            this.cont += 1;
        }
        return this.cont;
    }

}
