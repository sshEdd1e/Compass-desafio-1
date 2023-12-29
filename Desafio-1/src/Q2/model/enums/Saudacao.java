package Q2.model.enums;

import java.util.HashMap;
import java.util.Map;

public enum Saudacao {
    Boa_madrugada(0),
    Bom_dia (1),
    Boa_tarde(2),
    boa_noite(3);

    private int value;
    private static Map map = new HashMap<>();

    Saudacao(int value) {
        this.value = value;
    }

    static {
        for (Saudacao pageType : Saudacao.values()) {
            map.put(pageType.value, pageType);
        }
    }

    public static Saudacao valueOf(int pageType) {
        return (Saudacao) map.get(pageType);
    }

    public int getValue() {
        return value;
    }
}
