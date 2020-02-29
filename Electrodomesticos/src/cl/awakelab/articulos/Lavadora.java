package cl.awakelab.articulos;

/*Creamos una subclase llamada Lavadora
 * Su atributo es carga, además de los atributos heredados.
  Por defecto, la carga es de 5 kg. Usa una constante para ello*/

public class Lavadora extends Electrodomestico {
	
	//Atributos
	private int carga;
	private final static int CARGA_DEF=5;
	
	
	//Constructores
	//Un constructor por defecto.
	public Lavadora() {
		super();
		this.carga = CARGA_DEF;
	}
	//Un constructor con el precio y peso. El resto por defecto.
	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
		this.carga = CARGA_DEF;
		// TODO Auto-generated constructor stub
	}
	/*Un constructor con la carga y el resto de atributos heredados. 
	 * llamamos al constructor de la clase padre.
	 */
	public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, int carga) {
		super(precioBase, color, consumoEnergetico, peso); 
		this.carga= carga;
		// TODO Auto-generated constructor stub
	}
	//Metodos Getters
	public int getCarga() {
		return carga;
	}
	
	/*Metodo precioFinal():, si tiene una carga mayor de 30 kg, 
	 * aumentara el precio 50 €, sino es así no se incrementara
	 */
	public double precioFinal() {
		double aumentoPrecio = super.precioFinal();
		if (carga>= 30) {
			aumentoPrecio += 50;
		}
		return aumentoPrecio;
	}
	@Override
	public String toString() {
		return "Lavadora [Capacidad de carga= " + carga + " Kg" + ", Precio Base= " + getPrecioBase() + " €" + 
				", Color= " + getColor() + ", Consumo Energetico= " + 
				getConsumoEnergetico() + ", Peso= " + getPeso() + "Kg" + "]";
	}
		

}
