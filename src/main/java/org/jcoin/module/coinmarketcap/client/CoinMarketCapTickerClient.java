package org.jcoin.module.coinmarketcap.client;

import org.jcoin.module.base.model.BaseClient;
import org.jcoin.module.coinmarketcap.model.CoinMarketCapTickerEntity;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/ticker/")
public interface CoinMarketCapTickerClient extends BaseClient{

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    List<CoinMarketCapTickerEntity> getTickers(@QueryParam("start") Integer start,
                                               @QueryParam("limit") Integer limit,
                                               @QueryParam("convert") String convert);
}
