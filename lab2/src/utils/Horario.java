package utils;

import utils.enums.Dias;

public class Horario {
    private Dias dia;
    private String hora;
    
    public Horario(Dias dia, String hora) {
        this.dia = dia;
        this.hora = hora;
    }

    public Dias getDia() {
        return dia;
    }
    public void setDia(Dias dia) {
        this.dia = dia;
    }
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString(){
        return "Dia: "+ dia + " as " + hora + " horas";
    }
}
