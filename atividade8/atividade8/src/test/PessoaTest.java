package atividade8.atividade8.src.test;

import java.beans.Transient;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PessoaTest {
    pessoa pessoa;

    @BeforeEach
    public void setup(){
        this.pessoa = new pessoa();
    }

    @Test
    public void  dizerOlaTest(){
        assertEquals ("Ola, maven", pessoa.dizerOla());
    }
    
}