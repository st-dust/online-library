package org.stdust.library.util;

import org.stdust.library.dao.PersonDAO;
import org.stdust.library.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class PersonValidator implements Validator {
    private final PersonDAO personDAO;

    @Autowired
    public PersonValidator(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return Person.class.equals(aClass);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Person person = (Person) target;

        //Perform validation
        if (personDAO.findByID(person.getName()).isPresent()) {
            errors.rejectValue("name", "999", "This name already exists in DB");
        }
    }
}
