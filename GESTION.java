package Proyecto_Segundo_Trimestre;

import java.util.ArrayList;
import java.util.Iterator;

public class GESTION {

	// Array de eventos (Englobara todos los eventos y se usara poliformismo)

	ArrayList<evento_General> listaEventos = new ArrayList<evento_General>();
	{
		listaEventos.add(new Obje_event_arte("vacio", "Localizacion", "Duracion", "Fecha", "10", "20", "nombreArtista",
				"numObras"));

		listaEventos.add(new Obje_event_arte("Nombre", "Localizacion", "Duracion", "Fecha", "7", "8", "nombreArtista",
				"numObras"));

		listaEventos.add(new Obje_event_cine("nomEvento", "localizacion", "duracion", "fecha", "7", "8",
				"nombreArtistaP", "pelicula"));
	}

	ArrayList<FACTURACION> listaFactura = new ArrayList<FACTURACION>();

	public GESTION() {

	}

	public void añadirArte(Obje_event_arte ea) { // Añadir objeto arte al array

		listaEventos.add(ea);
	}

	public void añadirCine(Obje_event_cine ec) {// Añadir objeto cine al array

		listaEventos.add(ec);
	}

	public void añadirDeporte(Obje_event_deporte ed) { // Añadir objeto deporte al array

		listaEventos.add(ed);
	}

	public void añadirEmpresa(Obje_event_empresa ee) { // Añadir objeto empresa al array

		listaEventos.add(ee);
	}

	public void añadirModa(Obje_event_moda em) { // Añadir objeto moda al array

		listaEventos.add(em);
	}

	public void añadirMusical(Obje_event_musical eu) { // Añadir objeto musical al array

		listaEventos.add(eu);
	}

	public void añadirFactura(FACTURACION ff) {
		listaFactura.add(ff);
	}

	// Metodo de imprimir

	public void imprimirTodo() {

		Iterator<evento_General> itlista = listaEventos.iterator();
		boolean control = true;
		while (itlista.hasNext() && control) {

			evento_General itl = itlista.next();

			System.out.println(itl);
			System.out.println("\n");

		}

	}

	public void imprimirArte() {

		Iterator<evento_General> itlista = listaEventos.iterator();
		boolean control = true;
		while (itlista.hasNext() && control) {

			evento_General itl = itlista.next();

			if (itl instanceof Obje_event_arte) {
				System.out.println(itl);
				System.out.println("\n");
			}
		}
	}

	public boolean comprobarArte(String nombre, boolean ayuda) {

		Iterator<evento_General> itlista = listaEventos.iterator();
		boolean control = true;
		evento_General itl = itlista.next();

		do {

			if (itl.getNomEvento().equalsIgnoreCase(nombre)) {
				if (itl instanceof Obje_event_arte) {
					ayuda = false;
					control = false;
				}
			}
		} while (control);

		return ayuda;
	}

	public boolean comprobarCine(String nombre, boolean ayuda) {

		Iterator<evento_General> itlista = listaEventos.iterator();
		boolean control = true;
		evento_General itl = itlista.next();

		do {

			if (itl.getNomEvento().equalsIgnoreCase(nombre)) {
				if (itl instanceof Obje_event_cine) {
					ayuda = false;
					control = false;
				}
			}
		} while (control);

		return ayuda;
	}

	public boolean comprobarDeporte(String nombre, boolean ayuda) {

		Iterator<evento_General> itlista = listaEventos.iterator();
		boolean control = true;
		evento_General itl = itlista.next();

		do {

			if (itl.getNomEvento().equalsIgnoreCase(nombre)) {
				if (itl instanceof Obje_event_deporte) {
					ayuda = false;
					control = false;
				}
			}
		} while (control);

		return ayuda;
	}

	public boolean comprobarEmpresa(String nombre, boolean ayuda) {

		Iterator<evento_General> itlista = listaEventos.iterator();
		boolean control = true;
		evento_General itl = itlista.next();

		do {

			if (itl.getNomEvento().equalsIgnoreCase(nombre)) {
				if (itl instanceof Obje_event_empresa) {
					ayuda = false;
					control = false;
				}
			}
		} while (control);

		return ayuda;
	}

