package com.realdolmen.course.beans;

import com.realdolmen.course.domain.Person;
import com.realdolmen.course.service.PersonServiceBean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@RequestScoped
public class PersonBean {
    @Inject
    private PersonServiceBean personService;

    public List<Person> allPeople() {
        return personService.findAll();
    }

    public String remove(long personId) {
        personService.remove(personId);
        return "people";
    }
}
