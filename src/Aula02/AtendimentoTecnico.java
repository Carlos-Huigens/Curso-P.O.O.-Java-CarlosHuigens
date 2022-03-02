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
		System.out.println("Duração do Atendimento: " + this.tempoHoras);
		System.out.println("Atendimento agendado: " + this.agendado);
		System.out.println("Precisa de peça? " + this.precisaPeca);
		System.out.println("Há peça no local? " + this.pecaNoLocal);
		System.out.println("Problema foi solucionado? " + this.solucao);
	}
	
	void iniciar() {
		this.agendado = true;
	}
	void consertar() {
		if(this.precisaPeca == true) {
		} else {
			System.out.println("Problema corrigido sem substituição de peça.");
		} 
			if(this.pecaNoLocal == false) {
			} else {
				System.out.println("Problema corrigido com a substituição da peça");
		}
	}
	void terminar() {
		if(this.solucao == true) {
			System.out.println("Problema corrigido, chamado finalizado!");
		} else {
			System.out.println("Necessário o envio da peça para finalizar o atendimento.");
		}
	}
}
