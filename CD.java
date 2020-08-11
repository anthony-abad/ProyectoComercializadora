

public class CD {
	
	String titulo, interprete;
	int anho;
	int codigo;
	double precio;
	double iva = 0.09;
	double descuento = 0.1;
	public CD(String titulo, String interprete, int anho, int codigo, double precio) {
		super();
		this.titulo = titulo;
		this.interprete = interprete;
		this.anho = anho;
		this.codigo = codigo;
		this.precio = precio;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getInterprete() {
		return interprete;
	}
	public void setInterprete(String interprete) {
		this.interprete = interprete;
	}
	public int getAnho() {
		return anho;
	}
	public void setAnho(int anho) {
		this.anho = anho;
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
		String a = "INTERPRETE: "+interprete+" TITULO: "+titulo +" AÑO: "+anho+ " CODIGO: "+ codigo+" PRECIO: "+precio;
		return a;
	}
	
	
	
}