	public boolean comprobarModa(String nombre, boolean ayuda) {

		Iterator<evento_General> itlista = listaEventos.iterator();
		boolean control = true;
		evento_General itl = itlista.next();

		do {

			if (itl.getNomEvento().equalsIgnoreCase(nombre)) {
				if (itl instanceof Obje_event_moda) {
					ayuda = false;
					control = false;
				}
			}
		} while (control);

		return ayuda;
	}

	public boolean comprobarMusical(String nombre, boolean ayuda) {

		Iterator<evento_General> itlista = listaEventos.iterator();
		boolean control = true;
		evento_General itl = itlista.next();

		do {

			if (itl.getNomEvento().equalsIgnoreCase(nombre)) {
				if (itl instanceof Obje_event_musical) {
					ayuda = false;
					control = false;
				}
			}
		} while (control);

		return ayuda;
	}

	public void imprimirCine() {

		Iterator<evento_General> itlista = listaEventos.iterator();
		boolean control = true;
		while (itlista.hasNext() && control) {

			evento_General itl = itlista.next();

			if (itl instanceof Obje_event_cine) {
				System.out.println(itl);
				System.out.println("\n");
			}
		}
	}

	public void imprimirdeporte() {

		Iterator<evento_General> itlista = listaEventos.iterator();
		boolean control = true;
		while (itlista.hasNext() && control) {

			evento_General itl = itlista.next();

			if (itl instanceof Obje_event_deporte) {
				System.out.println(itl);
				System.out.println("\n");
			}
		}
	}

	public void imprimirempresa() {

		Iterator<evento_General> itlista = listaEventos.iterator();
		boolean control = true;
		while (itlista.hasNext() && control) {

			evento_General itl = itlista.next();

			if (itl instanceof Obje_event_empresa) {
				System.out.println(itl);
				System.out.println("\n");
			}
		}
	}

	public void imprimirmoda() {

		Iterator<evento_General> itlista = listaEventos.iterator();
		boolean control = true;
		while (itlista.hasNext() && control) {

			evento_General itl = itlista.next();

			if (itl instanceof Obje_event_moda) {
				System.out.println(itl);
				System.out.println("\n");
			}
		}
	}

	public void imprimirmusica() {

		Iterator<evento_General> itlista = listaEventos.iterator();
		boolean control = true;
		while (itlista.hasNext() && control) {

			evento_General itl = itlista.next();

			if (itl instanceof Obje_event_musical) {
				System.out.println(itl);
				System.out.println("\n");
			}
		}
	}

	public void imprimirFactura() {

		Iterator<FACTURACION> itlista = listaFactura.iterator();
		boolean control = true;
		while (itlista.hasNext() && control) {

			FACTURACION itl = itlista.next();

			System.out.println(itl);
			System.out.println("\n");

		}

	}

	public String buscarEntradas(String nombre) {
		String numEntradas = null;
		Iterator<evento_General> itlista = listaEventos.iterator();
		boolean control = true;
		evento_General itl = itlista.next();

		do {

			if (itl.getNomEvento().equalsIgnoreCase(nombre)) {
				numEntradas = itl.getEntradas();
				control = false;
			} else {
				System.out.println("Error");

			}

		} while (control);

		return numEntradas;
	}

	public String buscarPrecio(String nombre) {
		String precioEntradas = null;
		Iterator<evento_General> itlista = listaEventos.iterator();
		boolean control = true;
		while (itlista.hasNext() && control) {

			evento_General itl = itlista.next();

			if (itl.getNomEvento().equalsIgnoreCase(nombre)) {
				precioEntradas = itl.getPrecioEntrada();
				control = false;
			}

		}
		return precioEntradas;
	}

	public boolean buscarEvento(String nombre, boolean comprobar) {// Compreba su existe el evento

		Iterator<evento_General> itlista = listaEventos.iterator();
		boolean control = true;
		while (itlista.hasNext() && control) {

			evento_General itl = itlista.next();

			if (itl.getNomEvento().equalsIgnoreCase(nombre)) {
				control = false;
				comprobar = false;
			}

		}

		return comprobar;
	}

