package com.simplebank.currentaccountservice;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

public class CurrentServiceTests {
    @Test
    void dadaContaCorrenteAComSaldo_eOutraContaCorrenteBSaldo_quandoAtransferirValorB_entaoContasSaldosComputados() {
        var contaCorrenteA = new ContaCorrente(BigDecimal.valueOf(1200.0));
        var contaCorrenteB = new ContaCorrente(BigDecimal.valueOf(300.0));

        contaCorrenteA.transfere(contaCorrenteB, BigDecimal.valueOf(380.0));

        assertThat(contaCorrenteA.getSaldo()).isEqualTo(BigDecimal.valueOf(820.0));
        assertThat(contaCorrenteB.getSaldo()).isEqualTo(BigDecimal.valueOf(680.0));
    }
}
