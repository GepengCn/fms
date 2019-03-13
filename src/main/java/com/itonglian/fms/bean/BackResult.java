package com.itonglian.fms.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class BackResult extends Result {

    private List<DataBean> dataList;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class DataBean{

        private String id;

        private int gdzt;

        private String gdsj;

    }
}
