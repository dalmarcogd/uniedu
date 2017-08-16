package uniedu.server.crud.userfunction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uniedu.server.crud.base.repository.AbstractCRUDRepository;
import uniedu.server.crud.base.service.AbstractCRUDService;
import uniedu.server.crud.userfunction.repository.UserFunctionCRUDRepository;
import uniedu.server.model.base.BaseDTO;
import uniedu.server.model.userfunction.UserFunctionDTO;
import uniedu.server.model.userfunction.UserFunctionEntity;

/**
 * Serviço de persistencia de {@link UserFunctionEntity}
 *
 * @author Guilherme Dalmarco (dalmarco.gd@gmail.com)
 */
@Service
public class UserFunctionCRUDService extends AbstractCRUDService<UserFunctionEntity, UserFunctionDTO> {

    @Autowired
    private UserFunctionCRUDRepository userFunctionCRUDRepository;

    /**
     * {@inheritDoc}
     */
    @Override
    protected AbstractCRUDRepository<UserFunctionEntity> getCRUDRepository() {
        return userFunctionCRUDRepository;
    }

    /**
     * Converte os dados do dto para entity.
     * @param dto    - {@link BaseDTO}
     * @param entity - {@link UserFunctionEntity}
     * @return {@link UserFunctionEntity}
     */
    @Override
    public UserFunctionEntity convertToEntity(UserFunctionDTO dto, UserFunctionEntity entity) {
    	entity.setId(dto.getId());
    	entity.setVersion(dto.getVersion());
    	entity.setCode(dto.getCode());
    	entity.setName(dto.getName());
        return entity;
    }

    /**
     * Converte os dados do entity para dto.
     * @param dto    - {@link BaseDTO}
     * @param entity - {@link UserFunctionEntity}
     * @return {@link UserUserFunctionDTO}
     */
    @Override
    public UserFunctionDTO convertToDTO(UserFunctionEntity entity, UserFunctionDTO dto) {
    	dto.setId(entity.getId());
    	dto.setVersion(entity.getVersion());
    	dto.setCode(entity.getCode());
    	dto.setName(entity.getName());
        return dto;
    }

    /**
     * Cria uma entidade nova e vazia.
     * @return {@link UserFunctionEntity}
     */
    @Override
    public UserFunctionEntity createEmptyEntity() {
        return new UserFunctionEntity();
    }

    @Override
    public UserFunctionDTO createEmptyDTO() {
        return new UserFunctionDTO();
    }

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void internalValidate(UserFunctionEntity entity) {

	}
}