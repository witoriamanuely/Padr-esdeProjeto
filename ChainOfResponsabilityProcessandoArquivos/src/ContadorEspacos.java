public class ContadorEspacos implements Contador{
    int cont = 0;
    public int contagem(String texto){
        for (int i = 0; i < texto.length(); i++){
            char letra = texto.charAt(i);
            if (letra == ' '){
                this.cont +=1;
            }
        }
        return this.cont;
    }
}
