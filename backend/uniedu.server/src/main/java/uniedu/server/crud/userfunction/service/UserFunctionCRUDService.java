package uniedu.server.crud.userfunction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uniedu.server.crud.base.repository.AbstractCRUDRepository;
import uniedu.server.crud.base.service.AbstractCRUDService;
import uniedu.server.crud.userfunction.repository.UserFunctionCRUDRepository;
import uniedu.server.model.base.BaseDTO;
import uniedu.server.model.institution.InstitutionDTO;
import uniedu.server.model.institution.InstitutionEntity;

/**
 * Serviço de persistencia de {@link CourseEntity}
 *
 * @author Guilherme Dalmarco (dalmarco.gd@gmail.com)
 */
@Service
public class UserFunctionCRUDService extends AbstractCRUDService<InstitutionEntity, InstitutionDTO> {

    @Autowired
    private UserFunctionCRUDRepository userFunctionCRUDRepository;

    /**
     * {@inheritDoc}
     */
    @Override
    protected AbstractCRUDRepository<InstitutionEntity> getCRUDRepository() {
        return userFunctionCRUDRepository;
    }

    /**
     * Converte os dados do dto para entity.
     * @param dto    - {@link BaseDTO}
     * @param entity - {@link CourseEntity}
     * @return {@link CourseEntity}
     */
    @Override
    public InstitutionEntity convertToEntity(InstitutionDTO dto, InstitutionEntity entity) {
    	entity.setId(dto.getId());
    	entity.setVersion(dto.getVersion());
    	entity.setCode(dto.getCode());
    	entity.setName(dto.getName());
        return entity;
    }

    /**
     * Converte os dados do entity para dto.
     * @param dto    - {@link BaseDTO}
     * @param entity - {@link CourseEntity}
     * @return {@link UserUserFunctionDTO}
     */
    @Override
    public InstitutionDTO convertToDTO(InstitutionEntity entity, InstitutionDTO dto) {
    	dto.setId(entity.getId());
    	dto.setVersion(entity.getVersion());
    	dto.setCode(entity.getCode());
    	dto.setName(entity.getName());
        return dto;
    }

    /**
     * Cria uma entidade nova e vazia.
     * @return {@link CourseEntity}
     */
    @Override
    public InstitutionEntity createEmptyEntity() {
        return new InstitutionEntity();
    }

    @Override
    public InstitutionDTO createEmptyDTO() {
        return new InstitutionDTO();
    }

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void internalValidate(InstitutionEntity entity) {

	}
}