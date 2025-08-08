package animal;

public class Main {

	public static void main(String[] args) {
		Cachorro c = new Cachorro();
		Gato g = new Gato();
		
		g.setNome("Pitica");
		g.setIdade(1);
		g.fazersom();
		
		c.setNome("Pitico");
		c.setIdade(1);
		c.fazersom();
System.out.print("o "+ g.nome+" tem "+ g.idade+" de idade e faz "); g.fazersom();
System.out.print("o "+ c.nome+" e tem "+ c.idade+" de idade e faz "); c.fazersom();
	
	}

}
