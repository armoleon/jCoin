package org.jcoin.module.base.client;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import org.jcoin.module.base.model.BaseClient;
import org.jcoin.module.base.model.BaseConfig;

import javax.ws.rs.core.UriBuilder;

public class BaseClientProxy<T extends BaseClient> {

    private static ResteasyClient resteasyClient = new ResteasyClientBuilder().build();

    protected <B extends BaseConfig> T generateClient(Class<T> t, B config) {
        ResteasyWebTarget resteasyWebTarget = resteasyClient.target(UriBuilder.fromPath(config.getServiceUrl()));

        if(config.getBaseRequestHeaderFilter()!=null){
            resteasyWebTarget.register(config.getBaseRequestHeaderFilter());
        }
        if(config.getBaseResponseFilter()!=null){
            resteasyWebTarget.register(config.getBaseResponseFilter());
        }
        return resteasyWebTarget.proxy(t);
    }
}
