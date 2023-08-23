package com.vmware.component;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;

@Slf4j
public class Button {

    @Getter
    private final By by;

    public Button(By by) {
        this.by = by;
    }

    public boolean hasDisplay() {
        return false;
    }


    public void click() {

    }

    public boolean canBeClicked() {
        return false;
    }
}
