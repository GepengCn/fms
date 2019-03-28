package com.itonglian.fms.utils;

import lombok.extern.slf4j.Slf4j;
import org.krysalis.barcode4j.impl.code39.Code39Bean;
import org.krysalis.barcode4j.output.bitmap.BitmapCanvasProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.UUID;

@Component
@Slf4j
public class BarcodeUtils {

    @Value(value = "${template.barcode}")
    private String barcode;

    public String generate(String msg){
        String path = barcode+File.separator+UUID.randomUUID().toString()+".png";

        OutputStream outputStream = null;
        try {
            Code39Bean bean = new Code39Bean();

            String format = "image/png";

            final int dpi = 15000;

            outputStream = new FileOutputStream(new File(path));
            // 输出到流
            BitmapCanvasProvider canvas = new BitmapCanvasProvider(outputStream, format, dpi,
                    BufferedImage.TYPE_BYTE_BINARY, false, 0);
            // 生成条形码
            bean.generateBarcode(canvas, msg);
            // 结束绘制
            canvas.finish();
        }catch (IOException e){
            log.error("IOException",e);
        }finally {
            if(outputStream!=null){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    log.error("IOException",e);
                }
            }
        }

        return path;
    }

}
