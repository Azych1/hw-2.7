package skypro.hw2.employeeBook.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Должны быть только буквы")
public class IllegalSymbolException extends IllegalArgumentException{
}
