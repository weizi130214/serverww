package com.service.serverww.controller;


import org.springframework.beans.factory.annotation.Autowired;
import io.servicecomb.provider.pojo.RpcSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CsePojoDemoCodegen", date = "2017-11-24T05:20:49.693Z")

@RpcSchema(schemaId = "serverww")
public class ServerwwImpl implements Serverww{

    @Autowired
    private ServerwwDelegate serverwwDelegate;


    public String helloworld(String name) {

        return serverwwDelegate.helloworld(name);
    }

}
