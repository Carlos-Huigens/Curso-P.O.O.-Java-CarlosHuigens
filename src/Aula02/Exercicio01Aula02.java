package Aula02;
public class Exercicio01Aula02 {
	public static void main(String[] args) {
		AtendimentoTecnico a1 = new AtendimentoTecnico();
		a1.tipo = "Corretivo";
		a1.tempoHoras = 2.0;
		a1.agendado = true;
		a1.precisaPeca = false;
		a1.pecaNoLocal = false;
		a1.solucao = true;
		a1.status();
		a1.iniciar();
		a1.consertar();
		a1.terminar();
		
	}
}
