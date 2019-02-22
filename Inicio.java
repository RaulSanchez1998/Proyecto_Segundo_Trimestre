import java.util.Scanner;
public class Inicio {

	public static void main(String[] args) {  //Crear clase temas con arrays de cada clase evento para que cada evento herede de esta clase
		Scanner sc=new Scanner(System.in);

		//Atributos que afectaran a los eventos
		String Duracion,Fecha,Localizacion,Entradas,eLaboral,precioEntrada,nomEvento;
		//Atributos que afectaran a musica
		String nomArtista,nomAlbum;
		//Atributos que afectaran a deportes (faltan)
		String Deporte,Premio;
		//Atributos que aan a cine(nomArtista se comparte)
		String Pelicula;
		//Atributos que afectaran a empresarial
		String Tema,Invitados;
		//Atributos que afectaran a arte (nomArtista se comparte)
		String numObras;
		//Atributos que afectaran a moda
		String Diseñador,numModelos;
		
		//Atributos que afectaran a las promociones
		String promocion; //precioEntrada 
		
		//Personal
		String numTrabajadores,numCupo;
		
		//Gastos e ingresos
		String Gastos,Ingresos, Balance;
		
		int N;
		
		System.out.println("Iniciar sesion");
		System.out.println("1-Admin");
		N=sc.nextInt();
		
		switch(N) {
		case 1: 
			
			
		}
	}

}
