package Proyecto_Segundo_Trimestre;


public class Obje_event_moda  extends evento_General{

	private String Dise�ador,numModelos;

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
	 * @param dise�ador
	 * @param numModelos
	 */
	protected Obje_event_moda(String nomEvento, String localizacion, String duracion, String fecha, String entradas,
			String precioEntrada, String dise�ador, String numModelos) {
		super(nomEvento, localizacion, duracion, fecha, entradas, precioEntrada);
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

	/* (non-Javadoc)
	 * @see Proyecto_Segundo_Trimestre.evento_General#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\n Dise�ador: " + Dise�ador + "\n Modelos: " + numModelos;
	}
	
	
}
