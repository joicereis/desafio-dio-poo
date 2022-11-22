import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Desenvolvedor;
import br.com.dio.desafio.dominio.Mentoria;


public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Descrição de curso Java.");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("C#");
        curso2.setDescricao("Descrição de curso C#.");
        curso2.setCargaHoraria(7);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição Mentoria Java.");
        mentoria1.setData(LocalDate.now()); //vai atribuir a data atual (AAAA/MM/DD)
        /* 
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1); */

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp1.getConteudosBootcamp().add(curso1);
        bootcamp1.getConteudosBootcamp().add(curso2);
        bootcamp1.getConteudosBootcamp().add(mentoria1);

        Desenvolvedor devJoice = new Desenvolvedor();
        devJoice.setNome("Joice");
        devJoice.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos inscritos da Joice." + devJoice.getConteudosInscritos());
        devJoice.progredir();
        System.out.println("Conteúdos concluídos da Joice" + devJoice.getConteudosConcluidos());
        System.out.println("Conteudos inscritos da Joice." + devJoice.getConteudosInscritos());
        devJoice.progredir();
        System.out.println("Conteudos inscritos da Joice." + devJoice.getConteudosInscritos());
        System.out.println("Conteúdos concluídos da Joice" + devJoice.getConteudosConcluidos());
        System.out.println("Total XP Joice: " + devJoice.calcularTotalXp());

        Desenvolvedor devJoao = new Desenvolvedor();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp1);
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteudos inscritos do Joao." + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluídos do João" + devJoao.getConteudosConcluidos());
        devJoao.calcularTotalXp();
        System.out.println("Total XP João: " + devJoao.calcularTotalXp());
    }
}
