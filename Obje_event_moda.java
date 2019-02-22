
public class Obje_event_moda  extends evento_General{

	String Diseņador,numModelos;

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
	 * @param diseņador
	 * @param numModelos
	 */
	protected Obje_event_moda(String duracion, String fecha, String localizacion, String entradas, String eLaboral,
			String precioEntrada, String nomEvento, String diseņador, String numModelos) {
		super(duracion, fecha, localizacion, entradas, eLaboral, precioEntrada, nomEvento);
		Diseņador = diseņador;
		this.numModelos = numModelos;
	}

	public String getDiseņador() {
		return Diseņador;
	}

	public void setDiseņador(String diseņador) {
		Diseņador = diseņador;
	}

	public String getNumModelos() {
		return numModelos;
	}

	public void setNumModelos(String numModelos) {
		this.numModelos = numModelos;
	}
	
	
}
