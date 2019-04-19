
public class Cliente {
    public static void main(String args[]){
        String texto1 = Arquivo.lerArquivo(args[0]);
        ContadorEspacos espaco = new ContadorEspacos();
        ContadorLetraA letraA = new ContadorLetraA();
        ContadorNumPontos pontos = new ContadorNumPontos();

        System.out.println("Quantidade de Espaços: "+espaco.contagem(texto1));
        System.out.println("Quantidade de Letras A: "+letraA.contagem(texto1));
        System.out.println("Quantidade de pontos: "+pontos.contagem(texto1));
    }
}
