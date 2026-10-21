package kadai_021;

public class DictionaryExec_Chapter21 {

    public static void main(String[] args) {

        // 辞書クラスのインスタンスを作成
        Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();

        // 意味を調べる英単語
        String[] words = {"apple", "banana", "grape", "orange"};

        // 繰り返し処理で英単語を調べる
        for (String word : words) {
            dictionary.search(word);
        }
    }
}