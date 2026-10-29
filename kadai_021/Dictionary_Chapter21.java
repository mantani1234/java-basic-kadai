package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

	// 英単語の意味を調べるメソッド
	public void search(String[] words) {
		// 英単語と意味を保存する辞書
		HashMap<String, String> dictionary = new HashMap<>();

		// コンストラクタで辞書に単語を登録する

		dictionary.put("apple", "りんご");
		dictionary.put("peach", "桃");
		dictionary.put("banana", "バナナ");
		dictionary.put("lemon", "レモン");
		dictionary.put("pear", "梨");
		dictionary.put("kiwi", "キウィ");
		dictionary.put("strawberry", "いちご");
		dictionary.put("grape", "ぶどう");
		dictionary.put("muscat", "マスカット");
		dictionary.put("cherry", "さくらんぼ");

		for (String word : words) {
			if (dictionary.containsKey(word)) {
				System.out.println(word + "の意味は" + dictionary.get(word) + "です。");
			} else {
				System.out.println(word + "は辞書にありません。");
			}
		}

	}
}
