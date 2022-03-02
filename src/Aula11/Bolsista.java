package Aula11;
public class Bolsista extends Aluno {
	private int bolsa;
	
	public void renovarBolsa() {
		System.out.println("Renovando bolsa de " + this.getNome());
	}
	
	@Override
	public void pagarMensalid() {
		System.out.println(this.getNome() + " é bolsita! Pagamento facilitado.");
	}
	public int getBolsa() {
		return bolsa;
	}
	public void setBolsa(int bolsa) {
		this.bolsa = bolsa;
	}
}
