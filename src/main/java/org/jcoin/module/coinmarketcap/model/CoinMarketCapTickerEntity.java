package org.jcoin.module.coinmarketcap.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.jcoin.module.base.model.BaseEntity;

public class CoinMarketCapTickerEntity extends BaseEntity{

    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("symbol")
    private String symbol;

    @JsonProperty("rank")
    private String rank;

    @JsonProperty("price_usd")
    private String priceInUSD;

    @JsonProperty("price_btc")
    private String priceInBTC;

    @JsonProperty("h_volume_usd")
    private String highestVolumeInUSD;

    @JsonProperty("market_cap_usd")
    private String marketCapInUSD;

    @JsonProperty("available_supply")
    private String availableSupply;

    @JsonProperty("total_supply")
    private String totalSupply;

    @JsonProperty("max_supply")
    private String maxSupply;

    @JsonProperty("percent_change_1h")
    private String percentChangeIn1Hour;

    @JsonProperty("percent_change_24h")
    private String percentChangeIn24Hour;

    @JsonProperty("percent_change_7d")
    private String percentChangeIn7Days;

    @JsonProperty("last_updated")
    private String lastUpdated;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getPriceInUSD() {
        return priceInUSD;
    }

    public void setPriceInUSD(String priceInUSD) {
        this.priceInUSD = priceInUSD;
    }

    public String getPriceInBTC() {
        return priceInBTC;
    }

    public void setPriceInBTC(String priceInBTC) {
        this.priceInBTC = priceInBTC;
    }

    public String getHighestVolumeInUSD() {
        return highestVolumeInUSD;
    }

    public void setHighestVolumeInUSD(String highestVolumeInUSD) {
        this.highestVolumeInUSD = highestVolumeInUSD;
    }

    public String getMarketCapInUSD() {
        return marketCapInUSD;
    }

    public void setMarketCapInUSD(String marketCapInUSD) {
        this.marketCapInUSD = marketCapInUSD;
    }

    public String getAvailableSupply() {
        return availableSupply;
    }

    public void setAvailableSupply(String availableSupply) {
        this.availableSupply = availableSupply;
    }

    public String getTotalSupply() {
        return totalSupply;
    }

    public void setTotalSupply(String totalSupply) {
        this.totalSupply = totalSupply;
    }

    public String getMaxSupply() {
        return maxSupply;
    }

    public void setMaxSupply(String maxSupply) {
        this.maxSupply = maxSupply;
    }

    public String getPercentChangeIn1Hour() {
        return percentChangeIn1Hour;
    }

    public void setPercentChangeIn1Hour(String percentChangeIn1Hour) {
        this.percentChangeIn1Hour = percentChangeIn1Hour;
    }

    public String getPercentChangeIn24Hour() {
        return percentChangeIn24Hour;
    }

    public void setPercentChangeIn24Hour(String percentChangeIn24Hour) {
        this.percentChangeIn24Hour = percentChangeIn24Hour;
    }

    public String getPercentChangeIn7Days() {
        return percentChangeIn7Days;
    }

    public void setPercentChangeIn7Days(String percentChangeIn7Days) {
        this.percentChangeIn7Days = percentChangeIn7Days;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
