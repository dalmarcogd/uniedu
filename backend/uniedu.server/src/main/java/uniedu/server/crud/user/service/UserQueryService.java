package uniedu.server.crud.user.service;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uniedu.server.core.criteria.CriteriaFactory;
import uniedu.server.core.utils.ClassUtils;
import uniedu.server.model.user.UserEntity;

/**
 * Serviço de consulta de usuário.
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