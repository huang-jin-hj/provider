package com.yes.impl;

import com.hjhsf.HJHSFProvider;
import com.provider.hsfclient.Provider;
import org.springframework.stereotype.Component;

/**
 * Created by huangJin on 2023/5/19.
 */
@HJHSFProvider(serviceInterface = Provider.class)
@Component
public class ProviderImpl implements Provider {
    @Override
    public String test() {
        return "hello HSf";
    }
}
