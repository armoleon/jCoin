package org.jcoin.module.coinmarketcap.client;

import org.jcoin.module.base.client.BaseClientProxy;
import org.jcoin.module.base.model.BaseConfig;
import org.jcoin.module.coinmarketcap.model.CoinMarketCapTickerEntity;

import java.util.List;

public class CoinMarketCapTickerClientProxy extends BaseClientProxy<CoinMarketCapTickerClient> implements CoinMarketCapTickerClient {

    private CoinMarketCapTickerClient coinMarketCapTickerClient;

    public <T extends BaseConfig> CoinMarketCapTickerClientProxy(T config) {
        coinMarketCapTickerClient = generateClient(CoinMarketCapTickerClient.class, config);
    }

    @Override
    public List<CoinMarketCapTickerEntity> getTickers(Integer start, Integer limit, String convert) {
        return coinMarketCapTickerClient.getTickers(start, limit, convert);
    }
}
