package keep.user.server.crud.user.service;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import keep.user.server.core.criteria.CriteriaFactory;
import keep.user.server.core.utils.ClassUtils;
import keep.user.server.model.user.UserEntity;

/**
 * Servi�o de consulta de usu�rio.
 *
 * @author Guilherme Dalmarco (dalmarco.gd@gmail.com)
 */
@Service
public class UserQueryService {

    @Autowired
    private CriteriaFactory criteriaFactory;

    @Transactional(readOnly = true)
    public UserEntity getUserByName(String name) {
        Criteria q = criteriaFactory.createCriteria(UserEntity.class);
        q.add(Restrictions.eq(UserEntity.NAME, name));
        return ClassUtils.toAssignable(UserEntity.class, q.uniqueResult());
    }

    @Transactional(readOnly = true)
    public UserEntity getUserByCPF(String cpf) {
        Criteria q = criteriaFactory.createCriteria(UserEntity.class);
        q.add(Restrictions.eq(UserEntity.CPF, cpf));
        return ClassUtils.toAssignable(UserEntity.class, q.uniqueResult());
    }
}