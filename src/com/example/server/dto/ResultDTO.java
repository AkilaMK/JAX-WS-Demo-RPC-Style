package com.example.server.dto;

import com.example.server.model.Person;

import javax.xml.bind.annotation.XmlType;
import java.util.Set;

/**
 * Created by akila on 12/11/16.
 * JAXB cann't process a plain Set, List, Collections like interfaces
 * So here I have use a DTO to return the result
 */
@XmlType
public class ResultDTO {
    private Set<Person> personSet;

    public Set<Person> getPersonSet() {
        return personSet;
    }

    public void setPersonSet(Set<Person> personSet) {
        this.personSet = personSet;
    }
}
