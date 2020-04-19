class FiskusTerror {
    public static void main(String[] args) {
        /* https://podatki.gazetaprawna.pl/artykuly/1103641,interpretacje-w-sprawie-vat-na-zywnosc.html
        W omawianej sprawie producent bagietek próbował dowiedzieć się od fiskusa,
        czym na gruncie podatkowym jest oferowany przez niego produkt.

        Nie pomogła mu w tym opinia GUS, który podał mu trzy różne klasyfikacje.

        - Z pierwszej wynikało, że bagietka to danie gotowe, tj. mrożona pizza (5 proc. VAT).
        - Z drugiej, że to pieczywo (5 proc. VAT świeże, 23 proc., gdy termin przydatności powyżej 14 dni).
        - Trzecia klasyfikacja GUS stwierdzała, że ten sam produkt to jednak ciastko,
        bo zawiera w sobie więcej niż 5 proc. masła (8 proc. VAT świeże, 23 proc. z terminem powyżej 45 dni).*/

        Product product = new Product("Bagietka" ,"Mrożona z masłem czosnkowym", 1.00);
        VatParadox funWithVat = new VatParadox();

        //brak kategorii
        funWithVat.showProductInfo(product);
        // 5% VAT
        product.setCategory("mrożona pizza");
        funWithVat.showProductInfo(product);
        // 8% VAT
        product.setCategory("ciastko");
        funWithVat.showProductInfo(product);
        // 8% VAT
        product.setCategory("pieczywo");
        funWithVat.showProductInfo(product);
        // Zła kategoria
        product.setCategory("błąd");
        funWithVat.showProductInfo(product);
    }
}
