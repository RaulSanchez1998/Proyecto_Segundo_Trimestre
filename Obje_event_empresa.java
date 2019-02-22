
public class Obje_event_empresa  extends evento_General{

	
	String Tema,Invitados;

	protected Obje_event_empresa() {
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
	 * @param tema
	 * @param invitados
	 */
	protected Obje_event_empresa(String duracion, String fecha, String localizacion, String entradas, String eLaboral,
			String precioEntrada, String nomEvento, String tema, String invitados) {
		super(duracion, fecha, localizacion, entradas, eLaboral, precioEntrada, nomEvento);
		Tema = tema;
		Invitados = invitados;
	}



	protected String getTema() {
		return Tema;
	}

	protected void setTema(String tema) {
		Tema = tema;
	}

	protected String getInvitados() {
		return Invitados;
	}

	protected void setInvitados(String invitados) {
		Invitados = invitados;
	}
	
	
}
