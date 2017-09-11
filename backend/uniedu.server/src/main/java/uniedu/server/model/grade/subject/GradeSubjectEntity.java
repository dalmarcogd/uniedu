package uniedu.server.model.grade.subject;

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
import uniedu.server.model.grade.GradeEntity;

/**
 * Representa um contato de uma pessoa.
 *
 * @author Guilherme Dalmarco (dalmarco.gd@gmail.com)
 */
@Entity
@Table(name = "grade_subject")
public class GradeSubjectEntity extends BaseEntity {

	public static final String CODE = "code";
	public static final String DESCRIPTION = "description";
	public static final String PERSON = "person";

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_grade_subject", nullable = false)
	private Long id;

	@NotNull
	@Column(nullable = false, name = "code_grade_subject")
	private Long code;

	@NotNull
	@Column(nullable = false, name = "step_grade_subject")
	private Integer step;

	@NotNull
	@Column(nullable = false, name = "credit_grade_subject")
	private Double credit;

	@NotNull
    @ManyToOne(targetEntity = GradeEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_grade_grade_subject"), nullable = false, name = "grade_id_grade")
    private GradeEntity grade;

	/**
	 * Retorna uma instancia de {@link Long}
	 * @return {@link Long}
	 */
	@Override
	public Long getId() {
		return id;
	}

	/**
	 * Atribui um {@link Long}
	 * @param id - {@link Long}
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
	 * Retorna uma instancia de {@link Integer}
	 * @return {@link Integer}
	 */
	public Integer getStep() {
		return step;
	}

	/**
	 * Atribui um {@link Integer}
	 * @param step - {@link Integer}
	 */
	public void setStep(Integer step) {
		this.step = step;
	}

	/**
	 * Retorna uma instancia de {@link Double}
	 * @return {@link Double}
	 */
	public Double getCredit() {
		return credit;
	}

	/**
	 * Atribui um {@link Double}
	 * @param credit - {@link Double}
	 */
	public void setCredit(Double credit) {
		this.credit = credit;
	}

	/**
	 * Retorna uma instancia de {@link GradeEntity}
	 * @return {@link GradeEntity}
	 */
	public GradeEntity getGrade() {
		return grade;
	}

	/**
	 * Atribui um {@link GradeEntity}
	 * @param grade - {@link GradeEntity}
	 */
	public void setGrade(GradeEntity grade) {
		this.grade = grade;
	}
}