package Aula11;
public class ProjetoAula11 {
	public static void main(String[] args) {
		Visitante v1 = new Visitante();
		Aluno a1 = new Aluno();
		Professor p1 = new Professor();
		Bolsista b1 = new Bolsista();
		Tecnico t1 = new Tecnico();
		
		v1.setNome("Antenor");
		v1.setIdade(30);
		v1.setSexo("M");
		System.out.println(v1.toString());
		
		a1.setNome("Carlos");
		a1.setMatricula(1111);
		a1.setCurso("POO em Java");
		a1.setIdade(45);
		a1.setSexo("M");
		a1.pagarMensalid();
		System.out.println(a1.toString());
		
		p1.setNome("Guanabara");
		p1.setIdade(35);
		p1.setSexo("M");
		System.out.println(p1.toString());
		
		b1.setNome("Levi");
		b1.setIdade(18);
		b1.setSexo("M");
		System.out.println(b1.toString());
		
		t1.setNome("Vicente");
		t1.setIdade(21);
		t1.setSexo("M");
		System.out.println(t1.toString());
		
	}
}
