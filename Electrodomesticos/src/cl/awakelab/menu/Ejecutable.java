package cl.awakelab.menu;

import cl.awakelab.articulos.*;

public class Ejecutable {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crea un array de Electrodomésticos de 10 posiciones.
		
		Electrodomestico listaElectrodomesticos[] = new Electrodomestico[10];
		
		/*Asigna a cada posición un objeto de las clases anteriores 
		 * con los valores que desees.
		 */
		
		listaElectrodomesticos[0] = new Electrodomestico(); //por defecto 100+10+10
		listaElectrodomesticos[1] = new Electrodomestico(250, 15);//250+10+10 consumo y color x defecto
		listaElectrodomesticos[2] = new Electrodomestico(80, "gris", 'B', 10);//80+10+80
		listaElectrodomesticos[3] = new Electrodomestico(150, "rojo", 'A', 13);//150+10+100
		
		listaElectrodomesticos[4] = new Television(); //por defecto 100+10+10
		listaElectrodomesticos[5] = new Television(190, 25); //190+50+10
		// 200+10+100+ 60 (aumenta precio por pulgadas) + 50 (aumenta precio por sintonizador)
		listaElectrodomesticos[6] = new Television(200, "gris", 'A', 10, 42, true);
			
		listaElectrodomesticos[7] = new Lavadora();//por defecto 100+10+10
		listaElectrodomesticos[8] = new Lavadora(250, 80);//250+100+10 consumo y color def
		//300+100+80+50(aumenta precio por carga)
		listaElectrodomesticos[9] = new Lavadora(300, "azul", 'B', 90, 35);
		
		System.out.println("**********Lista de Electrodomesticos**********\n");
		
		for (Electrodomestico electrodomestico : listaElectrodomesticos) {
			System.out.println(electrodomestico);
		}
		
		double precioFinalElectrodomestico = 0;
		double precioFinalTelevision = 0;
		double precioFinalLavadora = 0;
		
		for (int i = 0; i < listaElectrodomesticos.length; i++) {
			
			if (listaElectrodomesticos[i] instanceof Electrodomestico) {
				 precioFinalElectrodomestico += listaElectrodomesticos[i].precioFinal();
			}
			if (listaElectrodomesticos[i] instanceof Television) {
				precioFinalTelevision += listaElectrodomesticos[i].precioFinal();
			}
			if (listaElectrodomesticos[i] instanceof Lavadora) {
				precioFinalLavadora += listaElectrodomesticos[i].precioFinal();
			}
		}
	
		/*Se muestra el precio de cada clase, es decir, el precio de todas las 
		 * televisiones, por un lado, el de las lavadoras por otro y 
		 * la suma de los Electrodomésticos
		 */
		
		System.out.println("\n**********Suma de Precios**********");
		System.out.println("\nSuma de Precios Electrodomestico: " +precioFinalElectrodomestico + " €");
		System.out.println("\nSuma de Precios Televisión: " +precioFinalTelevision + " €");
		System.out.println("\nSuma de Precios Lavadora: " +precioFinalLavadora+ " €");
	}


}
