package org.jcoin;

import org.jcoin.config.JCoinConfig;
import org.jcoin.module.coinmarketcap.service.CoinMarketCapService;

public class JCoin {

    private static JCoin instance;

    private CoinMarketCapService coinMarketCapService;

    private JCoin(JCoinConfig jCoinConfig) {
        this.coinMarketCapService = new CoinMarketCapService();
    }

    public static synchronized JCoin getInstance(JCoinConfig jCoinConfig) {
        if (instance == null) {
            instance = new JCoin(jCoinConfig);
        }
        return instance;
    }
}
