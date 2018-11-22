package me.lokvin.kiwi.mimu.cache;

import lisa.server.core.cache.LisaDataCache;
import lisa.server.core.cache.LisaDataCacheFactory;
import lisa.server.core.context.IterationContext;
import lisa.server.exceptions.LisaConfigurationException;

import java.util.List;

public class MimuCacheFactory implements LisaDataCacheFactory {
    @Override
    public List<LisaDataCache> constructImpermanentCachesContainer(IterationContext context) throws LisaConfigurationException {
        return null;
    }

    @Override
    public List<LisaDataCache> constructPermanentCachesContainer(IterationContext context) throws LisaConfigurationException {
        return null;
    }
}
