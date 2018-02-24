package org.jcoin.module.coinmarketcap.client;

import org.jcoin.module.base.client.BaseClientProxy;
import org.jcoin.module.base.model.BaseConfig;
import org.jcoin.module.coinmarketcap.model.CoinMarketCapTickerEntity;

import java.util.List;

public class CoinMarketCapGlobalClientProxy extends BaseClientProxy<CoinMarketCapGlobalClient> implements CoinMarketCapGlobalClient {

    private CoinMarketCapGlobalClient coinMarketCapGlobalClient;

    public <T extends BaseConfig> CoinMarketCapGlobalClientProxy(T config) {
        coinMarketCapGlobalClient = generateClient(CoinMarketCapGlobalClient.class, config);
    }

    @Override
    public List<CoinMarketCapTickerEntity> getGlobalData(String convert) {
        return coinMarketCapGlobalClient.getGlobalData(convert);
    }
}
