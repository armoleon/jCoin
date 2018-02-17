package org.jcoin.module.base.service;

import io.beanmapper.config.BeanMapperBuilder;
import org.jcoin.module.base.model.BaseDto;
import org.jcoin.module.base.model.BaseEntity;

import java.util.List;

public abstract class BaseService {

    private BeanMapperBuilder beanMapperBuilder = new BeanMapperBuilder();

    protected <T extends BaseDto, S extends BaseEntity> List<T> mapList(List<S> sources, Class<T> t) {
        return beanMapperBuilder.build().map(sources, t);
    }

}
