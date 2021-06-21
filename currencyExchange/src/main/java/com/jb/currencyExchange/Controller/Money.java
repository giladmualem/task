package com.jb.currencyExchange.Controller;

import com.jb.currencyExchange.info.ConversionRates;
import com.jb.currencyExchange.info.Information;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("money")
@RequiredArgsConstructor
public class Money {
    private final RestTemplate restTemplate;
//    private final static String URL="https://api.exchangerate-api.com/v4/latest/";
//    private final static String URL="https://v6.exchangerate-api.com/v6/b37984ea63b4f7c62cf7e529/latest/";
//    https://v6.exchangerate-api.com/v6/b37984ea63b4f7c62cf7e529/pair/USD/ILS/100
//    private final static String URL="https://v6.exchangerate-api.com/v6/b37984ea63b4f7c62cf7e529/latest/USD";
//    private final static String URL="https://v6.exchangerate-api.com/v6/b37984ea63b4f7c62cf7e529/latest/USD";
    private final static String URL="https://v6.exchangerate-api.com/v6/b37984ea63b4f7c62cf7e529/pair/USD/ILS/100";
    @GetMapping("convert")
public ResponseEntity<?> getCurrentcyExchange(@RequestParam  String from, @RequestParam String  to,@RequestParam double amount){
        ConversionRates res=restTemplate.getForObject(URL, ConversionRates.class);
//        ConversionRates res=restTemplate.getForObject(URL+"/"+from, ConversionRates.class);
//        res doesnt no costract with val
//        i cant gat the currentcy from the obj to make the exchange

//        double exchange= Double.valueOf(amount)*3;
//        Information anser=new Information(from,to,amount,exchange);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

}



//    GET - http://localhost:8080/money/convert?from=USD&to=ILS&amount=100

//{
//    "fromCurrency": "USD",
//        "toCurrency": "ILS",
//        "amount": 100,
//        "result": 327
//}

//    https://app.exchangerate-api.com/sign-in

//    https://en.wikipedia.org/wiki/ISO_4217

//    https://jsoneditoronline.org/

//    https://www.jsonschema2pojo.org/
