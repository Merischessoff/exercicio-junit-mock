package org.acme.web;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.acme.usercase.IUser;
import org.acme.usercase.UserUseCase;

@Path("/user")
public class WebService {
    
    IUser usercase = new UserUseCase();

    @GET
    @Path("/register/{name}/{password}")
    public String register(@PathParam("name") String name, @PathParam("password") String password){
        usercase.registerUser(name, password);
        return null;
    }
}
