package org.eagle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VatCalculatorTest {
    @Test
    void testRenderInvoice(){
        VatCalculator vatCalculator = new VatCalculator(0.19,"€");
        double price = 100;
        String expected = """
                Netto: 100,00€
                VAT (0,19): 19,00€
                Total: 119,00€
                """;
        String actual = vatCalculator.renderInvoice(price);
        Assertions.assertEquals(expected, actual);
    }
}
