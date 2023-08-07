package com.vmware.pages;

import com.vmware.component.InputBox;
import com.vmware.data.XPath;
import lombok.extern.slf4j.Slf4j;

/**
 * @author 冰点契约
 * @apiNote 这是一个简单的演示页面，演示组件如何使用
 */
@Slf4j
public class SimplePage {
    private final InputBox commitBox = new InputBox(XPath.commitBox);


    public void toCommit(String message) {
        commitBox.inputTextToBox(message);
    }
}
