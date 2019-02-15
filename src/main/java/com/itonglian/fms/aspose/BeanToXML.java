package com.itonglian.fms.aspose;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

import java.util.ArrayList;
import java.util.List;

public class BeanToXML {
    public static void main(String[] args) {

        FileDoc fileDoc = new FileDoc();

        fileDoc.setTaskId("13464");
        fileDoc.setTitle("七大领域重大风险如何化解?习近平提出要求");
        fileDoc.setDrafter("zs");
        fileDoc.setDraftTime(DateTime.now().toString(DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss")));
        fileDoc.setDocFtp(new Ftp("/doc/","test1.doc"));
        fileDoc.setTextFtp(new Ftp("/doc/","test2.doc"));
        List<Ftp> attList = new ArrayList<>();
        attList.add(new Ftp("/doc/","att1.doc"));
        attList.add(new Ftp("/doc/","att2.doc"));
        fileDoc.setAttFtp(attList);
        fileDoc.setCoverFtp(new Ftp("/doc/","test3.doc"));
        fileDoc.setCatalogFtp(new Ftp("/doc/","test4.doc"));
        fileDoc.setRefFtp(new Ftp("/doc/","test5.doc"));
        XStream xStream = new XStream(new StaxDriver());
        xStream.alias("fileDoc", FileDoc.class);
        xStream.alias("attFtp", Ftp.class);
        xStream.addImplicitCollection(FileDoc.class,"attFtp");
        fileDoc.setCustomized(new Customized("特级","加密"));
        System.out.println(xStream.toXML(fileDoc));

    }


    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class FileDoc{
        private String taskId;

        private String title;

        private String drafter;

        private String draftTime;

        private Ftp docFtp;
        private Ftp textFtp;
        private List<Ftp> attFtp;
        private Ftp coverFtp;
        private Ftp catalogFtp;
        private Ftp refFtp;

        private Customized customized;

    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Ftp{


        private String remotePath;

        private String fileName;

    }
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Customized{

        private String FF03;

        private String FF04;

    }
}
