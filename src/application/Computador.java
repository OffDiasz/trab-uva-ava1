package trab_UvaAva1;


import java.util.Scanner;
import entities.Hardware;

public class Computador {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		//Instânciando a classe Hardware no programa principal
		Hardware hard1 = new Hardware();
		
		//Parte onde o usuário digita sua config. do computador
		System.out.println("Digite as seguintes informações sobre seu computador:");
		System.out.println("Quantos GB de memória ram: ");
		int ramDigit = leitor.nextInt();
		System.out.println("Quantos GB tem seu ssd?: ");
		int ssdDigit = leitor.nextInt();
		System.out.println("Qual modelo da sua placa de video?: ");
		String pvDigit = leitor.next();
		System.out.println("Qual modelo da sua placa mãe?: ");
		String pmDigit = leitor.next();
		
		//Apontando as informações para os objetos da classe hardware
		hard1.setMemRam(ramDigit);
		hard1.setSsd(ssdDigit);
		hard1.setPlaca_Video(pvDigit);
		hard1.setPlaca_Mae(pmDigit);
		
		System.out.println("Total da sua memória ram: " + hard1.getMemRam() + " GB");
		System.out.println("Memória total do seu ssd: " + hard1.getSsd() + " GB");
		System.out.println("Modelo da sua placa de vídeo: " + hard1.getPlaca_Video());
		System.out.println("Modelo da sua placa mãe: " + hard1.getPlaca_Mae());
		
		leitor.close();

	}

}
