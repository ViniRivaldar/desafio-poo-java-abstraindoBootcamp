import java.time.LocalDate;

import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("um curso completo de java para iniciantes");
        curso1.setCargaHoraria(8);
        
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("js");
        mentoria1.setDescricao("vou pegar na sua mão e te levar ao nivel avançado em js");
        mentoria1.setLocalDate(LocalDate.now());


        System.out.println(curso1);

        System.out.println("******************");

        System.out.println(mentoria1);
    }
}
