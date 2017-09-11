package uniedu.server.crud.userfunction.service;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uniedu.server.core.criteria.CriteriaFactory;
import uniedu.server.model.institution.InstitutionEntity;

/**
 * Serviço de consulta de cidades.
 *
 * @author Guilherme Dalmarco (dalmarco.gd@gmail.com)
 */
@Service
public class UserFunctionQueryService {

    @Autowired
    private CriteriaFactory criteriaFactory;

    @Transactional(readOnly = true)
    public List<InstitutionEntity> getFunctionsByName(String name) {
        Criteria q = criteriaFactory.createCriteria(InstitutionEntity.class);
        q.add(Restrictions.like(InstitutionEntity.NAME, name, MatchMode.ANYWHERE));
        return q.list();
    }
}