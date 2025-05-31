package org.example.classes.figuras;

import org.example.classes.FiguraVisitorIF;

public interface FiguraIF {
    void accept(FiguraVisitorIF visitor);
}
