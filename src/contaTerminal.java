import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {
        /*TODO: Conhecer e importar a classe scanner;
        *       Exibir as mensagens para o nosso usuário;
        *       Obter pelo scanner os valores digitados no terminal
        *       Exibir a mensagem conta criada */
        int contaNumero;
        String contaAgencia;
        String nomeCliente;
        float saldo = 0;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Seja bem vindo ao banco Java.");
        System.out.println("Por favor, digite o número da Conta:");
        contaNumero = leitor.nextInt();
        System.out.println("Por favor, digite o número da Agência:");
        contaAgencia = leitor.nextLine();
        System.out.println("Por favor, digite o seu Nome:");
        nomeCliente = leitor.nextLine();
        System.out.println("");
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é ["+contaAgencia+"], conta["+contaNumero+"], e seu saldo ["+saldo+"] já está dispoível para saque.");
    }
}
