package com.pog.count.Entity;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class Recibo {

    @Getter @Setter
    private BigDecimal media;
    @Getter @Setter
    private BigDecimal desvioPadrao;
    @Getter @Setter
    private BigDecimal mediana;
    @Getter @Setter
    private int qtdRecebidos;


    public Recibo(BigDecimal media, BigDecimal desvioPadrao, BigDecimal mediana, int qtdRecebidos) {
        this.media = media;
        this.desvioPadrao = desvioPadrao;
        this.mediana = mediana;
        this.qtdRecebidos = qtdRecebidos;
    }

}
