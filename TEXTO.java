package Proyecto_Segundo_Trimestre;

import java.util.Scanner;

public class TEXTO {

	private boolean pasar = false;
	Scanner sc = new Scanner(System.in);

	public TEXTO() {

	}

	GESTION gt = new GESTION();

	/**
	 * 
	 */
	protected TEXTO(GESTION gt) {
		this.gt = gt;
	}

	public void menu() { // Menu pricipal
		do {
			int N;
			System.out.println("Bienvenido a Eventually");
			System.out.println("Inserte '1' para acceder como desarrollador ");
			System.out.println("Inserte '2' para acceder al menu de cliente (No incluido en esta version).");
			System.out.println("Inserte 3 para salir del programa");
			N = sc.nextInt();
			sc.nextLine();

			switch (N) {

			case 1:
				menuCliente();

				break;

			case 2:
				// Llamar a menu de clientes(No en esta version)
				break;
			case 3:
				pasar = true;
				break;

			}

		} while (!pasar);
	}// fin metodo menu

	public void menuCliente() {
		int N;
		boolean salir = true;

		do {

			System.out.println("Inserte 1 para ver todos los eventos");
			System.out.println("Inserte 2 para comprar entradas");
			System.out.println("Inserte 3 para ver las facturas");
			System.out.println("Inserte 4 para añadir eventos al programa (Desarrollador)");
			System.out.println("Inserte 5 para salir al menu anterior");
			N = sc.nextInt();
			sc.nextLine();

			switch (N) {

			case 1:// menu de mostrar los eventos(guia) No DONE

				menuMostrar();

				break;

			case 2:// Menu de comprar las entradas

				menuComprar();

				break;

			case 3:

				gt.imprimirFactura();

				break;

			case 4:// Crear objetos de cada clase DONE
				menuAñadir();

				break;
			case 5:// salir
				salir = false;
				break;

			}// Fine switch
		} while (salir);
	}// Fin menuCliente

	public void menuMostrar() {
		int N;
		boolean salir = false;
		do {

			System.out.println("Inserte '1' para ver la lista de eventos programados");
			System.out.println("Inserte '2' para ver la lista de eventos de Arte");
			System.out.println("Inserte '3' para ver la lista de eventos de Cine");
			System.out.println("Inserte '4' para ver la lista de eventos de Deporte");
			System.out.println("Inserte '5' para ver la lista de eventos de Empresa");
			System.out.println("Inserte '6' para ver la lista de eventos de Moda");
			System.out.println("Inserte '7' para ver la lista de eventos de Musical");
			System.out.println("Inserte '8' para salir");
			N = sc.nextInt();
			sc.nextLine();

			switch (N) {

			case 1:// Mostrar todos los eventos disponibles en el momento

				gt.imprimirTodo();

				break;

			case 2:// Mostrar los eventos de Arte(Filtrar)

				gt.imprimirArte();

				break;

			case 3:// Mostrar los eventos de Cine

				gt.imprimirCine();

				break;

			case 4: // Mostrar los eventos de Deporte

				gt.imprimirdeporte();

				break;

			case 5: // Mostrar los eventos de Empresa

				gt.imprimirempresa();

				break;

			case 6: // Mostrar los eventos de Moda

				gt.imprimirmoda();

				break;

			case 7: // Mostrar los eventos de Musca llamar a metodo en gestion

				gt.imprimirmusica();

				break;

			case 8: // Salir al menu anterior
				// Cambiar variable boolean para salir del bucle
				System.out.println("Volviendo al menu anterior");
				salir = true;
				break;

			}
		} while (!salir);

	}// Fin metodo mostrar eventos

	public void menuAñadir() {
		int N;
		boolean pasar = false;
		do {

			System.out.println("Menu añadir objetos para uso de pruebas");
			System.out.println("Inserte 1 para añadir objetos de clase Arte");
			System.out.println("Inserte 2 para añadir objetos de clase Cine");
			System.out.println("Inserte 3 para añadir objetos de clase Deporte");
			System.out.println("Inserte 4 para añadir objetos de clase Empresa");
			System.out.println("Inserte 5 para añadir objetos de clase Moda");
			System.out.println("Inserte 6 para añadir objetos de clase Musical");
			System.out.println("Inserte 7 para salir de este menu");
			N = sc.nextInt();
			sc.nextLine();
			switch (N) {

			case 1:// objetos de arte
				gt.añadirArte(recogerArte());
				break;

			case 2:// Objetos de Cine
				gt.añadirCine(recogerCine());
				break;

			case 3: // Objetos de Deporte
				gt.añadirDeporte(recogerDeporte());
				break;

			case 4: // Objetos de Empresa
				gt.añadirEmpresa(recogerEmpresa());
				break;

			case 5: // Objetos de Moda
				gt.añadirModa(recogerModa());
				break;

			case 6: // Objetos de Musical
				gt.añadirMusical(recogerMusical());
				break;

			case 7:// salir
				pasar = true;
				break;
			}

		} while (!pasar);
	}

