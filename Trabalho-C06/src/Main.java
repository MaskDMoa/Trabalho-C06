import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Computador c = new Computador();
        Cliente cliente = new Cliente();

        System.out.println("Digite o nome: ");
        cliente.Nome = sc.nextLine();
        System.out.println("Digite o cpf: ");
        cliente.Cpf = sc.nextLine();

        System.out.println("---------------------------------");
        System.out.println("Promoção de Computadores:");

        while(true) {

            System.out.println("---------------------------------");
            System.out.println("| 1 : Promoção Apple | 2 : Promoção Samsung | 3 : Promoção Dell |");

            System.out.println("---------------------------------");

            System.out.println("Digite o numero relacionado da Promoção: ");
            int ent = sc.nextInt();

            if(ent==0) {
                break;
            }

            System.out.println("---------------------------------");

            c.mostrarPCConfigs(ent);
        }

        sc.close();
    }
}
