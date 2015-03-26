/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest.resources;

import entity.Aluno;
import entity.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author user
 */
@Path("/aluno/")
public class AlunoResources {
    
    //private Usuario usuario = new Usuario();
    
    @GET      
    @Produces(MediaType.APPLICATION_JSON)    
    public List<Aluno> getAluno(){
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno(1,"123456"));
        alunos.add(new Aluno(2,"654321"));
        
        return alunos;
    }
    
    @Path("/usuario")
    @POST 
    @Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
    @Produces({MediaType.TEXT_PLAIN})
    public String setAluno(Usuario usuario){
        
        
        return "OK";
    }
    
    /*@GET
    @Path("/getusuario")
    @Produces(MediaType.APPLICATION_JSON)
    public String getUsuario(){
        //usuario.setId(2);
        //usuario.setNome("Ruan");
        return usuario.getNome();
    }*/
    
}
