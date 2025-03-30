package utils;

import utils.enums.*;

public class Horario {
    private Dia dia;
<<<<<<< HEAD
    private HoraAula hora;
    private Turno turno;

    // construtores
    public Horario(Dia dia, HoraAula hora, Turno turno) {
        this.dia = dia;
        this.hora = hora;
        this.turno = turno;
=======
    private HoraAula horaAula;

    public Horario(Dia dia, HoraAula horaAula) {
        this.dia = dia;
        this.horaAula = horaAula;
>>>>>>> 29166147e31fc93949bb79e13f43b0d94e8f9e39
    }

    public Dia getDia() {
        return dia;
    }

    public HoraAula getHoraAula() {
        return horaAula;
    }
    public Turno getTurno() {
        return turno;
    }

    public boolean temSobreposicao(Horario outro) {
        if (this.dia != outro.getDia()) {
            return false;
        }
        return this.horaAula.temSobreposicao(outro.getHoraAula());
    }
    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    @Override
<<<<<<< HEAD
    public String toString(){
        return "Dia: "+ dia + " as " + hora + " horas" ;
=======
    public String toString() {
        return dia + " " + horaAula.toString();
>>>>>>> 29166147e31fc93949bb79e13f43b0d94e8f9e39
    }
}