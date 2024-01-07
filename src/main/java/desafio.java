import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = "Ana Bortoli";
        String tipoConta = "Corrente";
        double saldo = 1855.99;

        System.out.println("**************************");
        System.out.println("Dados do cliente");
        System.out.println("\nNome: " + nome);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo atual: " +saldo);
        System.out.println("\n******************************");

        int escolha = 0;

        String menu = """
                -----Operações-----
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                """;

        Scanner leitura = new Scanner(System.in);

        while (escolha != 4){
            System.out.println(menu);
            escolha = leitura.nextInt();

            if(escolha == 1){
                System.out.println("O saldo atualizado é: " + saldo);
            } else if (escolha == 2){
                System.out.println("Qual o valor que deseja transferir: ");
                double valor = leitura.nextDouble();
                if(valor > saldo){
                    System.out.println("Não há saldo para realizar transferencia");
                }else {
                    saldo -= valor;
                    System.out.println("Novo saldo: " + saldo);
                }
            }else if (escolha == 3){
                System.out.println("Valor recebido: " + saldo);
                double valor  = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo);
            } else if (escolha != 4){
                System.out.println("Escolha invalida");
            }
        }
    }
}