	public void actualizar(String nombre, String numeroEntradas) {// Actualizo el numero de entradas despues de comprar

		String NumeroEntradas = numeroEntradas;
		Iterator<evento_General> itlista = listaEventos.iterator();
		boolean control = true;
		while (itlista.hasNext() && control) {

			evento_General itl = itlista.next();

			if (itl.getNomEvento().equalsIgnoreCase(nombre)) {
				itl.setEntradas(NumeroEntradas);
				control = false;
			}

		}

	}
	// Editar cada elemento de los objetos auxilio me desmayo

	public String actualizarNombre(String nombre, String nuevo) {

		String prueba = "";
		Iterator<evento_General> itlista = listaEventos.iterator();
		boolean control = true;
		while (itlista.hasNext() && control) {

			evento_General itl = itlista.next();

			if (itl.getNomEvento().equalsIgnoreCase(nombre)) {
				itl.setNomEvento(nuevo);
				control = false;
				prueba = nuevo;
			}

		}
		return prueba;
	}

	public void actualizarLocalizacion(String nombre, String nuevo) {

		Iterator<evento_General> itlista = listaEventos.iterator();
		boolean control = true;
		while (itlista.hasNext() && control) {

			evento_General itl = itlista.next();

			if (itl.getNomEvento().equalsIgnoreCase(nombre)) {
				itl.setLocalizacion(nuevo);
				control = false;
			}
		}
	}

	public void actualizarDuracion(String nombre, String nuevo) {

		Iterator<evento_General> itlista = listaEventos.iterator();
		boolean control = true;
		while (itlista.hasNext() && control) {

			evento_General itl = itlista.next();

			if (itl.getNomEvento().equalsIgnoreCase(nombre)) {
				itl.setDuracion(nuevo);
				control = false;
			}
		}
	}

	public void actualizarFecha(String nombre, String nuevo) {

		Iterator<evento_General> itlista = listaEventos.iterator();
		boolean control = true;
		while (itlista.hasNext() && control) {

			evento_General itl = itlista.next();

			if (itl.getNomEvento().equalsIgnoreCase(nombre)) {
				itl.setFecha(nuevo);
				control = false;
			}
		}
	}

	public void actualizarEntradas(String nombre, String nuevo) {

		Iterator<evento_General> itlista = listaEventos.iterator();
		boolean control = true;
		while (itlista.hasNext() && control) {

			evento_General itl = itlista.next();

			if (itl.getNomEvento().equalsIgnoreCase(nombre)) {
				itl.setEntradas(nuevo);
				control = false;
			}
		}
	}

	public void actualizarPrecio(String nombre, String nuevo) {

		Iterator<evento_General> itlista = listaEventos.iterator();
		boolean control = true;
		while (itlista.hasNext() && control) {

			evento_General itl = itlista.next();

			if (itl.getNomEvento().equalsIgnoreCase(nombre)) {
				itl.setPrecioEntrada(nuevo);
				control = false;
			}
		}
	}

	public void actualizarArtista(String nombre, String nuevo) {

		Iterator<evento_General> itlista = listaEventos.iterator();
		boolean control = true;
		evento_General itl = itlista.next();

		do {

			if (itl.getNomEvento().equalsIgnoreCase(nombre)) {
				if (itl instanceof Obje_event_arte) {
					((Obje_event_arte) itl).setNombreArtista(nuevo);
					control = false;
				}
			}
		} while (control);
	}

	public void actualizarObras(String nombre, String nuevo) {

		Iterator<evento_General> itlista = listaEventos.iterator();
		boolean control = true;
		evento_General itl = itlista.next();

		do {

			if (itl.getNomEvento().equalsIgnoreCase(nombre)) {
				if (itl instanceof Obje_event_arte) {
					((Obje_event_arte) itl).setNumObras(nuevo);
					control = false;
				}
			}
		} while (control);
	}

	public void actualizarDirector(String nombre, String nuevo) {

		Iterator<evento_General> itlista = listaEventos.iterator();
		boolean control = true;
		evento_General itl = itlista.next();

		do {

			if (itl.getNomEvento().equalsIgnoreCase(nombre)) {
				if (itl instanceof Obje_event_cine) {
					((Obje_event_cine) itl).setNombreArtista(nuevo);
					control = false;
				}
			}
		} while (control);
	}

