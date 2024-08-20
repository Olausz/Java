package Tech.contas;
public class Conta {
    int numero;
    String nome;
    double saldo;
    double limite;

    void sacar (double quantidade) {
        double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;
    }
    
    public Conta(int numero, String nome, double saldo, double limite){
        System.out.println("Conta vazia Criada");
    }

}
