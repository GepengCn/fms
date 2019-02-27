package com.itonglian.fms.service.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FtpList {
    private FtpDetail formFtp;

    private FtpDetail docFtp;

    private FtpDetail attFtp;

    private FtpDetail coverFtp;

    private FtpDetail catalogFtp;

    private FtpDetail refFtp;
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class FtpDetail{
        private String filePath;

        private String fileName;

        private int fileSort;

        public FtpDetail(String filePath, String fileName) {
            this.filePath = filePath;
            this.fileName = fileName;
        }
    }

    public void sort(){
        coverFtp.setFileSort(0);
        catalogFtp.setFileSort(1);
        formFtp.setFileSort(2);
        docFtp.setFileSort(3);
        attFtp.setFileSort(4);
        refFtp.setFileSort(6);
    }
}
