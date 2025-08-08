package animal;

public class Animal {
public String nome;
public int idade;

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public int getIdade() {
	return idade;
}

public void setIdade(int idade) {
	this.idade = idade;
}

public void fazersom() {
	System.out.println("Som generico");
}

}
