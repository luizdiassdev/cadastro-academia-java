package Project_CadastroAcademia;

public class Perimetria {
	private double ombro;
	private double torax;
	private double cintura;
	private double abdomen;
	private double quadril;
	private double coxaesquerda;
	private double coxadireita;
	private double bracodireito;
	private double bracoesquerdo;
	private double antebracodireito;
	private double antebracoesquerdo;
	private double panturrilhadireita;
	private double panturrilhaesquerda;
	
	
	
	public Perimetria(double ombro, double torax, double cintura, double abdomen, double quadril, double coxaesquerda,
			double coxadireita, double bracodireito, double bracoesquerdo, double antebracodireito,
			double antebracoesquerdo, double panturrilhadireita, double panturrilhaesquerda) {
		super();
		this.ombro = ombro;
		this.torax = torax;
		this.cintura = cintura;
		this.abdomen = abdomen;
		this.quadril = quadril;
		this.coxaesquerda = coxaesquerda;
		this.coxadireita = coxadireita;
		this.bracodireito = bracodireito;
		this.bracoesquerdo = bracoesquerdo;
		this.antebracodireito = antebracodireito;
		this.antebracoesquerdo = antebracoesquerdo;
		this.panturrilhadireita = panturrilhadireita;
		this.panturrilhaesquerda = panturrilhaesquerda;
	}
	public double getOmbro() {
		return ombro;
	}
	public void setOmbro(double ombro) {
		this.ombro = ombro;
	}
	public double getTorax() {
		return torax;
	}
	public void setTorax(double torax) {
		this.torax = torax;
	}
	public double getCintura() {
		return cintura;
	}
	public void setCintura(double cintura) {
		this.cintura = cintura;
	}
	public double getAbdomen() {
		return abdomen;
	}
	public void setAbdomen(double abdomen) {
		this.abdomen = abdomen;
	}
	public double getQuadril() {
		return quadril;
	}
	public void setQuadril(double quadril) {
		this.quadril = quadril;
	}
	public double getCoxaesquerda() {
		return coxaesquerda;
	}
	public void setCoxaesquerda(double coxaesquerda) {
		this.coxaesquerda = coxaesquerda;
	}
	public double getCoxadireita() {
		return coxadireita;
	}
	public void setCoxadireita(double coxadireita) {
		this.coxadireita = coxadireita;
	}
	public double getBracodireito() {
		return bracodireito;
	}
	public void setBracodireito(double bracodireito) {
		this.bracodireito = bracodireito;
	}
	public double getBracoesquerdo() {
		return bracoesquerdo;
	}
	public void setBracoesquerdo(double bracoesquerdo) {
		this.bracoesquerdo = bracoesquerdo;
	}
	public double getAntebracodireito() {
		return antebracodireito;
	}
	public void setAntebracodireito(double antebracodireito) {
		this.antebracodireito = antebracodireito;
	}
	public double getAntebracoesquerdo() {
		return antebracoesquerdo;
	}
	public void setAntebracoesquerdo(double antebracoesquerdo) {
		this.antebracoesquerdo = antebracoesquerdo;
	}
	public double getPanturrilhadireita() {
		return panturrilhadireita;
	}
	public void setPanturrilhadireita(double panturrilhadireita) {
		this.panturrilhadireita = panturrilhadireita;
	}
	public double getPanturrilhaesquerda() {
		return panturrilhaesquerda;
	}
	public void setPanturrilhaesquerda(double panturrilhaesquerda) {
		this.panturrilhaesquerda = panturrilhaesquerda;
	}

	@Override
	public String toString() {
		return "  Ombro: " + ombro
				+ "\n  Tórax: " + torax
				+ "\n  Cintura: " + cintura
				+ "\n  Abdômen: " + abdomen
				+ "\n  Quadril: " + quadril
				+ "\n  Coxa esquerda: " + coxaesquerda
				+ "\n  Coxa direita: " + coxadireita
				+ "\n  Braço esquerdo: " + bracoesquerdo
				+ "\n  Braço direito: " + bracodireito
				+ "\n  Antebraço esquerdo: " + antebracoesquerdo
				+ "\n  Antebraço direito: " + antebracodireito
				+ "\n  Panturrilha esquerda: " + panturrilhaesquerda
				+ "\n  Panturrilha direita: " + panturrilhadireita;
	}
	
}
