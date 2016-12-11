package com.example.server.endpoint;

import com.example.server.service.impl.PersonServiceImpl;

import javax.xml.ws.Endpoint;

/**
 * Created by akila on 12/11/16.
 */
public class SOAPPublisher {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8888/ws/person", new PersonServiceImpl());
    }

}