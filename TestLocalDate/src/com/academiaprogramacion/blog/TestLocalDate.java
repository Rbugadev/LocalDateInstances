package com.academiaprogramacion.blog;

import java.time.LocalDate;

public class TestLocalDate {

    public static void main(String[] args) {

        LocalDate primeraFecha = LocalDate.parse("2019-03-21");
        LocalDate segundaFecha = LocalDate.parse("2019-04-21");
        LocalDate terceraFecha = LocalDate.of(2019, 03, 21);

        System.out.println("**********************************************");
        System.out.println("blog.academiaprogramacion.com");
        System.out.println("Test de LocalDate en Java");
        System.out.println("**********************************************");

        boolean esAntes = primeraFecha.isBefore(segundaFecha);
        System.out.println("Primera fecha  es anterior a la segunda fecha : " + esAntes);

        boolean esDespues = primeraFecha.isAfter(segundaFecha);
        System.out.println("Primera fecha es posterior a la segunda fecha : " + esDespues);

        boolean esIgual = primeraFecha.isEqual(terceraFecha);
        System.out.println("Primera fecha es igual a 21-03-2019 : " + esIgual);

    }
}
