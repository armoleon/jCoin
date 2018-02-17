package org.jcoin.module.coinmarketcap.service;

import org.jcoin.module.base.service.BaseService;
import org.jcoin.module.coinmarketcap.client.CoinMarketCapGlobalClient;
import org.jcoin.module.coinmarketcap.client.CoinMarketCapGlobalClientProxy;
import org.jcoin.module.coinmarketcap.client.CoinMarketCapTickerClient;
import org.jcoin.module.coinmarketcap.client.CoinMarketCapTickerClientProxy;
import org.jcoin.module.coinmarketcap.model.config.CoinMarketCapConfig;

public class CoinMarketCapService extends BaseService{

    private CoinMarketCapTickerClient coinMarketCapTickerClient;
    private CoinMarketCapGlobalClient coinMarketCapGlobalClient;

    public CoinMarketCapService() {
        CoinMarketCapConfig coinMarketCapConfig = new CoinMarketCapConfig();
        coinMarketCapTickerClient = new CoinMarketCapTickerClientProxy(coinMarketCapConfig);
        coinMarketCapGlobalClient = new CoinMarketCapGlobalClientProxy(coinMarketCapConfig);
    }



}
