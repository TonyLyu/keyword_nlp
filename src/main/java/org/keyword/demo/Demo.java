package org.keyword.demo;

import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.tokenizer.NLPTokenizer;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        System.out.println(NLPTokenizer.segment("我新造一个词叫幻想乡你能识别并标注正确词性吗？"));
        System.out.println(NLPTokenizer.analyze("我的希望是希望张晚霞的背影被晚霞映红").translateLabels());
        String content = "我的希望是希望张晚霞的背影被晚霞映红";
        List<String> keywordList = HanLP.extractKeyword(content, 5);
        System.out.println(keywordList);
    }
}
