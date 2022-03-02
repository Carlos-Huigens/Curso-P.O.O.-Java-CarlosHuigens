package Aula12;
public class ProjetoAula12 {
	public static void main(String[] args) {
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		
		Canguru c = new Canguru();
		Cachorro k = new Cachorro();
		Cobra j = new Cobra();
		Tartaruga t = new Tartaruga();
		GoldFish g = new GoldFish();
		Arara e = new Arara();
		
		
		m.locomover();
		r.locomover();
		p.alimentar();
		a.locomover();
		j.locomover();
		t.locomover();
		g.locomover();
		e.locomover();
		c.locomover();
		k.locomover();
		k.emitirSom();
	}
}
