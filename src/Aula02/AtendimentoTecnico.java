package Aula02;
public class AtendimentoTecnico {
	String tipo;
	double tempoHoras;
	boolean agendado;
	boolean precisaPeca;
	boolean pecaNoLocal;
	boolean solucao;
	
	void status() {
		System.out.println("Tipo: " + this.tipo);
		System.out.println("Dura��o do Atendimento: " + this.tempoHoras);
		System.out.println("Atendimento agendado: " + this.agendado);
		System.out.println("Precisa de pe�a? " + this.precisaPeca);
		System.out.println("H� pe�a no local? " + this.pecaNoLocal);
		System.out.println("Problema foi solucionado? " + this.solucao);
	}
	
	void iniciar() {
		this.agendado = true;
	}
	void consertar() {
		if(this.precisaPeca == true) {
		} else {
			System.out.println("Problema corrigido sem substitui��o de pe�a.");
		} 
			if(this.pecaNoLocal == false) {
			} else {
				System.out.println("Problema corrigido com a substitui��o da pe�a");
		}
	}
	void terminar() {
		if(this.solucao == true) {
			System.out.println("Problema corrigido, chamado finalizado!");
		} else {
			System.out.println("Necess�rio o envio da pe�a para finalizar o atendimento.");
		}
	}
}
