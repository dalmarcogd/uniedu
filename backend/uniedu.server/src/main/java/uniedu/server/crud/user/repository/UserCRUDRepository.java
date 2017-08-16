package uniedu.server.crud.user.repository;

import org.springframework.stereotype.Repository;

import uniedu.server.crud.base.repository.AbstractCRUDRepository;
import uniedu.server.model.user.UserEntity;

/**
 * Respositório de {@link UserFunctionEntity}.
 *
 * @author Guilherme Dalmarco (dalmarco.gd@gmail.com)
 */
@Repository
public class UserCRUDRepository extends AbstractCRUDRepository<UserEntity> {
}