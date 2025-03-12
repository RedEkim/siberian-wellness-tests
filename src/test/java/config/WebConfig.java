package config;

import org.aeonbits.owner.Config;
@Config.Sources({
        "classpath:${envWeb}.properties"
})
public interface WebConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://countrystage.siberianhealth.com/kz-ru")
    String getBaseUrl();

    @Key("baseUri")
    @DefaultValue("https://countrystage.siberianhealth.com/kz-ru")
    String getBaseUri();

    @Key("browserName")
    @DefaultValue("chrome")
    String getBrowserName();

    @Key("browserVersion")
    @DefaultValue("100")
    String getBrowserVersion();

    @Key("browserSize")
    @DefaultValue("1920x1080")
    String getBrowserSize();

    @Key("remoteUrl")
    String getRemoteUrl();
}
