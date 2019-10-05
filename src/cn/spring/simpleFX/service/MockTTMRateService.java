package cn.spring.simpleFX.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MockTTMRateService implements ITTMRateService {
    @Override
    public List<TTMRate> getTTMRatesToday() {
        TradeDate tradeDate20190629 = TradeDate.valueof("20190629");
        TTMRate USD_CNY = new TTMRate(tradeDate20190629,"USD/CNY",new BigDecimal("6.865"));
        TTMRate EUR_USD = new TTMRate(tradeDate20190629,"EUR/USD",new BigDecimal("1.1368"));
        List<TTMRate> rateList = new ArrayList<>();
        rateList.add(USD_CNY);
        rateList.add(EUR_USD);

        return rateList;
    }
}
