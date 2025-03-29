package utils.enums;

public enum HoraAula {
    _07_09,
    _09_11, 
    _11_13,
    _14_16,
    _16_18;

    public String getHorario() {
        switch(this) {
            case _07_09: return "07:00-09:00";
            case _09_11: return "09:00-11:00";
            case _11_13: return "11:00-13:00";
            case _14_16: return "14:00-16:00";
            case _16_18: return "16:00-18:00";
            default: return "";
        }
    }

    public boolean temSobreposicao(HoraAula outro) {
        // Pega os índices dos enums para comparar
        return this.ordinal() == outro.ordinal();
    }

    @Override
    public String toString() {
        return getHorario();
    }
}