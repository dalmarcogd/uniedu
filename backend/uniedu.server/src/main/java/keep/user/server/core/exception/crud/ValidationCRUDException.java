package keep.user.server.core.exception.crud;

import java.util.List;

import keep.user.server.core.exception.ValidationException;
import keep.user.server.core.exception.error.ValidationError;

/**
 * Exce��o gerada a partir dos m�todos CRUD.
 *
 * @author Guilherme Dalmarco (dalmarco.gd@gmail.com)
 */
public class ValidationCRUDException extends ValidationException {

	/**
     * Constructs a new exception with the specified detail message.  The
     * cause is not initialized, and may subsequently be initialized by
     * a call to {@link #initCause}.
     * @param message the detail message. The detail message is saved for
     *                later retrieval by the {@link #getMessage()} method.
     */
    public ValidationCRUDException(String message) {
        super(message);
    }

	/**
	 * Construtor de ValidationCRUDException
	 * <br />- <b>Data de cria��o:</b> 8 de jul de 2017
	 * @param errors
	 */
	public ValidationCRUDException(List<ValidationError> errors) {
		super(errors);
	}
}
