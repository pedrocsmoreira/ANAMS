package model;

public class CompraBilhete{
	private int referencia;
	private Festival festival;
	private TipoBilhete tipo;

	private static int contador = 0;

	public CompraBilhete(){
		this.referencia = ++contador;
		this.festival = new Festival();
		this.plano = new HashMap<>();
	}

	public CompraBilhete(Festival festival, TipoBilhete tipo){
		this.referencia = ++contador;
		this.festival = festival;
		this.tipo = tipo;
	}

	public CompraBilhete(CompraBilhete compra){
		this.referencia = compra.referencia;
		this.festival = compra.festival;
		this.tipo = compra.tipo;
	}
}