package org.eagle;

public class VatCalculator {
    private double vat;
    private String currencySymbol;

    public VatCalculator(double vat, String currencySymbol) {
        this.vat = vat;
        this.currencySymbol = currencySymbol;
    }

    public String renderInvoice(double price){
        double vatAmount = price*vat;
        double total = price+vatAmount;
        return """
                Netto: %.2f%s
                VAT (%.2f): %.2f%s
                Total: %.2f%s
                """
                .formatted(price,currencySymbol,
                        vat, vatAmount,currencySymbol,
                        total,currencySymbol);
    }
}
