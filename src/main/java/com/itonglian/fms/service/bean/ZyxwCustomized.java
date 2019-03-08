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
public class ZyxwCustomized extends Customized  {

    private String FF03;

    private String FF04;

    private String FF12;

    private String FF32;

    private String FF31;

    private String FF36;

    private String FF30;

    private String FF02;

    private String FF14;

    private String FF15;

    private List<WjbpdCustomized.FF52> refDocList;
}
