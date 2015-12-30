package test;

import java.util.*;

/**
 * Created by aya on 2015/12/23.
 */
public class Java8JimiCode {

    // Java8で簡単に文字列つなげてやんよ
    public void join() {
        List<String> strArray = Arrays.asList("ラーメン", "アイス", "麻婆豆腐");
        String strJoin = String.join("＆", strArray);
        System.out.println(strJoin);
    }

    // Mapのkeyが存在しなかったらおせーて（いいよ）
    public void notKey() {
        Map<String, String> map = new HashMap<>();
        map.put("ラーメン", "二郎");
        map.put("アイス", "ハーゲンダッツ");
        map.put("麻婆豆腐", "中華");

        System.out.println(map.getOrDefault("ラーメン", "ないよ"));  // 二郎
        System.out.println(map.getOrDefault("いくら", "ないよ"));    // ないよ
    }

    // putと見せかけてリプレーーーーイス！
    public void replaceMap() {
        Map<String, String> map = new HashMap<>();
        map.put("ラーメン", "二郎");
        map.put("アイス", "ハーゲンダッツ");
        map.put("麻婆豆腐", "中華");

        map.put("ラーメン", "こじろう");
        map.replace("アイス", "ガリガリ君");
        map.replace("なんか", "てきとう");  // これはしかとされる

        map.forEach((key, val) -> System.out.println("key: " + key + ", val: " + val));
        // key: 麻婆豆腐, val: 中華
        // key: アイス, val: ガリガリ君
        // key: ラーメン, val: こじろう
    }

    // Listのいらんやつ削除したるぜ(^ω^)
    public void removeList() {
        // これだとエラー
        // List<String> strArray = Arrays.asList("ラーメン", "アイス", "麻婆豆腐");
        // これなら平気（Arrays.asList()使うと固定長のListになっちゃうかららしい）
        List<String> strArray = new ArrayList<>(Arrays.asList("ラーメン", "アイス", "麻婆豆腐"));
        strArray.removeIf(s -> s.contains("ア"));
        System.out.println(strArray);  // [ラーメン, 麻婆豆腐]
    }
}
