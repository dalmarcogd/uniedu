package uniedu.server.model.institution;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import uniedu.server.model.base.BaseEntity;

/**
 * Represents a education institution.
 *
 * @author Guilherme Dalmarco (dalmarco.gd@gmail.com)
 */
@Entity
@Table(name = "institution")
public class InstitutionEntity extends BaseEntity {

	public static final String CODE = "code";
    public static final String NAME = "name";

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_institution", nullable = false)
	private Long id;

	@NotNull
	@Column(nullable = false, name = "code_institution")
	private Long code;

	@NotNull
	@Column(nullable = false, name = "name_institution", length=50)
	private String name;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long getId() {
		return this.id;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Retorna uma instancia de {@link Long}
	 * @return {@link Long}
	 */
	public Long getCode() {
		return code;
	}

	/**
	 * Atribui um {@link Long}
	 * @param code - {@link Long}
	 */
	public void setCode(Long code) {
		this.code = code;
	}

	/**
	 * Retorna uma instancia de {@link String}
	 * @return {@link String}
	 */
	public String getName() {
		return name;
	}

	/**
	 * Atribui um {@link String}
	 * @param name - {@link String}
	 */
	public void setName(String name) {
		this.name = name;
	}
}