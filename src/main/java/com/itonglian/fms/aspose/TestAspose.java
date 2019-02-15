package com.itonglian.fms.aspose;

import com.aspose.words.Document;
import com.aspose.words.License;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileInputStream;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestAspose {
    public static void main(String[] args) throws Exception {

        ExecutorService executorService = Executors.newFixedThreadPool(50);
        int i=0;
        while(i<500){
            System.out.println("执行任务"+i);
            executorService.submit(new Task(UUID.randomUUID().toString()));
           /* boolean success = future.get();
            if(success){
                System.out.println("执行任务"+i+"完毕");
            }
           */
            i++;
        }
        executorService.shutdown();

    }

    public static class Task implements Callable<Boolean> {

        private String uuid;


        public Task(String uuid) {
            this.uuid = uuid;
        }

        @Override
        public Boolean call() {
            String dataDir = "/Users/gepeng/Downloads/";
            String filePath = dataDir+"Rendering.doc";
            String destPath = dataDir+"/wordFolder/"+UUID.randomUUID().toString()+"Rendering.doc";
            License lic = new License();
            try {
                lic.setLicense(new FileInputStream(new File("/Users/gepeng/Downloads/Aspose.Words.lic")));
            } catch (Exception e) {
                e.printStackTrace();
            }
            // Load the document from disk.
            Document doc;
            try {
                FileUtils.copyFile(new File(filePath),new File(destPath));
                doc = new Document(destPath);
               /* doc.setWarningCallback(new IWarningCallback() {
                    @Override
                    public void warning(WarningInfo warningInfo) {
                        System.out.println(warningInfo.getDescription());
                    }
                });*/
                // Save the document in PDF format.
                dataDir = dataDir +"/pdfFolder/"+ UUID.randomUUID().toString()+".pdf";
                doc.save(dataDir);
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
            System.out.println("执行任务"+uuid+"完毕");
            return true;
        }
    }
}
