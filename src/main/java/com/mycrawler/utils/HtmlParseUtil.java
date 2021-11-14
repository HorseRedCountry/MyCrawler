package com.mycrawler.utils;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.net.URL;

/**
 * <p>
 *  网页内容转换工具
 * </P>
 *
 * @author Major Tom
 * @since 2021/11/14 23:14
 */
public class HtmlParseUtil {
    public static void main(String[] args) throws Exception {
        //Step1 获取请求地址
        String url="https://search.jd.com/Search?keyword=java";
        // Step2 接收请求结果
        Document document=Jsoup.parse(new URL(url),30000);
        Element element=document.getElementById("J_goodsList");
        Elements elements=element.getElementsByTag("Li");
        //Step3 处理并输出
        for (Element el:elements){
            String title=el.getElementsByClass("p-name").eq(0).text();
            System.out.println(title);
        }
    }
}
