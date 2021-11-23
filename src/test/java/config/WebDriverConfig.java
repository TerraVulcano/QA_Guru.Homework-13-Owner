package config;

import org.aeonbits.owner.Config;

import static org.aeonbits.owner.Config.LoadType.MERGE;

@Config.LoadPolicy(MERGE)
@Config.Sources({"system:properties",
        "classpath:webdriver.properties",
        "classpath:local.properties"})
public interface WebDriverConfig extends Config {
    @DefaultValue("false")
    @Key("webdriver.remote")
    boolean isRemote();

    @DefaultValue("https://user1:1234@selenoid.autotests.cloud/wd/hub/")
    @Key("webdriver.remote.url")
    String getRemoteURL();

    @DefaultValue("CHROME")
    @Key("webdriver.browser")
    String getBrowser();

    @DefaultValue("89.0")
    @Key("webdriver.browser.version")
    String webdriverBrowserVersion();
}
