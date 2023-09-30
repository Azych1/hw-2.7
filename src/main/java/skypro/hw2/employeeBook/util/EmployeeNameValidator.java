package skypro.hw2.employeeBook.util;

import org.apache.commons.lang3.StringUtils;
import skypro.hw2.employeeBook.exception.IllegalSymbolException;

import java.util.List;

public class EmployeeNameValidator {

    public static void validateIsAplha(String... names) {
        for (String name : names) {
            if (!StringUtils.isAlpha(name)) {
                throw new IllegalSymbolException();
            }
        }
    }
}