	public void menuComprar() {

		int N;
		boolean salir = false;
		do {

			System.out.println("Inserte '1' para ver la lista de eventos programados");
			System.out.println("Inserte '2' para comprar entradas");
			System.out.println("Inserte '3' para salir de este menu");
			N = sc.nextInt();
			sc.nextLine();

			switch (N) {
			case 1:
				menuMostrar();
				break;
			case 2:
				comprarEntrada();
				break;

			case 3:

				salir = true;
				break;
			}

		} while (!salir);
	}

	public void comprarEntrada() {
		String dniComprador, nombre;
		String precioEntrada;
		String numEntradas;// Maximo entradas evento
		int numEntradasCompra;// Compra cliente
		int precioFinal = 0;
		int numero;
		boolean comprobar = true;
		String tarjeta,quedarbien;
		
		do {
			System.out.println("Dame el nombre del evento");
			nombre = sc.nextLine();

			comprobar = gt.buscarEvento(nombre, comprobar);

		} while (comprobar);

		numEntradas = gt.buscarEntradas(nombre);
		precioEntrada = gt.buscarPrecio(nombre);
		numero = Integer.parseInt(numEntradas);
		// Busco el evento usando el nombre del evento

		if (numero > 0) {
			System.out.println("Introduce tu dni para realizar la compra");
			dniComprador = sc.nextLine();
			
			System.out.println("Introduce numero de tarjeta");
			tarjeta = sc.nextLine();
			System.out.println("Introduce el numero posterior");
			quedarbien = sc.nextLine();

			do {

				// Muestro numero de entradas disponibles para comprar de ese evento
				System.out.println(
						"Hay " + numEntradas + " entradas disponibles con un precio de " + precioEntrada + " €");

				System.out.println("Introduce el numero de entradas que deseas comprar");// El cliente me da el umero de
																							// entradas

				numEntradasCompra = sc.nextInt();
				sc.nextLine();

				if (numero >= numEntradasCompra) {
					precioFinal = Integer.parseInt(precioEntrada) * numEntradasCompra;

					numero = numero - numEntradasCompra;

					gt.actualizar(nombre, Integer.toString(numero));
					break;
				} else {
					System.out.println("No hay tantas entradas");
				}

			} while (true);

			System.out.println("Compra realizada con éxito, con un importe de " + precioFinal + " €");

			FACTURACION ff = new FACTURACION(dniComprador, Integer.toString(numEntradasCompra),
					Integer.toString(precioFinal),tarjeta);
			gt.añadirFactura(ff);
		} else {
			System.out.println("No quedan entradas para el evento seleccionado");
		}
	}

	// Crear cada tipo de evento (Urgente)
	public Obje_event_arte recogerArte() {

		String Nombre, Localizacion, Duracion, Fecha, numEntradas, precioEntradas, nombreArtista, numObras;

		System.out.println("Dame nombre");
		Nombre = sc.nextLine();
		System.out.println("Dame Locali");
		Localizacion = sc.nextLine();
		System.out.println("Dame dura");
		Duracion = sc.nextLine();
		System.out.println("fecha");
		Fecha = sc.nextLine();
		System.out.println("Dame num Entradas");
		numEntradas = sc.nextLine();
		System.out.println("Dame precio");
		precioEntradas = sc.nextLine();
		System.out.println("artista");
		nombreArtista = sc.nextLine();
		System.out.println("numero obras");
		numObras = sc.nextLine();

		Obje_event_arte ea = new Obje_event_arte(Nombre, Localizacion, Duracion, Fecha, numEntradas, precioEntradas,
				nombreArtista, numObras);

		return ea;
	}

