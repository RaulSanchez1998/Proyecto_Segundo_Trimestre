
public class Obje_event_deporte  extends evento_General{

	String Deporte,Premio;

	
	protected Obje_event_deporte() {
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
	 * @param deporte
	 * @param premio
	 */
	protected Obje_event_deporte(String duracion, String fecha, String localizacion, String entradas, String eLaboral,
			String precioEntrada, String nomEvento, String deporte, String premio) {
		super(duracion, fecha, localizacion, entradas, eLaboral, precioEntrada, nomEvento);
		Deporte = deporte;
		Premio = premio;
	}



	protected String getDeporte() {
		return Deporte;
	}

	protected void setDeporte(String deporte) {
		Deporte = deporte;
	}

	protected String getPremio() {
		return Premio;
	}

	protected void setPremio(String premio) {
		Premio = premio;
	}
	
	
}
