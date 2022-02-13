package com.epam.automation.constants;

public enum Discipline {

    ASTR("Astronomy"),
    DARK("Dark Magic"),
    HIST("History of Magic"),
    POTI("Potions"),
    SPEL("Spells"),
    TRAN("Transfiguration");

    private final String realName;

    Discipline(String realName) {
        this.realName = realName;
    }

    public String getRealName() {
        return realName;
    }

}
