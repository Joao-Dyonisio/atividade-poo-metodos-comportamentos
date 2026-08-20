package Model;

public class Passageiro {
    public String nome;
    public double saldo;
    public String cpf;
    public int idade;

    public Passageiro(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = 0.00;
        this.idade = idade;
    }


    public void adicionarSaldo(double valor) {

        if (valor <= 0) {
            System.out.println("Erro: O valor deve ser positivo e maior que zero");
            return;
        }
        this.saldo += valor;
        System.out.println("Recarga realizada com sucesso. Novo saldo: " + this.saldo);
    }
    public void pagarViagem(double valor) {

        if (valor <= 0) {
            System.out.println("Erro: O valor da viagem é inválido");
            return;
        }

        if (valor > this.saldo) {
            System.out.println("Erro: Saldo insuficiente para realizar a viagem");
            return;
        }

        this.saldo -= valor;
        System.out.println("Viagem paga com sucesso. Saldo: " + this.saldo);
    }
    public void apresentarDocumento() {
        System.out.println("CPF: " + this.cpf);
        System.out.println("Passageiro: " + this.nome);
    }
    public void podeViajarSozinho() {
        if (this.idade < 18) {
            System.out.println("Menor de idade. Não pode viajar sozinho.");
        }
        else {
            System.out.println("Pode viajar sozinho.");
        }
    }
}
