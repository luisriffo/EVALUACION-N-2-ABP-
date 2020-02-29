package cl.awakelab.articulos;

public class Electrodomestico {

	//Atributos
	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;
	
	//Constantes
	protected static final double PRECIO_BASE = 100;
	protected static final String COLOR = "blanco";
	protected static final char CONSUMO_ENERGETICO = 'F';
	protected static final double PESO = 5;
	
	//Constructores
	
	//Constructor por defecto
	public Electrodomestico() {
		this.precioBase = PRECIO_BASE;
		this.color = COLOR;
		this.consumoEnergetico = CONSUMO_ENERGETICO;
		this.peso = PESO;
	}
	//constructor con el precio y peso. El resto por defecto.

	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = COLOR;
		this.consumoEnergetico = CONSUMO_ENERGETICO;
	}
	public Electrodomestico(double precioBase, String color, 
			char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}
	
	//Metodos getters 
	
	public double getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}
	
	/*Metodo que comprueba que la letra es correcta, sino es correcta
	 *  usara la letra por defecto F.
	 */
	protected void comprobarConsumoEnergetico(char letra) {
		consumoEnergetico = letra;
		if (letra >='A' && letra <= 'F') {
			this.consumoEnergetico = letra;
		} else {
			letra = CONSUMO_ENERGETICO;
		}
	}

	/*comprueba que el color es correcto, 
	 * sino lo es usa el color por defecto
	 */
	protected void comprobarColor(String color) {
		String[] colores = new String[] {"blanco", "negro", "rojo", "azul", "gris"};
		
		for (String arraycolores : colores) {
			if (arraycolores.equals(color)) {
				this.color = color;
			} else {
				this.color = COLOR;
			}
		}
	}
	/*según el consumo energético, aumentara su precio, 
	 * y según su tamaño también.
	 */
	public double precioFinal(){
		double aumentoPrecio = 0;
		if (consumoEnergetico == 'A') {
			aumentoPrecio += 100;
		} else if(consumoEnergetico == 'B') {
			aumentoPrecio += 80;
		} else if(consumoEnergetico == 'C') {
			aumentoPrecio += 60;
		} else if(consumoEnergetico == 'D') {
			aumentoPrecio += 50;
		} else if(consumoEnergetico == 'E') {
			aumentoPrecio += 30;
		} else if(consumoEnergetico == 'F') {
			aumentoPrecio += 10;
		}
		
		if (peso>0 && peso<=19) {
			aumentoPrecio += 10;
		} else if(peso>=20 && peso<=49) {
			aumentoPrecio += 50;
		} else if(peso>=50 && peso<=79) {
			aumentoPrecio += 80;
		} else if(peso>=80) {
			aumentoPrecio += 100;
		}
		return precioBase+aumentoPrecio;
	}	
	
	@Override
	public String toString() {
		return "Electrodomestico [Precio= " + precioBase + " €" + ", Color= " + color + ", Consumo Energetico= "
				+ consumoEnergetico + ", Peso= " + peso + " Kg" + "]";
	}

	
}

	
	