
public class Obje_event_moda  extends evento_General{

	String Diseñador,numModelos;

	public Obje_event_moda() {
		super();
	}

	/**
	 * @param duracion
	 * @param fecha
	 * @param localizacion
	 * @param entradas
	 * @param eLaboral
	 * @param precioEntrada
	 * @param nomEvento
	 * @param diseñador
	 * @param numModelos
	 */
	protected Obje_event_moda(String duracion, String fecha, String localizacion, String entradas, String eLaboral,
			String precioEntrada, String nomEvento, String diseñador, String numModelos) {
		super(duracion, fecha, localizacion, entradas, eLaboral, precioEntrada, nomEvento);
		Diseñador = diseñador;
		this.numModelos = numModelos;
	}

	public String getDiseñador() {
		return Diseñador;
	}

	public void setDiseñador(String diseñador) {
		Diseñador = diseñador;
	}

	public String getNumModelos() {
		return numModelos;
	}

	public void setNumModelos(String numModelos) {
		this.numModelos = numModelos;
	}
	
	
}
