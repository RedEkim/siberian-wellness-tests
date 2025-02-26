package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${envMobile}.properties"
})
public interface MobileConfig extends Config {

    @Key("appiumServer")
    String getAppiumServer();

    @Key("deviceName")
    String getDeviceName();

    @Key("platformVersion")
    String getPlatformVersion();

    @Key("platformName")
    String getPlatformName();
}
