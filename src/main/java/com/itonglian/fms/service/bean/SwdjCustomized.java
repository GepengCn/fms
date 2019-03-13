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
public class SwdjCustomized extends Customized {

    private String SF13;

    private String SF12;

    private String SF18;

    private String SF04;

    private String SF26;

    private String SF07;

    private String SF32;

    private String SF33;

    private String SF02;

    private String SF15;

    private String SF16;

    private List<SF56> refDocList;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class SF56{

        private String SF13;

        private String SF32;

        private String SF26;

        private String SF33;

        private String SF02;

    }


}
