package Proyecto_Segundo_Trimestre;


public class Obje_event_moda  extends evento_General{

	private String Diseñador,numModelos;

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
	 * @param diseñador
	 * @param numModelos
	 */
	protected Obje_event_moda(String nomEvento, String localizacion, String duracion, String fecha, String entradas,
			String precioEntrada, String diseñador, String numModelos) {
		super(nomEvento, localizacion, duracion, fecha, entradas, precioEntrada);
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

	/* (non-Javadoc)
	 * @see Proyecto_Segundo_Trimestre.evento_General#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\n Diseñador: " + Diseñador + "\n Modelos: " + numModelos;
	}
	
	
}
