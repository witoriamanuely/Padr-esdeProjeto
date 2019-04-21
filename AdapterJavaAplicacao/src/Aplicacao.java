public class Aplicacao {
    int[][] matriz;

    public Aplicacao(){}

    public Aplicacao(int[][] matriz){
       this.matriz = matriz;
        }

    public int[] getChave() {
        return this.matriz[0];
    }

    public int[] getValor(){
        return  this.matriz[1];
    }
}

