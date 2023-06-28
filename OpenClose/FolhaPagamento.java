package OpenClose;

public class FolhaPagamento {
    protected float saldo;
    public void calcular(Remuneravel funcionario){
        this.saldo = funcionario.remuneracao();
        System.out.println(this.saldo);

    }
}
