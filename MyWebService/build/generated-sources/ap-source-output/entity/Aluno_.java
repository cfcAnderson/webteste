package entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-03-26T09:28:44")
@StaticMetamodel(Aluno.class)
public class Aluno_ { 

    public static volatile SingularAttribute<Aluno, Integer> id;
    public static volatile SingularAttribute<Aluno, String> email;
    public static volatile SingularAttribute<Aluno, String> nome;
    public static volatile SingularAttribute<Aluno, Date> dataNascimento;
    public static volatile SingularAttribute<Aluno, String> cpf;
    public static volatile SingularAttribute<Aluno, Date> dataCadastro;
    public static volatile SingularAttribute<Aluno, String> digital;

}