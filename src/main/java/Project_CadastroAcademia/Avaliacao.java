package Project_CadastroAcademia;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Avaliacao {
	
	private LocalDate data;
	private Bioimpedancia bioimpedancia;
	private Perimetria perimetria;
	private DobrasCutaneas dobrascutaneas;
	
	public Avaliacao(LocalDate data, Bioimpedancia bioimpedancia, Perimetria perimetria,
			DobrasCutaneas dobrascutaneas) {
		super();
		this.data = data;
		this.bioimpedancia = bioimpedancia;
		this.perimetria = perimetria;
		this.dobrascutaneas = dobrascutaneas;
		
		
	
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Bioimpedancia getBioimpedancia() {
		return bioimpedancia;
	}

	public void setBioimpedancia(Bioimpedancia bioimpedancia) {
		this.bioimpedancia = bioimpedancia;
	}

	public Perimetria getPerimetria() {
		return perimetria;
	}

	public void setPerimetria(Perimetria perimetria) {
		this.perimetria = perimetria;
	}

	public DobrasCutaneas getDobrascutaneas() {
		return dobrascutaneas;
	}

	public void setDobrascutaneas(DobrasCutaneas dobrascutaneas) {
		this.dobrascutaneas = dobrascutaneas;
	}
	
	
	@Override
	public String toString() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "\n----- AVALIAÇÃO DE " + data.format(formato) + " -----"
				+ "\nBioimpedância:\n" + bioimpedancia
				+ "\nPerimetria:\n" + perimetria
				+ "\nDobras cutâneas:\n" + dobrascutaneas;
	}
	
	
	
	

}
