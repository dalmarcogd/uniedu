package keep.user.server.crud.userfunction.repository;

import org.springframework.stereotype.Repository;

import keep.user.server.crud.base.repository.AbstractCRUDRepository;
import keep.user.server.model.userfunction.UserFunctionEntity;

/**
 * Resposit�rio de {@link UserFunctionEntity}.
 *
 * @author Guilherme Dalmarco (dalmarco.gd@gmail.com)
 */
@Repository
public class UserFunctionCRUDRepository extends AbstractCRUDRepository<UserFunctionEntity> {
}