package uniedu.server.model.grade;

import uniedu.server.model.base.BaseDTO;
import uniedu.server.model.course.CourseEntity;

/**
 * Representa um {@link CourseEntity}.
 *
 * @author Guilherme Dalmarco (dalmarco.gd@gmail.com)
 */
public class GradeDTO extends BaseDTO {

    private Long code;
    private PeriodType periodType;
	private Integer year;
	private Long idCourse;

    /**
     * Retorna o code - {@link Long}
     * @return {@link Long}
     */
    public Long getCode() {
        return code;
    }

    /**
     * Atribui ao code - {@link Long}
     * @param code - {@link Long}
     */
    public void setCode(Long code) {
        this.code = code;
    }

	/**
	 * Retorna uma instancia de {@link PeriodType}
	 * @return {@link PeriodType}
	 */
	public PeriodType getPeriodType() {
		return periodType;
	}

	/**
	 * Atribui um {@link PeriodType}
	 * @param periodType - {@link PeriodType}
	 */
	public void setPeriodType(PeriodType periodType) {
		this.periodType = periodType;
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
	 * Retorna uma instancia de {@link Long}
	 * @return {@link Long}
	 */
	public Long getIdCourse() {
		return idCourse;
	}

	/**
	 * Atribui um {@link Long}
	 * @param idCourse - {@link Long}
	 */
	public void setIdCourse(Long idCourse) {
		this.idCourse = idCourse;
	}
}