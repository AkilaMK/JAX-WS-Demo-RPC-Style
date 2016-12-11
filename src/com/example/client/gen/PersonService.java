
package com.example.client.gen;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PersonService", targetNamespace = "http://service.server.example.com/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PersonService {


    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://service.server.example.com/PersonService/deletePersonRequest", output = "http://service.server.example.com/PersonService/deletePersonResponse")
    public boolean deletePerson(
            @WebParam(name = "arg0", partName = "arg0")
                    int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.example.client.gen.Person
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://service.server.example.com/PersonService/getPersonRequest", output = "http://service.server.example.com/PersonService/getPersonResponse")
    public Person getPerson(
            @WebParam(name = "arg0", partName = "arg0")
                    int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://service.server.example.com/PersonService/addPersonRequest", output = "http://service.server.example.com/PersonService/addPersonResponse")
    public boolean addPerson(
            @WebParam(name = "arg0", partName = "arg0")
                    Person arg0);

    /**
     * 
     * @return
     *     returns com.example.client.gen.ResultDTO
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://service.server.example.com/PersonService/getAllPersonsRequest", output = "http://service.server.example.com/PersonService/getAllPersonsResponse")
    public ResultDTO getAllPersons();

}
