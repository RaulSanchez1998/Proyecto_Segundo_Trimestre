
public class Obje_event_arte extends evento_General {

	
	protected String nombreArtista,numObras;

	public Obje_event_arte() {
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
	 * @param nombreArtista
	 * @param numObras
	 */
	protected Obje_event_arte(String duracion, String fecha, String localizacion, String entradas, String eLaboral,
			String precioEntrada, String nomEvento, String nombreArtista, String numObras) {
		super(duracion, fecha, localizacion, entradas, eLaboral, precioEntrada, nomEvento);
		this.nombreArtista = nombreArtista;
		this.numObras = numObras;
	}

	
	

	public String getDuracion() {
		return Duracion;
	}

	public void setDuracion(String duracion) {
		Duracion = duracion;
	}

	public String getFecha() {
		return Fecha;
	}

	public void setFecha(String fecha) {
		Fecha = fecha;
	}

	public String getLocalizacion() {
		return Localizacion;
	}

	public void setLocalizacion(String localizacion) {
		Localizacion = localizacion;
	}

	public String getEntradas() {
		return Entradas;
	}

	public void setEntradas(String entradas) {
		Entradas = entradas;
	}

	public String geteLaboral() {
		return eLaboral;
	}

	public void seteLaboral(String eLaboral) {
		this.eLaboral = eLaboral;
	}

	public String getPrecioEntrada() {
		return precioEntrada;
	}

	public void setPrecioEntrada(String precioEntrada) {
		this.precioEntrada = precioEntrada;
	}

	public String getNomEvento() {
		return nomEvento;
	}

	public void setNomEvento(String nomEvento) {
		this.nomEvento = nomEvento;
	}

	public String getNombreArtista() {
		return nombreArtista;
	}

	public void setNombreArtista(String nombreArtista) {
		this.nombreArtista = nombreArtista;
	}

	public String getNumObras() {
		return numObras;
	}

	public void setNumObras(String numObras) {
		this.numObras = numObras;
	}
	
	
}
