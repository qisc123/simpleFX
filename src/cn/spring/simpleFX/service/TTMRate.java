package cn.spring.simpleFX.service;

import java.io.Serializable;
import java.math.BigDecimal;

public class TTMRate implements Serializable {
    private static  final long serialVersionUID = 2641189625594925925L;

    private TradeDate frontDate;
    private String currencyPair;
    private BigDecimal value;


    public TTMRate(TradeDate frontDate, String currencyPair, BigDecimal value){
        this.frontDate = frontDate;
        this.currencyPair = currencyPair;
        this.value = value;
    }
    public TradeDate getFrontDate(){
        return frontDate;
    }
    public void  setFrontDate(TradeDate frontDate){
        this.frontDate = frontDate;
    }
    public String getCurrencyPair(){
        return currencyPair;
    }
    public void setCurrencyPair(String currencyPair){
        this.currencyPair = currencyPair;
    }
    public BigDecimal getValue() {
        return value;
    }
    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
