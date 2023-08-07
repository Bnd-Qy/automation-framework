package com.vmware.base;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;

@Slf4j
public abstract class Common {
    @Setter
    private static WebDriver driver;


}
