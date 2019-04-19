
public  class RealizaOperacao implements Flyweight{
    int num = 0;
    RealizaOperacao(int numero){
        this.num = numero;
    }

    public int algarismo() {
        return this.num;
    }
}
