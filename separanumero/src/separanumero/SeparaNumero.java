package separanumero;

public class SeparaNumero {

	public static void main(String[] args) {
		
		double numero = 761244645;
		int cont = 0;
		
		while (numero > 0) {	
			numero = numero/10;
			cont++;
			while(numero > 1 && numero < 10) {
				System.out.print((int)numero+" ");
				numero = numero -(int)numero;
				numero = (numero*(10+Math.pow(10, -cont)));// fator de multiplicação 
			}
		}

	}

}
