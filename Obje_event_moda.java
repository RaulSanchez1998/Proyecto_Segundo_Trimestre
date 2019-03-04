package Proyecto_Segundo_Trimestre;


public class Obje_event_moda  extends evento_General{

	String Diseņador,numModelos;

	public Obje_event_moda() {
		super();
	}

	
	
	/**
	 * @param nomEvento
	 * @param localizacion
	 * @param duracion
	 * @param fecha
	 * @param entradas
	 * @param precioEntrada
	 * @param diseņador
	 * @param numModelos
	 */
	protected Obje_event_moda(String nomEvento, String localizacion, String duracion, String fecha, String entradas,
			String precioEntrada, String diseņador, String numModelos) {
		super(nomEvento, localizacion, duracion, fecha, entradas, precioEntrada);
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

	/* (non-Javadoc)
	 * @see Proyecto_Segundo_Trimestre.evento_General#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\n Diseņador: " + Diseņador + "\n Modelos: " + numModelos;
	}
	
	
}
