package lotto.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public static String getMoney() {
        OutputView.displayMoney();
        return Console.readLine().trim();
    }

    public static void getCount(int money) {
        int count = money / 1000;
        OutputView.displayCount(count);
    }

    public static String getWinningNumbers() {
        OutputView.displayWinningNumbers();
        return Console.readLine();
    }

    public static String getBonusNumber() {
        OutputView.displayBonusNumber();
        return Console.readLine();
    }
}
