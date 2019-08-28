package com.huawei.servicecomb.controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseJAXRSServerDemoCodegen", date = "2019-08-28T06:15:18.963Z")


@RestSchema(schemaId = "cseDemo")
@Path("/rest")

@Produces({ "application/json" })
public class CseDemoImpl  {

    @Autowired
    private CseDemoDelegate cseDemoDelegate;

    @Path("/helloworld")
    @GET
    
    @Produces({ "application/json" })
    public String helloworld(@QueryParam("name") String name) {

    	return cseDemoDelegate.helloworld(name);
    }
}

