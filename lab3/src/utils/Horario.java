package utils;

import utils.enums.*;

public class Horario {
    private Dia dia;
    private HoraAula horaAula;

    public Horario(Dia dia, HoraAula horaAula) {
        this.dia = dia;
        this.horaAula = horaAula;
    }

    public Dia getDia() {
        return dia;
    }

    public HoraAula getHoraAula() {
        return horaAula;
    }

    public boolean temSobreposicao(Horario outro) {
        if (this.dia != outro.getDia()) {
            return false;
        }
        return this.horaAula.temSobreposicao(outro.getHoraAula());
    }

    @Override
    public String toString() {
        return dia + " " + horaAula.toString();
    }
}