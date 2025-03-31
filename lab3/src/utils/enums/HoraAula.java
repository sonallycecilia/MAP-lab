package utils.enums;

public enum HoraAula {
    _07_09("07:00-09:00"),
    _09_11("09:00-11:00"),
    _11_13("11:00-13:00"),
    _14_16("14:00-16:00"),
    _16_18("16:00-18:00");

    private final String hora;

    HoraAula(String s) {
        this.hora = s;
    }
}