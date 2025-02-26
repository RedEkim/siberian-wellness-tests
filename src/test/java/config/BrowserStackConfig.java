package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${envMobile}.properties"
})
public interface BrowserStackConfig extends Config {

    @Key("browserStackUserName")
    String getBrowserStackUserName();

    @Key("browserStackAccessKey")
    String getBrowserStackAccessKey();

    @Key("browserStackUrl")
    String getBrowserStackUrl();

    @Key("browserStackDeviceName")
    String getBrowserStackDeviceName();

    @Key("browserStackPlatformVersion")
    String getBrowserStackPlatformVersion();

    @Key("browserStackApp")
    String getBrowserStackApp();
}
