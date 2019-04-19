public class ContadorLetraA implements Contador{
    int cont = 0;
    public int contagem(String texto){
        for (int i = 0; i < texto.length(); i++){
            char letra = texto.charAt(i);
            if (letra == 'a'){
                this.cont +=1;
            }
        }
        return this.cont;
}
}
