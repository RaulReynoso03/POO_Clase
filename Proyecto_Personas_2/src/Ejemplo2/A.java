package Ejemplo2;

public class A {
	 
	public static void main(String[] args) {
 

		Animal [] misAnimales = new Animal[2];
		misAnimales[0]=new Perro("boby");
		misAnimales[1]=new Gato("blanquito");
 
		for(Animal e:misAnimales) {
			System.out.println(e.tipoAnimal());
		}
 
	}
 
}

abstract class Animal {
 

	private String name;
 

	public void setName(String name) {
		this.name=name;
	}

	public String getName() {
		return this.name;
	}

	public abstract String tipoAnimal();
 
}
 
class Perro extends Animal {
 
	public Perro(String name) {
		super.setName(name);
	}

	public String tipoAnimal() {
		return "El animal es un perro. Se llama " + super.getName();
	}
}
 
class Gato extends Animal {
 
	public Gato(String name) {
		super.setName(name);
	}

	public String tipoAnimal() {
		return "El animal es un gato. Se llama " + super.getName();
	}
}
