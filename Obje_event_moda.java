
public class Obje_event_moda  extends evento_General{

	String Dise�ador,numModelos;

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
	 * @param dise�ador
	 * @param numModelos
	 */
	protected Obje_event_moda(String duracion, String fecha, String localizacion, String entradas, String eLaboral,
			String precioEntrada, String nomEvento, String dise�ador, String numModelos) {
		super(duracion, fecha, localizacion, entradas, eLaboral, precioEntrada, nomEvento);
		Dise�ador = dise�ador;
		this.numModelos = numModelos;
	}

	public String getDise�ador() {
		return Dise�ador;
	}

	public void setDise�ador(String dise�ador) {
		Dise�ador = dise�ador;
	}

	public String getNumModelos() {
		return numModelos;
	}

	public void setNumModelos(String numModelos) {
		this.numModelos = numModelos;
	}
	
	
}
