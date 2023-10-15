import java.util.Scanner;

//TESTE

public class Exemplo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] vetor = new int[5]; //variável local ao método main
		lerDados(vetor); //argumento é a variável que será enviado para o método
		int maior = numeroMaior(vetor);
		int menor = numeroMenor(vetor);
		System.out.println("Maior valor = " + maior);
		System.out.println("Menor valor = " + menor);
	
	}
	
	
	//Segunda Etapa
	
	public static int numeroMaior(int[] vetor) {
		int aux = vetor[0];
	    for(int i = 0; i < vetor.length; i++) {
	    	if(vetor[i] > aux) {
	    		aux = vetor[i];
	    	}
	    }
	    return aux;
	}
	
	public static int numeroMenor(int[] vetor) {
		int aux = vetor[0];
	    for(int i = 0; i < vetor.length; i++) {
	    	if(vetor[i] < aux) {
	    		aux = vetor[i];
	    	}
	    }
	    return aux;
	}
	
	
	//Primeira Etapa
	
	public static void lerDados(int[] vetor) { //parâmetro é a variável que recebe valor 
		Scanner numeroDigitado = new Scanner(System.in);
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Valor: ");
			vetor[i] = numeroDigitado.nextInt();
		}
		numeroDigitado.close();
		
	}
	
}
