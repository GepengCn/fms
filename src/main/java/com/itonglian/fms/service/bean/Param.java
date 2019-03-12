package com.itonglian.fms.service.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Param {
    private String taskId;

    private String title;

    private String drafter;

    private String drafterName;

    private String draftTime;

    private List<FtpFile> ftpList;

    private Customized customized;

    private List<HandlerDetail> handlerDetailList;

    private int court;

    private int type;

}
