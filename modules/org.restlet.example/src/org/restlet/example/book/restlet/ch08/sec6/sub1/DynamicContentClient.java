package org.restlet.example.book.restlet.ch08.sec6.sub1;

import org.restlet.resource.ClientResource;

public class DynamicContentClient {
    public static void main(String[] args) throws Exception {
        ClientResource resource = new ClientResource(
                "http://localhost:8082/");
        resource.get().write(System.out);
    }

}