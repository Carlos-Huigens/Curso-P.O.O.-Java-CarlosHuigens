package Aula02;
public class FitaAdesiva {
	String marca;
	String cor;
	double comprimento;
	double largura;
	boolean carga;
	
	void status() {
		System.out.println("Marca: " + this.marca);
		System.out.println("Cor: " + this.cor);
		System.out.println("Comprimento: " + this.comprimento + " metros");
		System.out.println("Largura: " + this.largura + " centimetros");
		System.out.println("Tem fita no rolo? " + this.carga);
	}
	void lacrar() {
		if(this.carga == true) {
		} else {
			System.out.println("Não será possivel lacrar, a fita acabou!");
		}
	}
	
	void pregar() {
		if(this.carga == true) {
		} else {
			System.out.println("Não será possivel pregar, a fita acabou!");
		}
	}
}
