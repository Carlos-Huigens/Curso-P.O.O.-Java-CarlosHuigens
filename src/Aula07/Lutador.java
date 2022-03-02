package Aula07;
public class Lutador {
	//Atributos
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias, derrotas, empates;
	//Métodos
	public void apresentar() {
		System.out.println("---------------------------------------------------");
		System.out.println("Chegou a hora! Apresentamos o lutador " + getNome());
		System.out.println("Diretamente de: " + getNacionalidade());
		System.out.println("com " + getIdade() + " anos e medindo " + getAltura() + "m de altura");
		System.out.println("Pesando " + getPeso() + " kg");
		System.out.println("Ganhou " + getVitorias() + " lutas");
		System.out.println("Perdeu " + getDerrotas() + " lutas");
		System.out.println(" e Empatou " + getEmpates() + " lutas");
	}
	public void status() {
		System.out.println(getNome() + " é um peso " + getCategoria());
		System.out.println("Ganhou " + getVitorias() + " vezes");
		System.out.println("Perdeu " + getDerrotas() + " vezes e");
		System.out.println("Empatou " + getEmpates() + " lutas");
	}
	public void ganharLuta() {
		this.setVitorias(getVitorias() + 1);
	}
	public void perderLuta() {
		this.setDerrotas(getDerrotas() + 1);
	}
	public void empatarLuta() {
		this.setEmpates(getEmpates() + 1);
	}
	//Métodos Especiais
	public Lutador(String no, String na, int id,
			float al, float pe, int vi, int de, int em) {
		this.nome = no;
		this.nacionalidade = na;
		this.idade = id;
		this.altura = al;
		this.setPeso(pe);
		this.vitorias = vi;
		this.derrotas = de;
		this.empates = em;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String no) {
		this.nome = no;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String na) {
		this.nacionalidade = na;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int id) {
		this.idade = id;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float al) {
		this.altura = al;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float pe) {
		this.peso = pe;
		this.setCategoria();
	}
	public String getCategoria() {
		return categoria;
	}
	private void setCategoria() {
		if(this.peso < 52.2) {
			this.categoria = "Inválida";
		} else if(peso <= 70.3) {
			this.categoria = "Leve";
		} else if(peso <= 83.9) {
			this.categoria = "Médio";
		} else if(peso <= 120.2) {
			this.categoria = "Pesado";
		} else {
			this.categoria = "Inválida";
		}
	}
	private int getVitorias() {
		return vitorias;
	}
	private void setVitorias(int vi) {
		this.vitorias = vi;
	}
	private int getDerrotas() {
		return derrotas;
	}
	private void setDerrotas(int de) {
		this.derrotas = de;
	}
	private int getEmpates() {
		return empates;
	}
	private void setEmpates(int em) {
		this.empates = em;
	}
	
}
