package com.vmware.base;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

import java.util.Set;

@Slf4j
public abstract class Common {
    @Setter
    private static WebDriver driver;


    protected void clickEl(By by) {

    }

    protected void doubleClickEl(By by) {

    }


    protected void rightClickEl(By by) {

    }

    protected void launchBrowser(String url) {

    }


    protected void sendTextToInputBox(String text, By inputBox) {

    }

    protected void cleanText(By by) {

    }


    protected void closeBrowser() {

    }


    protected void enterIFrame(By iframe) {

    }


    protected void leaveIFrame() {

    }

    protected Set<Cookie> getLocalCookies() {
        return null;
    }

    protected void addCookieToLocal(Cookie cookie) {

    }

    protected void deleteCookie(Cookie cookie) {

    }


    protected void refreshBrowser() {

    }
}
