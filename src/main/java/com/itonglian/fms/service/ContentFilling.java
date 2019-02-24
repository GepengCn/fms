package com.itonglian.fms.service;

import com.aspose.words.Document;
import com.aspose.words.Range;

import java.util.Map;

public interface ContentFilling {

    void execute(Document document, Range range, Map<String,String> contents) throws Exception;

}
