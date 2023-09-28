package ceep.tcc.models;

public class SimuladorFrete {
	
	
	private double valorNFE;
	private double pesoMercadoria;
	private double valorDoFrete;
	private String estadoOrigem;
	private String estadoDestino;
	private String cidadeOrigem;
	private String cidadeDestino;
	

	public double getValorNFE() {
		return valorNFE;
	}

	public void setValorNFE(double valorNFE) {
		this.valorNFE = valorNFE;
	}

	public double getPesoMercadoria() {
		return pesoMercadoria;
	}

	public void setPesoMercadoria(double pesoMercadoria) {
		this.pesoMercadoria = pesoMercadoria;
	}

	public String getEstadoOrigem() {
		return estadoOrigem;
	}

	public void setEstadoOrigem(String estadoOrigem) {
		this.estadoOrigem = estadoOrigem;
	}

	public String getEstadoDestino() {
		return estadoDestino;
	}

	public void setEstadoDestino(String estadoDestino) {
		this.estadoDestino = estadoDestino;
	}

	public String getCidadeOrigem() {
		return cidadeOrigem;
	}

	public void setCidadeOrigem(String cidadeOrigem) {
		this.cidadeOrigem = cidadeOrigem;
	}

	public String getCidadeDestino() {
		return cidadeDestino;
	}

	public void setCidadeDestino(String cidadeDestino) {
		this.cidadeDestino = cidadeDestino;
	}

	public double getValorDoFrete() {
		return valorDoFrete;
	}

	public void setValorDoFrete(double valorDoFrete) {
		this.valorDoFrete = valorDoFrete;
	}

	


}
