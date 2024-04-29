import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        String numAgencia, nomeClienteDigitado;
        double novoSaldo;
        int escolha;

        //TODO:Conhecer e importar a classe Usuario
        Usuario usuario = new Usuario();
        while(true){
            //Exibir as mensagens para nosso usuario
            System.out.print("######################\n\nBem-Vindo\nEste é o banco duvidoso\n\n######################\n\n");

            Scanner terminal = new Scanner(System.in);
            System.out.println("Digite o numero correpondente \nDigite 1 para: Cadastrar-se \nDigite 2 para: verificar conta");
            escolha = Integer.parseInt(terminal.nextLine());
            
            switch(escolha){
                case 1:
                    //Obter pela Usuario os valores digitados no terminal
                    System.out.println("\nDigite o numero da sua Agencia:");
                    usuario.numeroAgencia(numAgencia = terminal.nextLine());

                    System.out.println("\nDigite o seu nome: ");
                    usuario.nomeCliente(nomeClienteDigitado = terminal.nextLine());

                    System.out.println("\nDigite o saldo que deseja (digite conforme a intrução: 0.00)");
                    usuario.saldoConta(novoSaldo = Double.parseDouble(terminal.nextLine()));

                    //Exibir a mensagem conta criada
                    System.out.println("Conta criada com sucesso!");
                    usuario.numeroDaConta();
                    break;

                case 2:
                    //Exibir informações da conta
                    System.out.println("Seu numero: " + usuario.numero);
                    System.out.println("Sua Agencia: " + usuario.agencia);
                    System.out.println("Seu nome: " + usuario.nome);
                    System.out.println("Seu saldo: " + usuario.saldo);
                    break;
                default:
                    System.out.print("Digite um numero valido");
                    break;
            }
            System.out.println("Deseja Continuar navegando no Programa S/N");
            String simNao = terminal.nextLine();

            if (simNao == "N" || simNao == "n" ) {
                break;
            }
            
        }
    }
}
