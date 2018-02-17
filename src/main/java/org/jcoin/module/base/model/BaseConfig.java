package org.jcoin.module.base.model;

public class BaseConfig {

    private String serviceUrl;
    private BaseRequestHeaderFilter baseRequestHeaderFilter;
    private BaseResponseFilter baseResponseFilter;

    public String getServiceUrl() {
        return serviceUrl;
    }

    public void setServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
    }

    public BaseRequestHeaderFilter getBaseRequestHeaderFilter() {
        return baseRequestHeaderFilter;
    }

    public void setBaseRequestHeaderFilter(BaseRequestHeaderFilter baseRequestHeaderFilter) {
        this.baseRequestHeaderFilter = baseRequestHeaderFilter;
    }

    public BaseResponseFilter getBaseResponseFilter() {
        return baseResponseFilter;
    }

    public void setBaseResponseFilter(BaseResponseFilter baseResponseFilter) {
        this.baseResponseFilter = baseResponseFilter;
    }
}
