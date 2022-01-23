package model;

public class TipoEntidade{
	private String tipo;

	private static final String STR_DEFAULT = "";

	public TipoEntidade(){
		this.tipo = STR_DEFAULT;
	}

	public TipoEntidade(String tipo){
		this.tipo = tipo;
	}

	public TipoEntidade(TipoEntidade te){
		this.tipo = te.tipo;
	}

	public void setTipoEntidade(String tipo){
		this.tipo = tipo;
	}

	public String getTipoEntidade(){
		return this.tipo;
	}

	//falta toString e equal


}