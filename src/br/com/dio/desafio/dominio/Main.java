package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso1.setTitulo("Curso Js");
        curso1.setDescricao("Descrição curso Js");
        curso1.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("Descrição da mentoria de Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLevy = new Dev();
        devLevy.setNome("Levy");
        devLevy.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos" +devLevy.getConteudosInscritos());
        devLevy.progredir();
        devLevy.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos" +devLevy.getConteudosInscritos());
        System.out.println("Conteudos concluidos" +devLevy.getConteudosConcluidos());
        System.out.println("Xp" + devLevy.calcularTotalXP());

        System.out.println("--------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos" +devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos" +devJoao.getConteudosInscritos());
        System.out.println("Conteudos concluidos" +devJoao.getConteudosConcluidos());
        System.out.println("Xp" + devJoao.calcularTotalXP());
    }
}
