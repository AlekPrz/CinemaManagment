package com.app.aprzybysz;


import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashSet;

@SpringBootApplication
public class CinemaApplication {


    public static void main(String[] args) {
        SpringApplication.run(CinemaApplication.class, args);
    }


}

/*
    TODO Na czym powinienes sie skupic na poczatek

    1. ADMIN moze zarzadzac infrastruktura kin. Dodawanie kin, sal kiniowych, miejsc
       filmow. Mozesz pomslec zeby np od razu mozna bylo tworzyc cala sale z lista
       siedziec czyli np podajesz ile ma byc rzedow i miesc i od razu generuje wszystkie
       siedzienia oczywiscie na poczatku w stanie FREE. Mozesz edytowc te dane. I tutaj
       rowniez jest mozliwosc przygotowania funkcjonalnosci gdzie przy zmianie ilosci miejsc
       w sali od raz z bazy sa usuwane lub do bazy sa odawane wszystkie potrzebne miejsca.
       Oczywiscie mozesz przewidziec zabezpieczenie ze taka aktualizacja miesjc moze sie odbyc
       tylko jezeli nie ma akurat seansu w tej sali zeby nagle nie wyrzucil kupionych miejsc.

    2. USER moze oczywiscie przegladac filmy i sale kiniowe ale moze tez zakupic bilet.
       Procedura zakupienia biletu:
       Pamietaj ze to jest aplikacja webowa wiec kazdy ponizszy podpunkt to osobny
       request.

       1. User wybiera albo miasto albo kino albo movies potem podaje zakres godzin i date.
          W efekcie dostaje liste wszystkich dopasowanych seansow.

       2. User moze wyrazic chec zakupienia biletu na dany seans wysylajac w request
          jego id. W odpowiedzi wysylana jest tablica miejsc zajetych i wolnych w tej
          sali.

       3. User moze wybrac miejsce - jedno lub wiecej na podstawie otrzymanego wykazu.
          Rezerwacja miejsc odbywa sie poprzez wyslanie ich rzedow i numerow w json body.
          Przy okazji user wskazuje czy to rezerwacja czy od razu chce kupic bilet.
          Tutaj nie bedziemy obslugiwac platnosci wiec ta informacja konczy problem platnosci.
          Dodatkowo user informuje czy na dane miejsce jest znizka czy nie.
          Po wyslaniu tych informacji biltey sa dodawane do bazy a user dostaje
          pdf na email, w ktorym ma informacje o zakupionych biletach. Moga to byc
          np osobne pdf dla kazdego biletu. Mozesz pobraci sie w generowanie kodu
          QR ktory bedzie dolaczany do pdf.

       4. System co 5 minut skanuje wszystkie bilety i te ktore mialy status miejsca
          RESERVED jezeli jest mniej niz 30 min do seansu to zmienamy na FREE.
          User moze zmienic status biletu z RESERVED na ORDERED wysylac request
          w ktorym poda id ticketa. Moze tez oczywiscie zrezygnowac z rezerwacji
          wtedy bedzie stan zmieniony z RESERVED na FREE.
*/
