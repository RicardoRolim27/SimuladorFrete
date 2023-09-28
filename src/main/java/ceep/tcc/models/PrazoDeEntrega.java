package ceep.tcc.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class PrazoDeEntrega implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer prazoEmDias;
	@JsonIgnore
		@ManyToOne
		@JoinColumn(name ="estado_id")
		private Estado estado;
	@JsonIgnore
		@ManyToOne
		@JoinColumn(name = "cidade_id")
		private Cidade cidade;
	@JsonIgnore
		@ManyToOne
		@JoinColumn(name = "transportadora_id")
		private Transportadora transportadora;

	public PrazoDeEntrega() {
	}

	public PrazoDeEntrega(Long id, Integer prazoEmDias, Estado estado, Cidade cidade, Transportadora transportadora) {

		super();
		this.id = id;
		this.prazoEmDias = prazoEmDias;
		this.estado = estado;
		this.cidade = cidade;
		this.transportadora = transportadora;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getPrazoEmDias() {
		return prazoEmDias;

	}

	public void setPrazoEmDias(Integer prazoEmDias) {
		this.prazoEmDias = prazoEmDias;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Transportadora getEmpresas() {
		return transportadora;
	}

	public void setEmpresas(Transportadora transportadora) {
		this.transportadora = transportadora;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 :

				id.hashCode());

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
		PrazoDeEntrega other = (PrazoDeEntrega) obj;
		if (id == null) {

			if (other.id != null)
				return false;

		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
