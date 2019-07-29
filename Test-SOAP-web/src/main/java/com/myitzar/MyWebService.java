package com.myitzar;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by Gabby on 2017/03/25.
 */
@WebService
public class MyWebService {
    @WebMethod
    public String sayHello(String name){
        return "Hello, " + name;
    }
}
