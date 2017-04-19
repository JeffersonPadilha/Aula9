package entidade;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/*
 * @Entity - Indica que a classe participa da um ORM
 * @Table(name = "tbcliente") - define o nome da tabela mapeada
 * 
 */

@Entity
@Table(name = "tbcliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idcliente")
	private Integer codigo;
	private String nome;
	private String email;
	private String cpf;
	
	@Column(name = "sexo", nullable = false)
	private String genero;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "dataNasc", nullable = false)
	private Date dataNascimento;
	
	@Column(name = "qtdDep", nullable= false)
	private Integer qtdDependentes;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Cliente(Integer codigo, String nome, String email, String cpf, String genero, Date dataNascimento,
			Integer qtdDependentes) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.genero = genero;
		this.dataNascimento = dataNascimento;
		this.qtdDependentes = qtdDependentes;
	}
	
		
	public Integer getCodigo() {
		return codigo;
	}


	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public Date getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public Integer getQtdDependentes() {
		return qtdDependentes;
	}


	public void setQtdDependentes(Integer qtdDependentes) {
		this.qtdDependentes = qtdDependentes;
	}


	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nome=" + nome + ", email=" + email + ", cpf=" + cpf + ", genero="
				+ genero + ", dataNascimento=" + dataNascimento + ", qtdDependentes=" + qtdDependentes + "]";
	}
	
	
	
}
