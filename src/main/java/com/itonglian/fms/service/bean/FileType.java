package com.itonglian.fms.service.bean;

import org.apache.poi.ss.formula.functions.T;

public enum FileType {

    WJPBD(1),
    ZYXW(2),
    DWFW(3),
    DZFW(4),
    YFW(5),
    SWDJ(6)
    ;
    private int type;

    FileType(int type) {
        this.type = type;
    }


    public static FileType parse(int type) throws Exception {
        switch (type){
            case 1:
                return FileType.WJPBD;
            case 2:
                return FileType.ZYXW;
            case 3:
                return FileType.DWFW;
            case 4:
                return FileType.DZFW;
            case 5:
                return FileType.YFW;
            case 6:
                return FileType.SWDJ;
            default:
                throw new Exception("不识别的类型");
        }
    }

    public static Class<?> parseClass(int type) throws Exception {
        switch (type){
            case 1:
                return WjbpdParam.class;
            case 2:
                return ZyxwParam.class;
            case 3:
                return DwfwParam.class;
            case 4:
                return DzfwParam.class;
            case 5:
                return YfwParam.class;
            case 6:
                return SwdjParam.class;
            default:
                throw new Exception("不识别的类型");
        }
    }


    public static String parseClassName(String type) throws Exception {
        return parseClass(Integer.parseInt(type)).getName();
    }
}
