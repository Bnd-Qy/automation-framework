package com.vmware.testcase;

import com.vmware.base.TestBase;
import com.vmware.pages.SimplePage;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Slf4j
public class TestCase extends TestBase {
    private final SimplePage simplePage = new SimplePage();

    @Disabled
    @BeforeEach
    public void beforeMethod() {

    }

    @Test
    public void run() {
        simplePage.toCommit("hello automation test framework!");
    }

    @Disabled
    @AfterEach
    public void afterMethod() {

    }
}
