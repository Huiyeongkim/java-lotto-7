package lotto.view;

import lotto.domain.Lotto;
import lotto.domain.Rank;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Map;

public class OutputView {
    public static void displayMoney() {
        System.out.println("구입금액을 입력해 주세요.");
    }

    public static void displayCount(int count) {
        System.out.println();
        System.out.println(count+"개를 구매했습니다.");

    }

    public static void displayWinningNumbers() {
        System.out.println();
        System.out.println("당첨 번호를 입력해 주세요.");
    }

    public static void displayBonusNumber() {
        System.out.println();
        System.out.println("보너스 번호를 입력해 주세요.");
    }

    public static void displayIssuedLotto(List<Lotto> issuedLottos) {
        for (Lotto lotto : issuedLottos) {
            System.out.println(lotto.getNumbers());
        }
    }

    public static void displayResult(Map<String, Integer> result) {
        DecimalFormat format = new DecimalFormat("###,###");

        System.out.println();
        System.out.println("당첨 통계");
        System.out.println("---");

        for (Rank rank : Rank.values()) {
            String description = rank.getDescription();
            String moneyResult = format.format(rank.getWinningMoney());
            int countResult = result.get(description);
            System.out.println(description + " (" + moneyResult + "원) - " + countResult +"개");
        }
    }

    

}
