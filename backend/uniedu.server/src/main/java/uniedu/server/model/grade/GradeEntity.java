package uniedu.server.model.grade;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
 * Represents a education grade.
 *
 * @author Guilherme Dalmarco (dalmarco.gd@gmail.com)
 */
@Entity
@Table(name = "grade")
public class GradeEntity extends BaseEntity {

	public static final String CODE = "code";
    public static final String PERIOD_TYPE_START = "periodTypeStart";
    public static final String YEAR = "year";
    public static final String COURSE = "course";

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_grade", nullable = false)
	private Long id;

	@NotNull
	@Column(nullable = false, name = "code_grade")
	private Long code;

	@NotNull
	@Enumerated(EnumType.STRING)
	@Column(nullable = false, name = "period_type_start_grade")
	private PeriodType periodTypeStart;

	@NotNull
	@Column(nullable = false, name = "year_grade")
	private Integer year;

	@NotNull
	@JoinColumn(foreignKey = @ForeignKey(name = "fk_grade_course"), nullable = false, name = "course_id_course")
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
	 * Retorna uma instancia de {@link PeriodType}
	 * @return {@link PeriodType}
	 */
	public PeriodType getPeriodTypeStart() {
		return periodTypeStart;
	}

	/**
	 * Atribui um {@link PeriodType}
	 * @param periodTypeStart - {@link PeriodType}
	 */
	public void setPeriodTypeStart(PeriodType periodTypeStart) {
		this.periodTypeStart = periodTypeStart;
	}

	/**
	 * Retorna uma instancia de {@link Integer}
	 * @return {@link Integer}
	 */
	public Integer getYear() {
		return year;
	}

	/**
	 * Atribui um {@link Integer}
	 * @param year - {@link Integer}
	 */
	public void setYear(Integer year) {
		this.year = year;
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