public class Cliente {
    public static void main(String []args) {
        Tabela t = new Tabela();
        Linha l = new Linha();
        Linha l1 = new Linha();
        Celula c = new Celula("Witoria");
        Celula c1 = new Celula("1998");
        l.adicionar(c);
        t.adicionar(l);
        t.adicionar(l1);
        l.adicionar(c);
        l.adicionar(c1);
        l.adicionar(c1);

        t.imprimir();

    }

}
