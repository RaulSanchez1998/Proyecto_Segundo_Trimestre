
public abstract class evento_General {

	protected String Duracion,Fecha,Localizacion,Entradas,eLaboral,precioEntrada,nomEvento;
	//Entradas vip

	/**
	 * 
	 */
	protected evento_General() {
		super();
	}
	/**
	 * @param duracion
	 * @param fecha
	 * @param localizacion
	 * @param nomEvento
	 */
	protected evento_General(String duracion, String fecha, String localizacion, String nomEvento) {
		super();
		Duracion = duracion;
		Fecha = fecha;
		Localizacion = localizacion;
		this.nomEvento = nomEvento;
	}
	/**
	 * @param duracion
	 * @param fecha
	 * @param localizacion
	 * @param entradas
	 * @param eLaboral
	 * @param precioEntrada
	 * @param nomEvento
	 */
	protected evento_General(String duracion, String fecha, String localizacion, String entradas, String eLaboral,
			String precioEntrada, String nomEvento) {
		super();
		Duracion = duracion;
		Fecha = fecha;
		Localizacion = localizacion;
		Entradas = entradas;	
		this.eLaboral = eLaboral;
		this.precioEntrada = precioEntrada;
		this.nomEvento = nomEvento;
	}
	
	
}
