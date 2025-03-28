package utils;

import utils.enums.*;

public class Horario {
    private Dia dia;
    private HoraAula hora;
    private Turno turno;

    // construtores
    public Horario(Dia dia, HoraAula hora, Turno turno) {
        this.dia = dia;
        this.hora = hora;
        this.turno = turno;
    }

    // getters
    public Dia getDia() {
        return dia;
    }
    public HoraAula getHora() {
        return hora;
    }
    public Turno getTurno() {
        return turno;
    }

    // setters
    public void setDia(Dia dia) {
        this.dia = dia;
    }
    public void setHora(HoraAula hora) {
        this.hora = hora;
    }
    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    // metodos
    @Override
    public String toString(){
        return "Dia: "+ dia + " as " + hora + " horas" ;
    }
}