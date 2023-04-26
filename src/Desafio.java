import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
       String nome = "Odin";
       String tipoConta = "Corrente";
       double saldo = 2500.60;
       int opcao = 0;
       String menu = """
               **Digite a opcao desejada: **
               1 - Consultar Saldo
               2 - Transferir valor
               3 - Receber Valor
               4 - Sair
               """;


        System.out.println("********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo Atual: " + saldo);
        System.out.println("********************");

        Scanner leitura = new Scanner((System.in));
        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if(opcao == 1){
                System.out.println("O saldo atual é:" + saldo);
            }
            else if(opcao == 2){
                System.out.println("Digite o valor que deseja transferir: ");
                double valor = leitura.nextDouble();
                if (valor > saldo){
                    System.out.println("Saldo insufiente para realizar transferência");
                } else {
                    saldo = saldo - valor;
                    System.out.println("Saldo atualizado: " + saldo);
                }
            } else if (opcao == 3){
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo = saldo + valor;
                System.out.println("Saldo atualizado: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida");
            }

        }
    }
}
