package com.tg.xml.jsoup;

import cn.wanghaomiao.xpath.exception.XpathSyntaxErrorException;
import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @Description: JsoupDemo1
 * @Author: tanggang
 * @Date: 2020/5/28
 * @Version: 1.0
 */
public class JsoupDemo1 {
    public static void main(String[] args) throws IOException, XpathSyntaxErrorException {
        // documentDemo();
        // elementDemo();
        // selectorDemo();
        XpathDemo();
    }

    private static void XpathDemo() throws IOException, XpathSyntaxErrorException {
        String path = JsoupDemo1.class.getClassLoader().getResource("a.xml").getPath();
        Document document = Jsoup.parse(new File(path), "UTF-8");
        JXDocument jxDocument = new JXDocument(document);
        List<JXNode> jxNodes = jxDocument.selN("//user");
        for (JXNode jxNode : jxNodes) {
            System.out.println(jxNode);
        }
        System.out.println("=============================");
        List<JXNode> jxNodes1 = jxDocument.selN("//user/name");
        for (JXNode jxNode : jxNodes1) {
            System.out.println(jxNode);
        }
        System.out.println("=============================");
        List<JXNode> jxNodes2 = jxDocument.selN("//user/name[@number]");
        for (JXNode jxNode : jxNodes2) {
            System.out.println(jxNode);
        }
        System.out.println("=============================");
        List<JXNode> jxNodes3 = jxDocument.selN("//user/name/[@number='GGG']");
        for (JXNode jxNode : jxNodes3) {
            System.out.println(jxNode);
        }
    }

    private static void selectorDemo() throws IOException {
        String path = JsoupDemo1.class.getClassLoader().getResource("a.xml").getPath();
        Document document = Jsoup.parse(new File(path), "UTF-8");
        Elements name = document.select("name");
        System.out.println(name);
        System.out.println("----------------------");
        Elements select = document.select("#zhangsanId");
        System.out.println(select);
        System.out.println("----------------------");
        Elements select1 = document.select("name[number='GGG'] > age");
        System.out.println(select1);
    }

    private static void elementDemo() throws IOException {
        String path = JsoupDemo1.class.getClassLoader().getResource("a.xml").getPath();
        Document document = Jsoup.parse(new File(path), "UTF-8");
        Elements elements = document.getElementsByTag("name");

        System.out.println(elements.size());
        System.out.println("-----------------");
        Element student = document.getElementsByTag("user").get(0);
        Elements name = student.getElementsByTag("name");
        System.out.println(name.size());
        System.out.println("-----------------");
        String text = name.text();
        String html = name.html();
        System.out.println(text);
        System.out.println(html);

    }

    private static void documentDemo() throws IOException {
        String path = JsoupDemo1.class.getClassLoader().getResource("a.xml").getPath();
        Document document = Jsoup.parse(new File(path), "UTF-8");
        Elements elements = document.getElementsByTag("name");
        System.out.println(elements.size());
        Element element = elements.get(0);
        String name = element.text();
        System.out.println(name);
        System.out.println("--------------");

        Elements id = document.getElementsByAttribute("id");
        System.out.println(id);
        System.out.println("--------------");
        Elements eav = document.getElementsByAttributeValue("number", "GGG");
        System.out.println(eav);

        System.out.println("--------------");
        Element zhangsanId = document.getElementById("zhangsanId");
        System.out.println(zhangsanId);
    }
}
