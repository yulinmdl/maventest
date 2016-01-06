package com.mdl.maven;

public enum SendScheduleEnum {
	//发货日程枚举
	MAINFIRST("10","主材第一次(开工第6天)"),
	MAINSECOND("20","主材第二次(开通第11天)"),
	PARTSFIRST("30","辅料第一次(开工前1天)"),
	PARTSSECOND("40","辅料第二次"),
	WOOD("50","木作"),
	MAINADD("60","主材补货"),
	PARTSADD("70","辅料补货"),
	WOODAdd("80","木作补货"),
	DIRECTSENDINGSPECIALORDER("100","直送特单"),
	SITEPROCUREMENT("110","工地自采"),
	RECTIONSPECIALORDER("120","直配特单");
	
	private String code;
    private String text;
    private SendScheduleEnum(String code, String text) {
        this.code = code;
        this.text = text;
    }
    public String getCode() {
        return code;
    }

    public String getText() {
        return text;
    }

    public static SendScheduleEnum get(String value) {
        for (SendScheduleEnum p : SendScheduleEnum.values()) {
            if (p.getCode().equals(value)){
                return p;
            }
        }
        throw new IllegalArgumentException("unknown value:" + value);
    }
    public static String getTextByCode(String value) {
      for (SendScheduleEnum p : SendScheduleEnum.values()) {
        if (p.getCode().equals(value)){
          return p.getText();
        }
      }
      throw new IllegalArgumentException("unknown value:" + value);
    }
}
