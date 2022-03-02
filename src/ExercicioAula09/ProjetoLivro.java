package ExercicioAula09;
public class ProjetoLivro {
	public static void main(String[] args) {
		Pessoa[] p = new Pessoa[3];
		Livro[] l = new Livro[3];
		
		p[0] = new Pessoa("Carlos", 45, "M");
		p[1] = new Pessoa("Rosane", 50, "F");
		p[2] = new Pessoa("Levi", 18, "M");
		
		l[0] = new Livro("Lógica e Algoritmos", "Guanabara", 100, p[0]);
		l[1] = new Livro("MTC", "Lee", 300, p[1]);
		l[2] = new Livro("O povo Cigano", "Orion", 250, p[2]);
		
		l[0].abrir();
		System.out.println(l[0].detalhes());
		l[1].abrir();
		System.out.println("\n" + l[1].detalhes());
		l[2].abrir();
		System.out.println("\n" + l[2].detalhes());
	}
}
