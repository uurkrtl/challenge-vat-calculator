package org.eagle;

public class Main {
    public static void main(String[] args) {

        VatCalculator vatCalculator = new VatCalculator(0.19,"€");
        String result = vatCalculator.renderInvoice(100);
        System.out.println(result);
    }
}