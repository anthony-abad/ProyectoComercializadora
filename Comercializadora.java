

import java.util.ArrayList;
import java.util.Scanner;

public class Comercializadora {
	
	public static void comprarLibro (ArrayList<Libroo> l) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("INSERTE EL CODIGO DEL LIBRO QUE DESEA COMPRAR");
		int codigoingresado = entrada.nextInt();
		double precio;
		double iva;
		double descuento;
		double total;
		for (int i=0;i<l.size();i++) {
			if (codigoingresado == l.get(i).getCodigo()) {
				precio = l.get(i).getPrecio();
				iva = l.get(i).getIva();
				descuento = l.get(i).getDescuento();
				iva = precio*iva;
				descuento = precio*descuento;
				total = precio+iva-descuento;
				l.get(i).setPrecio(total);
				System.out.println(l.get(i));
				System.out.println("GRACIAS POR SU COMPRA");
			}
		}
	}
	
	public static void mostrarLibros (ArrayList<Libroo> l) {
		for (int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
	}
	
	
	public static void comprarCd (ArrayList<CD> c) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("INSERTE EL CODIGO DEL LIBRO QUE DESEA COMPRAR");
		int codigoingresado = entrada.nextInt();
		double precio;
		double iva;
		double descuento;
		double total;
		for (int i=0;i<c.size();i++) {
			if (codigoingresado == c.get(i).getCodigo()) {
				precio = c.get(i).getPrecio();
				iva = c.get(i).getIva();
				descuento = c.get(i).getDescuento();
				iva = precio*iva;
				descuento = precio*descuento;
				total = precio+iva-descuento;
				c.get(i).setPrecio(total);
				System.out.println(c.get(i));
				System.out.println("GRACIAS POR SU COMPRA");
			}
		}
	}
	
	public static void mostrarCds (ArrayList<CD> c) {
		for (int i=0;i<c.size();i++) {
			System.out.println(c.get(i));
		}
	}

	public static void main(String[] args) {
		
		ArrayList<Libroo> libros = new ArrayList<Libroo>();
		
		Libroo lb1 = new Libroo("EL DIARIO DE ANA FRANK", "ANNA FRANK", "ACANTILADO", 1234567874, 1512, 2019, 22.50);
		Libroo lb2 = new Libroo("YO ANTES DE TI ", "MARY W. SHELLEY", "AKAL", 458884584, 2722, 2018, 17.55);
		Libroo lb3 = new Libroo("HARRY POTTER  FRANK", "J.K. ROWLING ", "ALIANZA", 481567874, 1418, 2020, 19.60);
		Libroo lb4 = new Libroo("EL ALQUIMISTA  ", "PAULO COELHO", "ANAGRAMA", 789667874, 4584, 2015, 18.75);
		Libroo lb5 = new Libroo("EL CODIGO DA VINCI", "DAN BROWN", "ALPHA DECAY", 544567874, 2706, 2017, 27.06);
		
		libros.add(lb1);
		libros.add(lb2);
		libros.add(lb3);
		libros.add(lb4);
		libros.add(lb5);
		
		mostrarLibros(libros);
		comprarLibro(libros);
		
		
		
		ArrayList<CD> cds = new ArrayList<CD>();
		
		CD cd1 = new CD("THRILLER", "MICHAEL JACKSON", 2020, 2706, 27.06);
		CD cd2 = new CD("BACK IN BLACK", "AC/DC", 2016, 2830, 30.28);
		CD cd3 = new CD("THE DARK SIDE OF THE MOON", "PINK FLOYD", 1998, 2950, 28.29);
		CD cd4 = new CD("EL GUARDAESPALDAS", "THE EAGLES", 2015, 3140, 29.30);
		CD cd5 = new CD("RUMOURS", "FLEETWOOD MAC", 1999, 2660, 23.60);
		
		
		cds.add(cd1);
		cds.add(cd2);
		cds.add(cd3);
		cds.add(cd4);
		cds.add(cd5);
		
		mostrarCds(cds);
		comprarCd(cds);
		
		
		
		
		

	}

}
