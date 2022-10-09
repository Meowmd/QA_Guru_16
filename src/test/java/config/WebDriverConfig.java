package config;

import java.net.URL;
import org.aeonbits.owner.Config;

public interface WebDriverConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://google.com")
    String getBaseUrl();

    @Key("browser")
    @DefaultValue("CHROME")
    Browser getBrowser();

    @Key("browserVersion")
    @DefaultValue("100")
    String getBrowserVersion();

    @Key("remoteUrl")
    @DefaultValue("https://localhost:4444")
    URL getRemoteUrl();
}