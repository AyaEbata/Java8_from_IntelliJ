package test;

import java.util.Optional;

/**
 * Created by aya on 2015/12/23.
 */
public class OptionalSample {

    public String getNotNull() {
        return "nullじゃないよ";
    }

    public String getNull() {
        return "null";
    }

    public void optional() {

        // これ使ってOptional学ぶわ
        Optional<String> notNullOptional = Optional.ofNullable(getNotNull());
        Optional<String> nullOptional = Optional.ofNullable(getNull());

        // nullかどうかおせーて
        Boolean result1 = notNullOptional.isPresent();
        Boolean result2 = nullOptional.isPresent();
        System.out.println(result1);  // true
        System.out.println(result2);  // false

        // nullだったらなんか代わりのもん出力して
        String text1 = notNullOptional.orElse("nullだよ");
        String text2 = nullOptional.orElse("nullだよ");
        System.out.println(text1);  // nullじゃないよ
        System.out.println(text2);  // nullだよ

        // nullじゃなかったらなんか処理して（でも、nullだったらなんもしなくていいよ）
        notNullOptional.ifPresent(System.out::println); // nullじゃないよ
        nullOptional.ifPresent(System.out::println);    // （何も出力されない）
    }
}
