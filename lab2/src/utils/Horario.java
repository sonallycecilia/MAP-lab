package utils;

import utils.enums.Dia;

public class Horario {
    private Dia dia;
    private String hora;
    
    public Horario(Dia dia, String hora) {
        this.dia = dia;
        this.hora = hora;
    }

    public Dia getDia() {
        return dia;
    }
    public void setDia(Dia dia) {
        this.dia = dia;
    }
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
}
