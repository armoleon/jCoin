package org.jcoin.module.coinmarketcap.model;

import org.jcoin.module.base.model.BaseDto;

public class CoinMarketCapTicker extends BaseDto {

    private String id;
    private String name;
    private String symbol;
    private String rank;
    private String priceInUSD;
    private String priceInBTC;
    private String highestVolumeInUSD;
    private String marketCapInUSD;
    private String availableSupply;
    private String totalSupply;
    private String maxSupply;
    private String percentChangeIn1Hour;
    private String percentChangeIn24Hour;
    private String percentChangeIn7Days;
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
