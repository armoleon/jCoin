package org.jcoin.module.coinmarketcap.model.config;

import org.jcoin.module.base.model.BaseConfig;

public class CoinMarketCapConfig extends BaseConfig {
    private String serviceUrl = "https://api.coinmarketcap.com/v1/";

    public CoinMarketCapConfig() {
        setServiceUrl(serviceUrl);
    }
}
