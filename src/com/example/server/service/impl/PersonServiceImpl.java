package com.example.server.service.impl;

import com.example.server.dto.ResultDTO;
import com.example.server.model.Person;
import com.example.server.service.PersonService;

import javax.jws.WebService;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Created by akila on 12/11/16.
 */
@WebService(endpointInterface = "com.example.server.service.PersonService")
public class PersonServiceImpl implements PersonService {

    private static Map<Integer,Person> persons = new HashMap<Integer,Person>();

    @Override
    public boolean addPerson(Person p) {
        if(persons.get(p.getId()) != null) {
            return false;
        }
        persons.put(p.getId(), p);
        return true;
    }

    @Override
    public boolean deletePerson(int id) {
        if(persons.get(id) == null) {
            return false;
        }
        persons.remove(id);
        return true;
    }

    @Override
    public Person getPerson(int id) {
        return persons.get(id);
    }

    @Override
    public ResultDTO getAllPersons() {
        ResultDTO resultDTO = new ResultDTO();

        if (persons.values().size() > 0) {
            resultDTO.setPersonSet(new HashSet<>(persons.values()));
        }

        return resultDTO;
    }

}