	public Obje_event_cine recogerCine() {

		String Nombre, Localizacion, Duracion, Fecha, numEntradas, precioEntradas, nombreArtistaP, Pelicula;

		System.out.println("Dame nombre");
		Nombre = sc.nextLine();
		System.out.println("Dame Locali");
		Localizacion = sc.nextLine();
		System.out.println("Dame dura");
		Duracion = sc.nextLine();
		System.out.println("fecha");
		Fecha = sc.nextLine();
		System.out.println("Dame num Entradas");
		numEntradas = sc.nextLine();
		System.out.println("Dame precio");
		precioEntradas = sc.nextLine();
		System.out.println("artista");
		nombreArtistaP = sc.nextLine();
		System.out.println("numero obras");
		Pelicula = sc.nextLine();

		Obje_event_cine ec = new Obje_event_cine(Nombre, Localizacion, Duracion, Fecha, numEntradas, precioEntradas,
				nombreArtistaP, Pelicula);
		return ec;
	}

	public Obje_event_deporte recogerDeporte() {

		String Nombre, Localizacion, Duracion, Fecha, numEntradas, precioEntradas, deporte, premio;

		System.out.println("Dame nombre");
		Nombre = sc.nextLine();
		System.out.println("Dame Locali");
		Localizacion = sc.nextLine();
		System.out.println("Dame dura");
		Duracion = sc.nextLine();
		System.out.println("fecha");
		Fecha = sc.nextLine();
		System.out.println("Dame num Entradas");
		numEntradas = sc.nextLine();
		System.out.println("Dame precio");
		precioEntradas = sc.nextLine();
		System.out.println("artista");
		deporte = sc.nextLine();
		System.out.println("numero obras");
		premio = sc.nextLine();

		Obje_event_deporte ed = new Obje_event_deporte(Nombre, Localizacion, Duracion, Fecha, numEntradas,
				precioEntradas, deporte, premio);
		return ed;
	}

	public Obje_event_empresa recogerEmpresa() {

		String Nombre, Localizacion, Duracion, Fecha, numEntradas, precioEntradas, Tema, numInvitados;

		System.out.println("Dame nombre");
		Nombre = sc.nextLine();
		System.out.println("Dame Locali");
		Localizacion = sc.nextLine();
		System.out.println("Dame dura");
		Duracion = sc.nextLine();
		System.out.println("fecha");
		Fecha = sc.nextLine();
		System.out.println("Dame num Entradas");
		numEntradas = sc.nextLine();
		System.out.println("Dame precio");
		precioEntradas = sc.nextLine();
		System.out.println("artista");
		Tema = sc.nextLine();
		System.out.println("numero obras");
		numInvitados = sc.nextLine();

		Obje_event_empresa ee = new Obje_event_empresa(Nombre, Localizacion, Duracion, Fecha, numEntradas,
				precioEntradas, Tema, numInvitados);
		return ee;
	}

	public Obje_event_moda recogerModa() {

		String Nombre, Localizacion, Duracion, Fecha, numEntradas, precioEntradas, Diseñador, numModelos;

		System.out.println("Dame nombre");
		Nombre = sc.nextLine();
		System.out.println("Dame Locali");
		Localizacion = sc.nextLine();
		System.out.println("Dame dura");
		Duracion = sc.nextLine();
		System.out.println("fecha");
		Fecha = sc.nextLine();
		System.out.println("Dame num Entradas");
		numEntradas = sc.nextLine();
		System.out.println("Dame precio");
		precioEntradas = sc.nextLine();
		System.out.println("artista");
		Diseñador = sc.nextLine();
		System.out.println("numero obras");
		numModelos = sc.nextLine();

		Obje_event_moda em = new Obje_event_moda(Nombre, Localizacion, Duracion, Fecha, numEntradas, precioEntradas,
				Diseñador, numModelos);
		return em;
	}

	public Obje_event_musical recogerMusical() {

		String Nombre, Localizacion, Duracion, Fecha, numEntradas, precioEntradas, nombreArtistaM, nomAlbum;

		System.out.println("Dame nombre");
		Nombre = sc.nextLine();
		System.out.println("Dame Locali");
		Localizacion = sc.nextLine();
		System.out.println("Dame dura");
		Duracion = sc.nextLine();
		System.out.println("fecha");
		Fecha = sc.nextLine();
		System.out.println("Dame num Entradas");
		numEntradas = sc.nextLine();
		System.out.println("Dame precio");
		precioEntradas = sc.nextLine();
		System.out.println("artista");
		nombreArtistaM = sc.nextLine();
		System.out.println("numero obras");
		nomAlbum = sc.nextLine();

		Obje_event_musical eu = new Obje_event_musical(Nombre, Localizacion, Duracion, Fecha, numEntradas,
				precioEntradas, nombreArtistaM, nomAlbum);
		return eu;
	}

}
