package com.itonglian.fms.dbstep;

import java.io.*;

public class TestDBSTEP {


    public static void main(String[] args) throws IOException {
        File file = new File("/Users/gepeng/Downloads/ftpLocation/1`FE#ENC#0DE5B47DB2136CD6BC519231BA1A54E8");

        FileInputStream fis = new FileInputStream(file);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] b = new byte[1024];
        int n;
        while ((n = fis.read(b)) != -1)
        {
            bos.write(b, 0, n);
        }
        DBstep.iMsgServer2000 MsgObj= new DBstep.iMsgServer2000();
        MsgObj.MsgFileBody(b);
        b = MsgObj.ToDocument(MsgObj.MsgFileBody());
        MsgObj.MsgFileBody(b);
        if(MsgObj.MsgFileSave("/Users/gepeng/Downloads/decrypt.docx")){
            System.out.println("success");
        }
    }
}
