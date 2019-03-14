package com.itonglian.fms.utils;

import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Iterator;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class PoiUtilsTest {

    @Autowired
    PoiUtils poiUtils;
    @Test
    public void word2Html() {
        String src = "/Users/gepeng/Downloads/poi/springmvc_day1.doc";
        String dest = "/Users/gepeng/Downloads/poi/springmvc_day1.html";
        String pdf = "/Users/gepeng/Downloads/poi/springmvc_day1.pdf";
        String htmlString = poiUtils.word2Html(src);
        Document document = Jsoup.parse(htmlString);
        Elements elements = document.select("meta");
        Iterator<Element> iterator = elements.iterator();
       /* while(iterator.hasNext()){
            Element element = iterator.next();
        }
        log.info("content="+prettyHtml);
        poiUtils.saveHtml(prettyHtml,dest);*/
        poiUtils.html2Pdf(dest,pdf);
    }
}