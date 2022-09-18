package org.play.postprocessor.propertyeditor;

import java.beans.PropertyEditorSupport;

/**
 * 自定义的属性编辑器
 * 通过将 字符串类型 转换为 AA 类型，帮助 BB 类完成注入
 */
public class AATransEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        AA aa = new AA();
        aa.setDefinition(text);
        setValue(aa);
    }
}
