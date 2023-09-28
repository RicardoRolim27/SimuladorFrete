package ceep.tcc.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "valor_frete")
public class ValorFrete implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	private double pesoInicial;
	private double pesoFinal;
	private double valorFrete;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "transportadora_id")
	private Transportadora transportadora;

	public ValorFrete() {
	}

	public ValorFrete(Long id, double pesoInicial, double pesoFinal, double valorFrete, Transportadora transportadora) {
		super();
		this.id = id;
		this.pesoInicial = pesoInicial;
		this.pesoFinal = pesoFinal;
		this.valorFrete = valorFrete;
		this.transportadora = transportadora;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getPesoInicial() {
		return pesoInicial;
	}

	public void setPesoInicial(double pesoInicial) {
		this.pesoInicial = pesoInicial;
	}

	public double getPesoFinal() {
		return pesoFinal;
	}

	public void setPesoFinal(double pesoFinal) {
		this.pesoFinal = pesoFinal;
	}

	public double getValorFrete() {
		return valorFrete;
	}

	public void setValorFrete(double valorFrete) {
		this.valorFrete = valorFrete;
	}

	public Transportadora getTransportadora() {
		return transportadora;
	}

	public void setTransportadora(Transportadora transportadora) {
		this.transportadora = transportadora;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ValorFrete other = (ValorFrete) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
