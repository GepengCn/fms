package com.itonglian.fms.service.bean;

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
}
