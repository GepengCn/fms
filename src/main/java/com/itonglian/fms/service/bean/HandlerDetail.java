package com.itonglian.fms.service.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HandlerDetail {

    private String lastHandlerUser;

    private String handlerUser;

    private String handlerStatus;

    private String handlerTime;

    private String handlerComment;

    private String sendTime;
}
