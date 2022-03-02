package Aula10;
public class ProjetoAula10 {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("Carlos Diogo");
		p2.setNome("Rosane Campos");
		p3.setNome("Levi Campos");
		p4.setNome("Valquiria Felina");
		
		p1.setSexo("M");
		p2.setSexo("F");
		p3.setSexo("M");
		p4.setSexo("F");
		
		p1.setIdade(45);
		p2.setIdade(50);
		p3.setIdade(18);
		p4.setIdade(1);
		
		p2.setCurso("Acupuntura");
		p2.setMatricula(202383);
		p3.setEspecialidade("Ciências Médicas");
		p3.setSalario(2500.75f);
		p4.setSetor("Rações");
		p4.setTrabalhando(false);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
		
		
	}
}
