package cl.awakelab.articulos;

public class Television extends Electrodomestico {

	/*Sus atributos son resolución (en pulgadas) y 
	 * sintonizador TDT (booleano), 
	 * además de los atributos heredados. */
	
	private double resolucion;
	private boolean sintonizadorTDT;
	
	/*Por defecto, la resolución será de 20 pulgadas y 
	 * el sintonizador será false.*/
	
	private static final double RESOLUCION = 20;
	private static final boolean SINTONIZADOR_TDT = false;
	
	//Constructores
	
	//Un constructor por defecto.
	
	public Television() {
		super();
		this.resolucion = RESOLUCION;
		this.sintonizadorTDT = SINTONIZADOR_TDT;
	}

	//Un constructor con el precio y peso. El resto por defecto.
	
	public Television(double precioBase, double peso) {
		super(precioBase, peso);
		this.resolucion = RESOLUCION;
		this.sintonizadorTDT = SINTONIZADOR_TDT;
	}
	/*Un constructor con la resolución, sintonizador TDT y 
	 * el resto de atributos heredados */
	
	public Television(double precioBase, String color, 
			char consumoEnergetico, double peso, double resolucion,
			boolean sintonizadorTDT) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
		
	}
	//metodos getters
	
	public double getResolucion() {
		return resolucion;
	}

	public boolean getSintonizadorTDT() {
		return sintonizadorTDT;
	}
	
	/*si tiene una resolución mayor de 40 pulgadas, se incrementara 
	 * el precio un 30% y si tiene un sintonizador TDT incorporado, 
	 * aumentara 50 €.*/
	
	public double precioFinal() {
		double aumentoPrecio = super.precioFinal();
		if (resolucion>=40) {
			aumentoPrecio +=precioBase*0.3;
		}
		if (sintonizadorTDT) {
			aumentoPrecio += 50;
		}
		return aumentoPrecio;
		}
	
	
	@Override
	public String toString() {
		return "Television [Resolucion= " + resolucion + ", Sintonizador TDT= " + sintonizadorTDT + ", Precio base= " 
				+ getPrecioBase() + " € " + ", Color= " + getColor() + ", Consumo Energetico= " + getConsumoEnergetico()
				+ ", peso= " + getPeso() + "Kg." + "]";
	}
	
}
