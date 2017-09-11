package uniedu.server.model.course;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import uniedu.server.model.base.BaseEntity;
import uniedu.server.model.institution.InstitutionEntity;

/**
 * Represents a course.
 *
 * @author Guilherme Dalmarco (dalmarco.gd@gmail.com)
 */
@Entity
@Table(name = "course")
public class CourseEntity extends BaseEntity {

	public static final String CODE = "code";
    public static final String DESCRIPTION = "description";
    public static final String SITUATION = "situation";
    public static final String VALUE_CREDIT = "valueCredit";
    public static final String INSTITUTION = "institution";

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_course", nullable = false)
	private Long id;

	@NotNull
	@Column(nullable = false, name = "code_course")
	private Long code;

	@NotNull
	@Column(nullable = false, name = "description_course", length=50)
	private String description;

	@NotNull
	@Column(nullable = false, name = "situation_course", length=50)
	private String situation;

	@NotNull
	@Column(nullable = false, name = "value_credit_course")
	private Double valueCredit;

	@NotNull
	@JoinColumn(foreignKey = @ForeignKey(name = "fk_course_institution"), nullable = false, name = "institution_id_institution")
	@ManyToOne(cascade = CascadeType.REFRESH , fetch = FetchType.LAZY)
	private InstitutionEntity institution;

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
	public String getDescription() {
		return description;
	}

	/**
	 * Atribui um {@link String}
	 * @param description - {@link String}
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Retorna uma instancia de {@link String}
	 * @return {@link String}
	 */
	public String getSituation() {
		return situation;
	}

	/**
	 * Atribui um {@link String}
	 * @param situation - {@link String}
	 */
	public void setSituation(String situation) {
		this.situation = situation;
	}

	/**
	 * Retorna uma instancia de {@link Double}
	 * @return {@link Double}
	 */
	public Double getValueCredit() {
		return valueCredit;
	}

	/**
	 * Atribui um {@link Double}
	 * @param valueCredit - {@link Double}
	 */
	public void setValueCredit(Double valueCredit) {
		this.valueCredit = valueCredit;
	}

	/**
	 * Retorna uma instancia de {@link InstitutionEntity}
	 * @return {@link InstitutionEntity}
	 */
	public InstitutionEntity getInstitution() {
		return institution;
	}

	/**
	 * Atribui um {@link InstitutionEntity}
	 * @param institution - {@link InstitutionEntity}
	 */
	public void setInstitution(InstitutionEntity institution) {
		this.institution = institution;
	}
}