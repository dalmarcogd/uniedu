package uniedu.server.crud.userfunction.repository;

import org.springframework.stereotype.Repository;

import uniedu.server.crud.base.repository.AbstractCRUDRepository;
import uniedu.server.model.userfunction.UserFunctionEntity;

/**
 * Resposit�rio de {@link UserFunctionEntity}.
 *
 * @author Guilherme Dalmarco (dalmarco.gd@gmail.com)
 */
@Repository
public class UserFunctionCRUDRepository extends AbstractCRUDRepository<UserFunctionEntity> {
}