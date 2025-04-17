import java.util.Scanner;

public class ContaTerminal {
    //metodo para concatenar e exiber a mensagem final
    static String infusuario(String nome, String agencia, int numeroConta, double saldo) {
        return "Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "
            + agencia + ", conta " + numeroConta + " e seu saldo de R$ " + saldo + " já está disponível para saque.";
    }

    public static void main(String[] args) {
        //todo: intuito dessa aplicação é exibe o nome, agencia, número da conta e saldo, sendo os dados fornecidos pelos usuários.
        try (Scanner sc = new Scanner(System.in)) {
            // exibindo mensagem de boas-vindas ao usuario.
            System.out.println("'-----------------------------------------------------'");
            System.out.println("Bem-vindo ao Nosso Banco");
            System.out.println("'-----------------------------------------------------'");
            //
            double saldo = 12546.10;

            System.out.print("Insira a sua agência: ");
            String agencia = sc.nextLine();

            System.out.print("Insira sua Conta: ");
            int numeroConta = sc.nextInt();
            sc.nextLine(); // Consumir o \n que sobrou após o nextInt

            System.out.print("Insira seu nome: ");
            String nomeUsuario = sc.nextLine();

           
            System.out.println(infusuario(nomeUsuario, agencia, numeroConta, saldo));
        }
    }
}
