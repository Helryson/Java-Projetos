import java.text.BreakIterator;
import java.util.*;
import javax.swing.JOptionPane;

public class Conta {
    Date data = new Date();
    private String Nome;
    private double Saldo;
    private String Dados, Titular, Numero;
    private int Agencia;


    void recebeDados(String numero, int agencia) {
        this.Numero = numero;
        this.Dados += "\nNumero: " + numero;
        this.Agencia = agencia;
        this.Dados += "\nAgência: " + agencia;
        this.Dados += "\nData de abertura da conta: " + data;
    }

    String impressaoDados(){
        return this.Dados;
    }
    
    void Pessoa(String nome){
        this.Nome = nome;
        this.Dados += "\nTitular: " + nome;
    }
    
    void Saque(double saque){
        if(saque<=this.Saldo){
            this.Saldo -= saque;
        }
    }
    
    void Deposito(double deposito){
        this.Saldo += deposito;
    }
    
    double Rendimentos(){
        return this.Saldo * 0.1;
    }
    
    double Saldo(){
        return this.Saldo;
    }

    
        public static void main(String[] args) {
            Conta conta = new Conta();
            Scanner tecla = new Scanner(System.in);
            String escolha;

            JOptionPane.showMessageDialog(null, "Seja bem vindo ao Caixa Eletrônico!");

            JOptionPane.showMessageDialog(null, "Vamos começar com o cadastro.");
            String nome = JOptionPane.showInputDialog("Primeiramente me diga seu nome:");
            conta.Pessoa(nome);

            String numero = JOptionPane.showInputDialog("Agora o número da sua conta: (com o -)");
            int agencia = Integer.parseInt(JOptionPane.showInputDialog("Por fim, insira o o numero de sua Agência"));
            conta.recebeDados(numero, agencia);

            double deposito = Double.parseDouble(JOptionPane.showInputDialog("Para começar, insira um depósito inicial:"));
            conta.Deposito(deposito);

            JOptionPane.showMessageDialog(null, "Seu novo saldo agora é " + conta.Saldo());
            

            do{
                escolha = JOptionPane.showInputDialog("Informe a operação desejada: \n1 - Depositar\n2 - Sacar\n3 - Olhar saldo\n4 - Informe de rendimentos\n5 - Dados bancários\n6 - Sair");

                    switch(escolha){

                        case "1": 
                        deposito = Double.parseDouble(JOptionPane.showInputDialog("Valor a ser depositado: "));
                        conta.Deposito(deposito);
                        JOptionPane.showMessageDialog(null, "Seu novo saldo agora é " + conta.Saldo());
                        continue;

                        case "2":
                        double saque = Double.parseDouble(JOptionPane.showInputDialog("Valor a ser sacado: "));
                        if(conta.Saldo()<saque){
                            JOptionPane.showMessageDialog(null, "Seu saldo é insuficiente.\nSaldo atual: " + conta.Saldo());
                            continue;
                        }
                        conta.Saque(saque);
                        JOptionPane.showMessageDialog(null, "Seu novo saldo agora é " + conta.Saldo());
                        continue;

                        case "3":
                        JOptionPane.showMessageDialog(null, "Seu saldo é " + conta.Saldo());
                        continue;

                        case "4":
                        JOptionPane.showMessageDialog(null, "Seu rendimento mensal atual é de: " + conta.Rendimentos());
                        continue;

                        case "5":
                        JOptionPane.showMessageDialog(null, "Seus dados: " + conta.impressaoDados());
                        continue;

                        case "6":
                        break;

                    }
            }while(!escolha.equalsIgnoreCase("6"));

                JOptionPane.showMessageDialog(null, "Obrigado por testar este projeto, volte sempre :)");
            
        }
}