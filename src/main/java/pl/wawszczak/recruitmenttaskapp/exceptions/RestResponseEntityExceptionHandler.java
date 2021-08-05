package pl.wawszczak.recruitmenttaskapp.exceptions;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Controller
public class RestResponseEntityExceptionHandler {

    @ExceptionHandler(ManagerNotFoundException.class)
    public ResponseEntity<Object> managerNotFoundHandler(ManagerNotFoundException managerNotFoundException){
        return new ResponseEntity<>("Manager with specified id was not found!", new HttpHeaders(), HttpStatus.NOT_FOUND);
    }
}
