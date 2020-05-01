package com.ticklersoft.hello_world;

import java.util.Date;

public class CounterStrike {

    public static void main(String[] args) {
        Vytah vytahVRecepciBanky = new Vytah();
        Vypinac vypinacVeVytahu = new Vypinac(vytahVRecepciBanky);

        vypinacVeVytahu.zapni();
        vypinacVeVytahu.zapni();

        vypinacVeVytahu.vypni();
        vypinacVeVytahu.zapni();


        //uzivatel + browser

        //aplikace
            //- UI vrstva
                //- formular, tlaticka, validace
            //- logicka vrstva
                //uzivatel, zakaznik, kosik, produkt, ...
            //- datova vrstva
                //uloz / nacti
                //najdi mi posledni moje objednavky
        //DB
    }

    public class UserService {
        public void saveUser(User user){
            //validace

            //uloz usera do DB
        }

        public void deleteUser(User user){
            //smaz usera z DB
        }
    }

    public class Objednavka {
        private String cisloObjenavky;
        private boolean zaplaceno;
        private boolean podepsanoZakaznikem;
        private boolean vyrizena;
        private boolean stornovana;

        public void stornujObjednavku(){
            if (zaplaceno){
                //vyhod chybu, nejde stornovat
            }
            //
            //

        }

        public void zrusPlatbu(){
            if (!zaplaceno){
                //vyhod chybu
            }
            //...
        }

        public boolean isStornovana() {
            return stornovana;
        }

        public void setStornovana(boolean stornovana) {
            this.stornovana = stornovana;
        }

        public String getCisloObjenavky() {
            return cisloObjenavky;
        }

        public void setCisloObjenavky(String cisloObjenavky) {
            this.cisloObjenavky = cisloObjenavky;
        }

        public boolean isZaplaceno() {
            return zaplaceno;
        }

        public void setZaplaceno(boolean zaplaceno) {
            this.zaplaceno = zaplaceno;
        }

        public boolean isPodepsanoZakaznikem() {
            return podepsanoZakaznikem;
        }

        public void setPodepsanoZakaznikem(boolean podepsanoZakaznikem) {
            this.podepsanoZakaznikem = podepsanoZakaznikem;
        }

        public boolean isVyrizena() {
            return vyrizena;
        }

        public void setVyrizena(boolean vyrizena) {
            this.vyrizena = vyrizena;
        }
    }

    public class User {
        private String email;
        private String login;
        private String firstName;
        private String lastName;
        private String password;
        private Date lastLogin;

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public Date getLastLogin() {
            return lastLogin;
        }

        public void setLastLogin(Date lastLogin) {
            this.lastLogin = lastLogin;
        }
    }

}
