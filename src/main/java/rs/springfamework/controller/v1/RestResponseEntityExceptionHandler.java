package rs.springfamework.controller.v1;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import rs.springfamework.services.ResourceNotFoundException;

/**
 * Created by rs on 2/19/2018.
 */
@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({ResourceNotFoundException.class})
    public ResponseEntity<Object> handleNotFoundException(Exception exception, WebRequest request){

        return new ResponseEntity<Object>("Resource Not Found", new HttpHeaders(), HttpStatus.NOT_FOUND);

    }
}