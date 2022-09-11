package com.init;

public class mainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int numeroif = -4;
		
		if(numeroif>0) {
			System.out.println("Es positivo");
		} else if(numeroif==0) {
			System.out.println("Es cero");
		} else if(numeroif<0) {
			System.out.println("Es negativo");
		}
		int numerowhile = 0;
		
		
		while(numerowhile < 3) {
			numerowhile++;
			System.out.println(numeroif);
		}
		
		do{
			System.out.println("Ejecucion 1");
		} while(numerowhile < 3);
		
		
		
		for(int numerofor = 0; numerofor <= 3; numerofor++) {
			System.out.println("numerofor " + numerofor);
		}	
		
		String estacion = "";
		
		switch(estacion) {
		case "otoño": 
			
			System.out.println("Es otoño");
		break;
		
		case "invierno":
			System.out.println("Es invierno");
			break;
			
		case "verano":
			System.out.println("Es verano");
			break;
			
		case "primavera":
			System.out.println("Es primavera");
			break;
			
			
			default:
				System.out.println("No es una estacion");
				break;
		}

}

	
	
}


