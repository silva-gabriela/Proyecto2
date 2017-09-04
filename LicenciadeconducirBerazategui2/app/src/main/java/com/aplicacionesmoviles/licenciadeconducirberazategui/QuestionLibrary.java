package com.aplicacionesmoviles.licenciadeconducirberazategui;

/**
 * Created by lab 2 on 17/08/2017.
 */

public class QuestionLibrary {
    private String mQuestions [] = {
            "Sobre que carril se debe conducir?",
            "Que ultilidad tiene los cinturones de seguridad.",
            "Que indica un cordon amarillo.",
            "Cual es la forma correcta de adelantarse a otro vehiculo",
            "Cual es la velocidad normal en calle de barrio",
            "Que indica la cruz de san andres",
            "Cual es la velocidad maxima permitida en autopistas",
            "En caso de niebla, es mejor para en la banquina",
            "Que vehiculos tienen prioridad de adelantarse cuando circulan en fila",
            "El uso de celulares y auriculares estan permitidos al conducir?",

    };


    private String mChoices [][] = {
            {"derecho", "izquierdo", "centro"},
            {"disminuyen daños", "utiles en velocidades", "No es util"},
            {"Prohibido estacionar", "no significa nada", "prohibido detenerse"},
            {"derecha", "banquina", "Izquierda con sus señales"},
            {"30 km/h", "40 km/h", "50 km/h"},
            {"cruce de caminos", "vias ferreas", "peatones"},
            {"60 km/h", "80 km/h", "130 km/h"},
            {"si", "no", "si hay mucha niebla si"},
            {"el primero que lo intente", "el ultimo de la fila", "el que circule primero"},
            {"si", "no", "si para el acompañante"},
    };



    private String mCorrectAnswers[] = {"derecho", "disminuyen daños", "prohibido estacionar", "Izquierda con sus señales", "40 km/h", "vias ferreas", "130 km/h", "no", "el que circule primero", "no"};




    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }
    public String getChoice4(int a) {
        String choice3 = mChoices[a][3];
        return choice3;
    }
    public String getChoice5(int a) {
        String choice4 = mChoices[a][4];
        return choice4;
    }
    public String getChoice6(int a) {
        String choice5 = mChoices[a][5];
        return choice5;
    }
    public String getChoice7(int a) {
        String choice6 = mChoices[a][6];
        return choice6;
    }
    public String getChoice8(int a) {
        String choice7 = mChoices[a][7];
        return choice7;
    }
    public String getChoice9(int a) {
        String choice8 = mChoices[a][8];
        return choice8;
    }
    public String getChoice10(int a) {
        String choice9 = mChoices[a][9];
        return choice9;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }


}
