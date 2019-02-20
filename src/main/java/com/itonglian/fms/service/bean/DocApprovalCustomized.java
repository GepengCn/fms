package com.itonglian.fms.service.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DocApprovalCustomized extends Customized {

    private String FF03;

    private String FF04;

    private String FF53;

    private String FF12;

    private String FF32;

    private String FF31;

    private String FF36;

    private String FF30;

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
