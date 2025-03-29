import java.util.Scanner;


public class ContaTerminal {
    public static void main (String[] args) throws Exception{
        Scanner teclado = new Scanner(System.in);
       //TODO: conhecer e importar a classe Scanner
        int numero;
        String agencia, nomeCliente;
        float saldo;

       //Exibir as mensagens para o nosso usuário
       //Obter pela classe scanner os valores digitados no terminal
        System.out.println("Por favor digite o número da Agência: " );
        agencia = teclado.nextLine();

        System.out.println("Por favor digite o número da Conta:");
        numero = Integer.parseInt(teclado.nextLine());

        System.out.println("Por favor digite o nome do CLiente:");
        nomeCliente = teclado.nextLine();

        System.out.println("Por favor digite o saldo inicial:");
        saldo = Float.parseFloat(teclado.nextLine());

        

       //Exibir a mensagem da conta criada
       System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

       teclado.close();
    }
}