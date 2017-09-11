package uniedu.server.model.student;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import uniedu.server.model.person.PersonEntity;

/**
 * Representa um professor.
 *
 * @author Guilherme Dalmarco (dalmarco.gd@gmail.com)
 */
@Entity
@DiscriminatorValue(PersonEntity.PERSON_TYPE_STUDENT)
public class StudentEntity extends PersonEntity {

}