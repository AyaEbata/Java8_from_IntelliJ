package test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by aya on 2015/12/24.
 */
public class StreamSample {

    // filter使いまくってみるわ
    public void filter() {
        List<String> strList = Arrays.asList("Java", "C", "javascript", "Groovy", "Objective-C");
        strList.stream()
                .filter(strIn -> strIn.contains("v"))      // "v"を含む
                .filter(strSize -> strSize.length() >= 5)  // 5文字以上
                .filter(strEq -> !strEq.equals("Groovy"))  // "Groovy"以外
                .forEach(System.out::println);
        // javascript
        // Objective-C
    }

}
