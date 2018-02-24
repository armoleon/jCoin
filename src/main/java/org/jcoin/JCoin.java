package org.jcoin;

import org.jcoin.module.coinmarketcap.service.CoinMarketCapService;

public class JCoin {

    private static JCoin instance;

    private CoinMarketCapService coinMarketCapService;

    private JCoin() {
        this.coinMarketCapService = new CoinMarketCapService();
    }

    public static synchronized JCoin getInstance() {
        if (instance == null) {
            instance = new JCoin();
        }
        return instance;
    }

    public CoinMarketCapService getCoinMarketCapService() {
        return coinMarketCapService;
    }
}
