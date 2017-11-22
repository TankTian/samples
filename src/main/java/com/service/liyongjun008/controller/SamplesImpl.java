package com.service.liyongjun008.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-11-22T16:16:35.395Z")

@RestSchema(schemaId = "samples")
@RequestMapping(path = "/liyongjun008", produces = MediaType.APPLICATION_JSON)
public class SamplesImpl {

    @Autowired
    private SamplesDelegate userSamplesDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userSamplesDelegate.helloworld(name);
    }

}
