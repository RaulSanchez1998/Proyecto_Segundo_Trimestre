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

	public boolean buscarEvento(String nombre, boolean comprobar) {

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

	public void actualizar(String nombre, String numeroEntradas) {

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
	// Editar cada elemento de los objetos

}
