package com.vmware.component;

import com.vmware.base.Common;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;

/**
 * @apiNot 这是一个示例组件
 */
@Slf4j
public class InputBox extends Common {
    @Getter
    private final By by;

    public InputBox(By by) {
        this.by = by;
    }

    public void inputTextToBox(String text) {
        sendTextToInputBox(text, by);
    }
}
