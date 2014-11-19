package org.dd.note.common.entity.enums;

/**
 * 
 * <p/>
 * <p> @author 刘新宇
 *
 * <p> @date 2014年11月17日 下午5:54:50
 * <p> @version 0.0.1
 */

public enum AvailableEnum {
    TRUE(Boolean.TRUE, "可用"), FALSE(Boolean.FALSE, "不可用");

    private final Boolean value;
    private final String info;

    private AvailableEnum(Boolean value, String info) {
        this.value = value;
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public Boolean getValue() {
        return value;
    }
}
