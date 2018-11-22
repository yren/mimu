package me.lokvin.kiwi.mimu.settings;

import com.reuters.appconfig.annotations.AppSettingsInfo;
import lisa.server.core.configuration.LisaDynamicSettings;

public class MimuDynamicSetting extends LisaDynamicSettings {
    /**
     * Constructor required by base class.
     *
     * @param info
     */
    public MimuDynamicSetting(AppSettingsInfo info) {
        super(info);
    }
}
