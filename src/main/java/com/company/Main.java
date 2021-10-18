package com.company;

public class Main {
    public static void main(String[] args) {


        com.company.Films exampleFilm = new Films("Part3 return of the film",0.2);
        Films movie2 = new Films();
        System.out.println("The films name is \"" + exampleFilm.getName() + "\", it weighs " + exampleFilm.getItemSize() + "Kgs");
        System.out.println("The default film name is \"" + movie2.getName() + "\", it weighs " + movie2.getItemSize() + "Kgs");
        movie2.checkAvalibility();


        Digital exampleAudiobookDigital = new Digital();
        System.out.println(exampleAudiobookDigital.getName());

        com.company.TV TVshow1 = new com.company.TV();
        System.out.println("The defaut TV show is called \"" + TVshow1.getName() + "\" and it weighs " + TVshow1.getItemSize() + "Kgs");


        Digital exampleDigitalAudiobook = new Digital();
        System.out.println("The default digital audio book title is \"" + exampleDigitalAudiobook.getName() + "\"  and is " + exampleDigitalAudiobook.getDataSize() + "Mb" );
        exampleDigitalAudiobook.checkAvalibility();
        movie2.checkAvalibility();

    }
}
