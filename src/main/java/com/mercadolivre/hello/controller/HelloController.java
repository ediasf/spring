package com.mercadolivre.hello.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

    @GetMapping
    public String Hello(){
        return "Hello World!";
    }
    @GetMapping("/lista1")
    public String Lista1(){
        return "<h1> LISTA DAS BSM's DA GENERATION BRASIL </h1>" +
                "<h3><li>ORIENTAÇÃO AO FUTURO</li><h3>" +
                "<p>" +
                "<h3><li>PERSISTÊNCIA</li><h3>" +
                "<p>" +
                "<h3><li>TRABALHO EM EQUIPE</li><h3>" +
                "<p>" +
                "<h3><li>ATENÇÃO AOS DETALHES</li><h3>" +
                "<p>" +
                "<h3><li>PROATIVIDADE</li><h3>" +
                "<p>" +
                "<h3><li>COMUNICAÇÃO</li><h3>" +
                "<p>" +
                "<h3><li>RESPONSABILIDADE PESSOAL</li><h3>" +
                "<p>" +
                "<h3><li>MENTALIDADE DE CRESCIMENTO</li><h3>" +
                "<p>";


    }

    @GetMapping("/lista2")
    public String Lista2(){
        return "<h1><lu>LISTA  DE CONTEUDO DE APRENDIZAGEM SEMANAL</lu><h1>" +
                "<h3><li>SPRING BOOT</li><h3>" +
                "<p>" +
                "<h3><li>TRABALHO EM EQUIPE</li><h3>" +
                "<p>" +
                "<h3><li>BANCO DE DADOS</li><h3>" +
                "<p>" +
                "<h3><li>REQUISIÇÕES HTTP</li><h3>";

    }



}
