class VatParadox {

    void showProductInfo(Product product){
        if(product.getCategory() == null){
            System.out.println("\nProdukt nie jest przypisany do żadnej kategorii");
        }else {
            System.out.println("\nProdukt:\t\t" + product.getName() +
                    "\nOpis:\t\t\t" + product.getDescription() +
                    "\nCena netto:\t\t" + product.getPrice() + " PLN" +
                    "\nCena brutto:\t" + CalculatePriceWithVat(product) + " PLN" +
                    "\nKategoria:\t\t" + product.getCategory());
        }
    }

    private double CalculatePriceWithVat(Product product){
        return product.getPrice() + CalculateVat(product);
    }

    private double CalculateVat(Product product){
        return switch (product.getCategory()) {
            case "mrożona pizza"    -> 0.05;
            case "ciastko"          -> 0.08;
            case "pieczywo"         -> 0.23;
            default                 -> 0.00;
        };
    }
}
