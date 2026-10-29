
package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {

    // 自分のじゃんけんの手を入力する
    public String getMyChoice() {

        Scanner scanner = new Scanner(System.in);
        String myChoice;

        System.out.println("自分のじゃんけんの手を入力しましょう");
        System.out.println("グーはrockのrを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");

        while (true) {
            myChoice = scanner.nextLine();

            if (myChoice.equals("r")
                    || myChoice.equals("s")
                    || myChoice.equals("p")) {
                break;
            }

            System.out.println("r、s、pのいずれかを入力してください");
        }

        return myChoice;
    }

    // 対戦相手のじゃんけんの手を乱数で選ぶ
    public String getRandom() {

        String[] choices = {"r", "s", "p"};

        int random = (int) Math.floor(Math.random() * 3);

        return choices[random];
    }

    // じゃんけんを行う
    public void playGame(String myChoice, String enemyChoice) {

        HashMap<String, String> hands = new HashMap<>();

        hands.put("r", "グー");
        hands.put("s", "チョキ");
        hands.put("p", "パー");

        System.out.println(
                "自分の手は" + hands.get(myChoice)
                + ",対戦相手の手は" + hands.get(enemyChoice)
        );

        if (myChoice.equals(enemyChoice)) {
            System.out.println("あいこです");
        } else if (
                (myChoice.equals("r") && enemyChoice.equals("s"))
                || (myChoice.equals("s") && enemyChoice.equals("p"))
                || (myChoice.equals("p") && enemyChoice.equals("r"))
        ) {
            System.out.println("自分の勝ちです");
        } else {
            System.out.println("自分の負けです");
        }
    }
}
