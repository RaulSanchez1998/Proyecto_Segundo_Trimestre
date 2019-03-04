package Proyecto_Segundo_Trimestre;



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
	 * @param precioEntrada
	 * @param nomEvento
	 * @param nombreArtistaM
	 * @param nomAlbum
	 */
	

	protected String getNombreArtistaM() {
		return nombreArtistaM;
	}

	/**
	 * @param nomEvento
	 * @param localizacion
	 * @param duracion
	 * @param fecha
	 * @param entradas
	 * @param precioEntrada
	 * @param nombreArtistaM
	 * @param nomAlbum
	 */
	protected Obje_event_musical(String nomEvento, String localizacion, String duracion, String fecha, String entradas,
			String precioEntrada, String nombreArtistaM, String nomAlbum) {
		super(nomEvento, localizacion, duracion, fecha, entradas, precioEntrada);
		this.nombreArtistaM = nombreArtistaM;
		this.nomAlbum = nomAlbum;
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

	/* (non-Javadoc)
	 * @see Proyecto_Segundo_Trimestre.evento_General#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\n Nombre artista" + nombreArtistaM + "\n Album: " + nomAlbum;
	}

	
}
