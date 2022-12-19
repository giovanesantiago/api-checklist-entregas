package entregas.api.checklist.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class ClienteNotFoundException extends RuntimeException{

    public ClienteNotFoundException(Long id) {
        super("Cliente não encontrado no id : " + id);
    }
}
