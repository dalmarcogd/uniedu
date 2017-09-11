package uniedu.server.model.course;

import uniedu.server.model.base.BaseDTO;

/**
 * Representa um {@link CourseEntity}.
 *
 * @author Guilherme Dalmarco (dalmarco.gd@gmail.com)
 */
public class CourseDTO extends BaseDTO {

    private Long code;
    private String description;
	private String situation;
	private Double valueCredit;
	private Long idInstitution;

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
	 * Retorna uma instancia de {@link Long}
	 * @return {@link Long}
	 */
	public Long getIdInstitution() {
		return idInstitution;
	}

	/**
	 * Atribui um {@link Long}
	 * @param idInstitution - {@link Long}
	 */
	public void setIdInstitution(Long idInstitution) {
		this.idInstitution = idInstitution;
	}
}