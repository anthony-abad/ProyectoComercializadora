

public class Libroo {
	
	String titulo,autor,editorial;
	long isbn;
	int codigo;
	double precio;
	int anho;
	double iva = 0.04;
	double descuento = 0.2;
	public Libroo(String titulo, String autor, String editorial, long isbn, int codigo, int anho, double precio) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
		this.isbn = isbn;
		this.codigo = codigo;
		this.anho = anho;
		this.precio = precio;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public long getIsbn() {
		return isbn;
	}
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getIva() {
		return iva;
	}
	public void setIva(double iva) {
		this.iva = iva;
	}
	public double getDescuento() {
		return descuento;
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	
	@Override
	public String toString() {
		String a = "AUTOR: "+autor +" EDITORIAL: "+editorial+" TITULO: "+titulo+ " CODIGO: "+ codigo+" ISBN: "+isbn+" AÑO: "+anho+" PRECIO: "+precio;
		return a;
	}
	
	

}
