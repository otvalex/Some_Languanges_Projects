import java.util.Scanner;
public class Conta_Bancaria {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = scanner.nextLine();
		
		
		System.out.print("Depositar: ");
		double saldo = scanner.nextDouble();
		String tipoconta = "Corrente"; 
		System.out.print("Olá, " + nome + "! Você tem " + saldo + " reais. E seu tipo de conta é " + tipoconta +". ");
	
		int opcao = 0;
		
		String menu = """
				
				***Digite sua opção***
				1 | Consultar Saldo
				2 | Transferir
				3 | Receber
				4 | Encerrar)
						""";
		
		
		while (opcao < 4) {
			System.out.print(menu + "Digite um comando: ");
			opcao = scanner.nextInt();
			
			if (opcao == 1) {
					System.out.print("Saldo: " + saldo);
			} else if (opcao == 2) {
				System.out.print("Quanto deseja transferir?: ");
				double transferencia = scanner.nextDouble();
				if(transferencia > saldo) {
					System.out.print("Saldo insuficiente");
				} else if (transferencia < saldo) {
				saldo = saldo - transferencia;
				System.out.print("Transferência Realizada! Seu saldo atual é " + saldo);
				} 
				} else if(opcao == 3){
						System.out.print("Quanto irá receber?: ");
						double novosaldo = scanner.nextDouble();
						saldo = saldo + novosaldo;
						System.out.print("Seu novo saldo é: " + saldo);
					}
				else {
					opcao = 4;
					scanner.close();
				}
		}
	}

}