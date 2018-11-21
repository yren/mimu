package me.lokvin.kiwi.mimu.threads;

import lisa.server.core.cache.threads.LisaManagedThread;
import lisa.server.core.configuration.LisaThreadConfiguration;
import lisa.server.core.context.IterationContext;
import lisa.server.core.context.TransactionContext;
import lisa.server.exceptions.LisaConfigurationException;
import org.apache.commons.logging.Log;

public class RepeatJob implements LisaManagedThread {
    @Override
    public void initialize(IterationContext context, Log logger, LisaThreadConfiguration properties) throws LisaConfigurationException {

    }

    @Override
    public void updatedProperties(IterationContext context, Log logger, LisaThreadConfiguration properties) throws LisaConfigurationException {

    }

    @Override
    public void destroy(TransactionContext context, Log logger) {

    }

    @Override
    public boolean executeIteration(IterationContext iterationCtx, Log logger) {
        System.out.println("Repeat job, " + System.currentTimeMillis());
        return true;
    }
}
