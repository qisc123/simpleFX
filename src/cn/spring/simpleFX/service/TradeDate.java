package cn.spring.simpleFX.service;

public class TradeDate {
    private String date;
    TradeDate(String date){
        this.date = date;
    }
    public static TradeDate valueof(String date){
        return new TradeDate(date);
    }
}

