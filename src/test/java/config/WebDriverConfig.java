package config;

import org.aeonbits.owner.Config;

import java.net.URL;

@Config.Sources("classpath:${host}.properties")
public interface WebDriverConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://www.google.com/")
    String getBaseUrl();

    @Key("browser")
    @DefaultValue("CHROME")
    String getBrowser();

    @Key("browserVersion")
    @DefaultValue("100.0")
    String getBrowserVersion();

    @Key("browserSize")
    @DefaultValue("1920x1080")
    String getBrowserSize();

    @Key("remoteUrl")
    URL getRemoteUrl();

    @Key("remoteWebDriver")
    String getRemoteWebDriver();

}