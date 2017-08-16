package keep.user.server.crud.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import keep.user.server.core.spring.context.ManagerInstance;
import keep.user.server.crud.base.controller.AbstractCRUDController;
import keep.user.server.crud.base.service.AbstractCRUDService;
import keep.user.server.crud.user.service.UserCRUDService;
import keep.user.server.model.user.UserDTO;
import keep.user.server.model.user.UserEntity;

/**
 * Implementa��o de {@link AbstractCRUDController} para {@link UserCityDTO}
 *
 * @author Guilherme Dalmarco (dalmarco.gd@gmail.com)
 */
@RestController
@RequestMapping("/users")
public class UserCRUDController extends AbstractCRUDController<UserDTO, UserEntity> {

    private UserCRUDService userCRUDService;

    /**
     * Retorna o userCRUDService - {@link StateCRUDService}
     * @return {@link StateCRUDService}
     */
    public UserCRUDService getUserCRUDService() {
        if (userCRUDService == null) {
			userCRUDService = ManagerInstance.get(UserCRUDService.class);
		}
        return userCRUDService;
    }

    /**
     * Servi�o de persistencia de {@link UserFunctionEntity}
     * @return {@link AbstractCRUDService} of {@link UserFunctionEntity}
     */
    @Override
    protected AbstractCRUDService<UserEntity, UserDTO> getService() {
        return getUserCRUDService();
    }
}