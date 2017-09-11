package uniedu.server.model.person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import uniedu.server.model.base.BaseEntity;
import uniedu.server.model.person.contact.PersonContactEntity;

/**
 * Representa uma pessoa.
 *
 * @author Guilherme Dalmarco (dalmarco.gd@gmail.com)
 */
@Entity
@Table(name = "person")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name=PersonEntity.PERSON_TYPE, discriminatorType=DiscriminatorType.STRING)
public class PersonEntity extends BaseEntity {

	public static final String CODE = "code";
	public static final String NAME = "name";
	public static final String BIRTH_DAY = "birthDay";
	public static final String CPF = "cpf";
	public static final String PERSON_TYPE = "personType";
	public static final String CONTACTS = "contacts";

	public static final String PERSON_TYPE_TEACHER = "personType_teacher";
	public static final String PERSON_TYPE_STUDENT = "personType_student";

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_person", nullable = false)
	private Long id;

	@NotNull
	@Column(nullable = false, name = "code_person")
	private Long code;

	@NotNull
	@Column(nullable = false, name = "name_person", length=100)
	private String name;

	@NotNull
	@Column(nullable = false, name = "cpf_person", length=20)
	private String cpf;

    @Column(name = "birth_day_person")
    private LocalDate birthDate;

	@OneToMany(cascade = CascadeType.REFRESH,targetEntity = PersonContactEntity.class, fetch = FetchType.LAZY, mappedBy = PersonContactEntity.PERSON)
	private List<PersonContactEntity> contacts = new ArrayList<>();

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

	/**
	 * Retorna uma instancia de {@link LocalDate}
	 * @return {@link LocalDate}
	 */
	public LocalDate getBirthDate() {
		return birthDate;
	}

	/**
	 * Atribui um {@link LocalDate}
	 * @param birthDate - {@link LocalDate}
	 */
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	/**
	 * Retorna uma instancia de {@link String}
	 * @return {@link String}
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * Atribui um {@link String}
	 * @param cpf - {@link String}
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * Retorna uma instancia de {@link List<GradeSubjectEntity>}
	 * @return {@link List<GradeSubjectEntity>}
	 */
	public List<PersonContactEntity> getContacts() {
		return contacts;
	}

	/**
	 * Atribui um {@link List<GradeSubjectEntity>}
	 * @param contacts - {@link List<GradeSubjectEntity>}
	 */
	public void setContacts(List<PersonContactEntity> contacts) {
		this.contacts = contacts;
	}
}