	public void actualizarPelicula(String nombre, String nuevo) {

		Iterator<evento_General> itlista = listaEventos.iterator();
		boolean control = true;
		evento_General itl = itlista.next();

		do {

			if (itl.getNomEvento().equalsIgnoreCase(nombre)) {
				if (itl instanceof Obje_event_cine) {
					((Obje_event_cine) itl).setPelicula(nuevo);
					control = false;
				}
			}
		} while (control);
	}

	public void actualizarDeporte(String nombre, String nuevo) {

		Iterator<evento_General> itlista = listaEventos.iterator();
		boolean control = true;
		evento_General itl = itlista.next();

		do {

			if (itl.getNomEvento().equalsIgnoreCase(nombre)) {
				if (itl instanceof Obje_event_deporte) {
					((Obje_event_deporte) itl).setDeporte(nuevo);
					control = false;
				}
			}
		} while (control);
	}

	public void actualizarPremio(String nombre, String nuevo) {

		Iterator<evento_General> itlista = listaEventos.iterator();
		boolean control = true;
		evento_General itl = itlista.next();

		do {

			if (itl.getNomEvento().equalsIgnoreCase(nombre)) {
				if (itl instanceof Obje_event_deporte) {
					((Obje_event_deporte) itl).setPremio(nuevo);
					control = false;
				}
			}
		} while (control);
	}

	public void actualizarTema(String nombre, String nuevo) {

		Iterator<evento_General> itlista = listaEventos.iterator();
		boolean control = true;
		evento_General itl = itlista.next();

		do {

			if (itl.getNomEvento().equalsIgnoreCase(nombre)) {
				if (itl instanceof Obje_event_empresa) {
					((Obje_event_empresa) itl).setTema(nuevo);
					control = false;
				}
			}
		} while (control);
	}

	public void actualizarInvitados(String nombre, String nuevo) {

		Iterator<evento_General> itlista = listaEventos.iterator();
		boolean control = true;
		evento_General itl = itlista.next();

		do {

			if (itl.getNomEvento().equalsIgnoreCase(nombre)) {
				if (itl instanceof Obje_event_empresa) {
					((Obje_event_empresa) itl).setInvitados(nuevo);
					control = false;
				}
			}
		} while (control);
	}

	public void actualizarDiseñador(String nombre, String nuevo) {

		Iterator<evento_General> itlista = listaEventos.iterator();
		boolean control = true;
		evento_General itl = itlista.next();

		do {

			if (itl.getNomEvento().equalsIgnoreCase(nombre)) {
				if (itl instanceof Obje_event_moda) {
					((Obje_event_moda) itl).setDiseñador(nuevo);
					control = false;
				}
			}
		} while (control);
	}

	public void actualizarModelos(String nombre, String nuevo) {

		Iterator<evento_General> itlista = listaEventos.iterator();
		boolean control = true;
		evento_General itl = itlista.next();

		do {

			if (itl.getNomEvento().equalsIgnoreCase(nombre)) {
				if (itl instanceof Obje_event_moda) {
					((Obje_event_moda) itl).setNumModelos(nuevo);
					control = false;
				}
			}
		} while (control);
	}

	public void actualizarCantante(String nombre, String nuevo) {

		Iterator<evento_General> itlista = listaEventos.iterator();
		boolean control = true;
		evento_General itl = itlista.next();

		do {

			if (itl.getNomEvento().equalsIgnoreCase(nombre)) {
				if (itl instanceof Obje_event_musical) {
					((Obje_event_musical) itl).setNombreArtista(nuevo);
					control = false;
				}
			}
		} while (control);
	}

	public void actualizarAlbum(String nombre, String nuevo) {

		Iterator<evento_General> itlista = listaEventos.iterator();
		boolean control = true;
		evento_General itl = itlista.next();

		do {

			if (itl.getNomEvento().equalsIgnoreCase(nombre)) {
				if (itl instanceof Obje_event_musical) {
					((Obje_event_musical) itl).setNomAlbum(nuevo);
					control = false;
				}
			}
		} while (control);
	}

	public void borrarEvento(String nombre) {// borrar evento

		Iterator<evento_General> itlista = listaEventos.iterator();
		boolean control = true;
		while (itlista.hasNext() && control) {

			evento_General itl = itlista.next();

			if (itl.getNomEvento().equalsIgnoreCase(nombre)) {
				listaEventos.remove(itl);
				control = false;

			}
		}
	}

}
