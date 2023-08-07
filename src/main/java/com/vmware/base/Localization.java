package com.vmware.base;

/**
 * @apiNote 本地化接口
 */
public interface Localization {
    void initializeLocalizationPage();

    default boolean isLocalizationPage() {
        return true;
    }
}
