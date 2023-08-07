package com.vmware.base;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

/**
 * @author BD.QY
 */

@Slf4j
public abstract class TestBase {

    @BeforeAll
    public static void beforeClass() {
        //TODO 编写测试所有用例执行前的前置方法
        Common.setDriver(WebDriverFactory.getWebDriver());

    }

    public abstract void setTestCaseInfo(String... params);

    @AfterAll
    public static void afterClass() {
        //TODO 编写测试所有用例执行完成的后置方法
    }
}
