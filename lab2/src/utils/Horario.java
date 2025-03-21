package utils;

import utils.enums.*;

public class Horario {
    private Dia dia;
    private Hora hora;

    // construtores
    public Horario(Dia dia, Hora hora) {
        this.dia = dia;
        this.hora = hora;
    }

    // getters
    public Dia getDia() {
        return dia;
    }
    public Hora getHora() {
        return hora;
    }

    // setters
    public void setDia(Dia dia) {
        this.dia = dia;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }

    // metodos
    @Override
    public String toString(){
        return "Dia: "+ dia + " as " + hora + " horas";
    }
}
