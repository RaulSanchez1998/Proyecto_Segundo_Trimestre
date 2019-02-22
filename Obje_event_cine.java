
public class Obje_event_cine  extends evento_General {

	String nombreArtistaP,Pelicula;

	public Obje_event_cine() {
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
	 * @param nombreArtistaP
	 * @param pelicula
	 */
	protected Obje_event_cine(String duracion, String fecha, String localizacion, String entradas, String eLaboral,
			String precioEntrada, String nomEvento, String nombreArtistaP, String pelicula) {
		super(duracion, fecha, localizacion, entradas, eLaboral, precioEntrada, nomEvento);
		this.nombreArtistaP = nombreArtistaP;
		Pelicula = pelicula;
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

	public String getNombreArtistaP() {
		return nombreArtistaP;
	}

	public void setNombreArtista(String nombreArtistaP) {
		this.nombreArtistaP = nombreArtistaP;
	}

	public String getPelicula() {
		return Pelicula;
	}

	public void setPelicula(String pelicula) {
		Pelicula = pelicula;
	}
	
	
}
