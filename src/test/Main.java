package test;

/*
 * java8自由研究の他の人が発表したところの復習
 * ということで、その辺適当に自分でも書いてみた
 */
public class Main {

    public static void main(String[] args) {
        OptionalSample os = new OptionalSample();
        os.optional();

        System.out.println("-----");

        Java8JimiCode jjc = new Java8JimiCode();
        jjc.join();
        jjc.notKey();
        jjc.replaceMap();
        jjc.removeList();

        System.out.println("-----");

        StreamSample ss = new StreamSample();
        ss.filter();
    }
}
