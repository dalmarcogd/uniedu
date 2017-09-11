package uniedu.server.crud.userfunction.repository;

import org.springframework.stereotype.Repository;

import uniedu.server.crud.base.repository.AbstractCRUDRepository;
import uniedu.server.model.institution.InstitutionEntity;

/**
 * Respositório de {@link CourseEntity}.
 *
 * @author Guilherme Dalmarco (dalmarco.gd@gmail.com)
 */
@Repository
public class UserFunctionCRUDRepository extends AbstractCRUDRepository<InstitutionEntity> {
}