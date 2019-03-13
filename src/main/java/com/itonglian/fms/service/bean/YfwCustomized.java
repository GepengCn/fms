package com.itonglian.fms.service.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class YfwCustomized extends Customized {

    private String FF07;

    private String FF03;

    private String FF04;

    private String FF17;

    private String FF18;

    private String FF32;

    private String FF30;

    private Integer FF25;

    private String FF11;

    private String FF35;

    private String FF16;

    private String FF12;

    private String FF02;

    private String FF14;

    private String FF15;

    private List<FF52> refDocList;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class FF52{

        private String FF12;

        private String FF32;

        private String FF31;

        private String FF30;

        private String FF02;

    }

}
