package hierarquia_animal;

public class preguiça extends geral {
	private String tipo;

	public preguiça( String cientifico,String nome,int idade, String alimento,String tipo) {
		super(nome, idade,  alimento);		
		this.tipo=tipo;		
	}
	
	public void print() {
		System.out.print("bicho preguiça");
		System.out.print("\n nome: "+getNome());
		System.out.print("\n idade: "+getIdade());
		System.out.print("\n alimentação: "+getAlimento());
		System.out.print("\n raça: "+tipo);
	}
	public void som() {
		System.out.print("\n *som de bicho preguiça*");
	}
	public void subir() {
		System.out.print("\n O bicho Preguiça começou a dormir zzz");
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}