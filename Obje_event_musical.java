

public class Obje_event_musical  extends evento_General {

	String nombreArtistaM,nomAlbum; //añadir variable tema para poder organizar por tipo

	protected Obje_event_musical() {
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
	 * @param nombreArtistaM
	 * @param nomAlbum
	 */
	protected Obje_event_musical(String duracion, String fecha, String localizacion, String entradas, String eLaboral,
			String precioEntrada, String nomEvento, String nombreArtistaM, String nomAlbum) {
		super(duracion, fecha, localizacion, entradas, eLaboral, precioEntrada, nomEvento);
		this.nombreArtistaM = nombreArtistaM;
		this.nomAlbum = nomAlbum;
	}

	protected String getNombreArtistaM() {
		return nombreArtistaM;
	}

	protected void setNombreArtista(String nombreArtistaM) {
		this.nombreArtistaM = nombreArtistaM;
	}

	protected String getNomAlbum() {
		return nomAlbum;
	}

	protected void setNomAlbum(String nomAlbum) {
		this.nomAlbum = nomAlbum;
	}
	
}
