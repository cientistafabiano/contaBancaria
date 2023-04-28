package banco;

import java.util.Locale;
import java.util.Scanner;

import contaBancaria.ContaBancaria;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);			
		
		//String nConta;
		//String nameTitular;
		System.out.print("Enter account number: ");
		String nConta = sc.nextLine();
		System.out.print("Enter account holder: ");
		String nameTitular = sc.nextLine();
		//ContaBancaria contaB = new ContaBancaria("0001-1", "Fabiano Azedias");
		//construtor inicia depois que ja declaramos as variaveis aleatorias
		ContaBancaria contaB;
		
		System.out.print("Is there na initial deposit(y/n): ");
		char initial = sc.next().charAt(0);
		// char é aspas simples
		if (initial == 'y') {
			System.out.print("Enter initial deposit value: ");
			double inicioDeposito = sc.nextDouble();
			contaB = new ContaBancaria(nConta, nameTitular, inicioDeposito);
			System.out.println("Account data: ");
			System.out.println(contaB);
		}else {
			contaB = new ContaBancaria(nConta, nameTitular);
			System.out.println("Account data: ");
			System.out.println(contaB);
		}
		System.out.print("Enter a deposit value: ");
		contaB.deposito(sc.nextDouble());
		System.out.println("Update account data: ");
		System.out.println(contaB);
		
		System.out.print("Enter a withdraw value: ");
		contaB.saque(sc.nextDouble());
		System.out.println("Update account data: ");
		System.out.print(contaB);	
		
		sc.close();			
	}

}
