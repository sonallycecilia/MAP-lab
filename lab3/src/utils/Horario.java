package utils;

import utils.enums.*;

public class Horario {
    private Dia dia;
    private HoraAula hora;

    // construtores
    public Horario(Dia dia, HoraAula hora) {
        this.dia = dia;
        this.hora = hora;
    }

    // getters
    public Dia getDia() {
        return dia;
    }
    public HoraAula getHora() {
        return hora;
    }

    // setters
    public void setDia(Dia dia) {
        this.dia = dia;
    }
    public void setHora(HoraAula hora) {
        this.hora = hora;
    }

    // metodos
    @Override
    public String toString(){
        return "Dia: "+ dia + " as " + hora + " horas";
    }
}