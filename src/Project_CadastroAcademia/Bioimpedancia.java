package Project_CadastroAcademia;

public class Bioimpedancia {
	private double altura;
	private double peso;
	private double mm;
	private double gc;
	private double gv;
	private double tmb;
	private double densidadeossea;
	private double aguacorporaltotal;
	
	
	public Bioimpedancia(double altura, double peso, double mm, double gc, double gv, double tmb,
			double densidadeossea, double aguacorporaltotal) {
		super();
		this.altura = altura;
		this.peso = peso;
		this.mm = mm;
		this.gc = gc;
		this.gv = gv;
		this.tmb = tmb;
		this.densidadeossea = densidadeossea;
		this.aguacorporaltotal = aguacorporaltotal;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getImc() {
		return peso/(Math.pow(altura/100,2));
	}
	
	public double getMm() {
		return mm;
	}
	public void setMm(double mm) {
		this.mm = mm;
	}
	public double getGc() {
		return gc;
	}
	public void setGc(double gc) {
		this.gc = gc;
	}
	public double getGv() {
		return gv;
	}
	public void setGv(double gv) {
		this.gv = gv;
	}
	public double getTmb() {
		return tmb;
	}
	public void setTmb(double tmb) {
		this.tmb = tmb;
	}
	public double getDensidadeossea() {
		return densidadeossea;
	}
	public void setDensidadeossea(double densidadeossea) {
		this.densidadeossea = densidadeossea;
	}
	public double getAguacorporaltotal() {
		return aguacorporaltotal;
	}
	public void setAguacorporaltotal(double aguacorporaltotal) {
		this.aguacorporaltotal = aguacorporaltotal;
	}

	
	@Override
	public String toString() {
		return "  Altura: " + altura
				+ "\n  Peso: " + peso
				+ "\n  Massa muscular: " + mm
				+ "\n  Gordura corporal: " + gc
				+ "\n  Gordura visceral: " + gv
				+ "\n  Taxa metabólica basal: " + tmb
				+ "\n  Densidade óssea: " + densidadeossea
				+ "\n  Água corporal total: " + aguacorporaltotal;
	}
	
}
