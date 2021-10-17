package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidade.Empregado;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Empregado> lista = new ArrayList<>();

		System.out.print("Quantos empregados ser�o registrados? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.println();
			System.out.println("Empregado #" + (i + 1) + ": ");

			System.out.print("Id: ");
			Integer id = sc.nextInt();

			System.out.println("Nome: ");
			sc.nextLine(); // para limpar o buffer;
			String nome = sc.nextLine();

			System.out.println("Sal�rio: ");
			Double salario = sc.nextDouble();

			Empregado emp = new Empregado(id, nome, salario);
			
			lista.add(emp);
		}

		System.out.println("Entre com o id do funcion�rio que ter� o sal�rio acrescido: ");
		Integer buscaId = sc.nextInt();
		
		Integer posicao = temId(lista, buscaId);
		
		if (posicao == null) {
			System.out.println("Esse ID n�o existe!");
		} else {
			System.out.println("Entre com a porcentagem: ");
			double porcentagem = sc.nextDouble();
			lista.get(posicao).aumentaSalario(porcentagem); 
		}
		
		System.out.println();
		System.out.println("Lista de funcion�rios: ");
		
		for(Empregado emp: lista) {
			System.out.println(emp);
		}

		sc.close();

	}
	
	public static Integer temId(List<Empregado> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}		
		return null;
	}

}
