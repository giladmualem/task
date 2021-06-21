package com.jb.currencyExchange.info;

        import lombok.AllArgsConstructor;
        import lombok.Data;
        import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Information {

    private String fromCurrency;
    private String toCurrency;
    private double amount;
    private double result;


}