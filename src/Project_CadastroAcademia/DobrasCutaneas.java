package Project_CadastroAcademia;

public class DobrasCutaneas {
	private double triceps;
	private double biceps;
	private double subescapular;
	private double axilarmedia;
	private double peitoral;
	private double suprailiaca;
	private double supraespinal;
	private double abdominal;
	private double coxa;
	private double panturrilhamedial;
	public DobrasCutaneas(double triceps, double biceps, double subescapular, double axilarmedia, double peitoral,
			double suprailiaca, double supraespinal, double abdominal, double coxa, double panturrilhamedial) {
		super();
		this.triceps = triceps;
		this.biceps = biceps;
		this.subescapular = subescapular;
		this.axilarmedia = axilarmedia;
		this.peitoral = peitoral;
		this.suprailiaca = suprailiaca;
		this.supraespinal = supraespinal;
		this.abdominal = abdominal;
		this.coxa = coxa;
		this.panturrilhamedial = panturrilhamedial;
	}
	public double getTriceps() {
		return triceps;
	}
	public void setTriceps(double triceps) {
		this.triceps = triceps;
	}
	public double getBiceps() {
		return biceps;
	}
	public void setBiceps(double biceps) {
		this.biceps = biceps;
	}
	public double getSubescapular() {
		return subescapular;
	}
	public void setSubescapular(double subescapular) {
		this.subescapular = subescapular;
	}
	public double getAxilarmedia() {
		return axilarmedia;
	}
	public void setAxilarmedia(double axilarmedia) {
		this.axilarmedia = axilarmedia;
	}
	public double getPeitoral() {
		return peitoral;
	}
	public void setPeitoral(double peitoral) {
		this.peitoral = peitoral;
	}
	public double getSuprailiaca() {
		return suprailiaca;
	}
	public void setSuprailiaca(double suprailiaca) {
		this.suprailiaca = suprailiaca;
	}
	public double getSupraespinal() {
		return supraespinal;
	}
	public void setSupraespinal(double supraespinal) {
		this.supraespinal = supraespinal;
	}
	public double getAbdominal() {
		return abdominal;
	}
	public void setAbdominal(double abdominal) {
		this.abdominal = abdominal;
	}
	public double getCoxa() {
		return coxa;
	}
	public void setCoxa(double coxa) {
		this.coxa = coxa;
	}
	public double getPanturrilhamedial() {
		return panturrilhamedial;
	}
	public void setPanturrilhamedial(double panturrilhamedial) {
		this.panturrilhamedial = panturrilhamedial;
	}
	
	@Override
	public String toString() {
		return "  Tricipital: " + triceps
				+ "\n  Bicipital: " + biceps
				+ "\n  Subescapular: " + subescapular
				+ "\n  Axila média: " + axilarmedia
				+ "\n  Peitoral: " + peitoral
				+ "\n  Suprailíaca: " + suprailiaca
				+ "\n  Supraespinal: " + supraespinal
				+ "\n  Abdominal: " + abdominal
				+ "\n  Coxa: " + coxa
				+ "\n  Panturrilha medial: " + panturrilhamedial;
	}
	
}
