package OpenClose;

public class Main {
    public static void main(String[] args) {
        FolhaPagamento folhaPagamento = new FolhaPagamento();
        folhaPagamento.calcular(new Estagio());
        folhaPagamento.calcular(new ContratoClt());




    }


}
