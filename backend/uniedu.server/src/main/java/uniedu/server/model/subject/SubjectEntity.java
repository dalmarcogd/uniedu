package uniedu.server.model.subject;

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
import uniedu.server.model.course.CourseEntity;

/**
 * Represents a subject.
 *
 * @author Guilherme Dalmarco (dalmarco.gd@gmail.com)
 */
@Entity
@Table(name = "subject")
public class SubjectEntity extends BaseEntity {

	public static final String CODE = "code";
    public static final String DESCRIPTION = "description";

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_subject", nullable = false)
	private Long id;

	@NotNull
	@Column(nullable = false, name = "code_subject")
	private Long code;

	@NotNull
	@Column(nullable = false, name = "description_subject", length=50)
	private String description;

	@NotNull
	@Column(nullable = false, name = "matter_subject", length=50)
	private String matter;

	@NotNull
	@JoinColumn(foreignKey = @ForeignKey(name = "fk_subject_course"), nullable = false, name = "course_id_course")
	@ManyToOne(cascade = CascadeType.REFRESH , fetch = FetchType.LAZY)
	private CourseEntity course;

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
	public String getMatter() {
		return matter;
	}

	/**
	 * Atribui um {@link String}
	 * @param matter - {@link String}
	 */
	public void setMatter(String matter) {
		this.matter = matter;
	}

	/**
	 * Retorna uma instancia de {@link CourseEntity}
	 * @return {@link CourseEntity}
	 */
	public CourseEntity getCourse() {
		return course;
	}

	/**
	 * Atribui um {@link CourseEntity}
	 * @param course - {@link CourseEntity}
	 */
	public void setCourse(CourseEntity course) {
		this.course = course;
	}
}