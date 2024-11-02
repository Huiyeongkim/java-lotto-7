package lotto.validator;

import java.util.ArrayList;
import java.util.List;

public class NumberValidator {

    public static void validateNoDuplicateNumbers(List<Integer> numbers) {
        List<Integer> allNumbers = new ArrayList<>(numbers.size());
        for (Integer number : numbers) {
            if (allNumbers.contains(number)) {
                throw new IllegalArgumentException("[ERROR] 로또 번호는 중복되지 않아야 한다.");
            }
            allNumbers.add(number);
        }
    }

    public static void validateNumberRange(List<Integer> numbers) {
        for (Integer number : numbers) {
            if (number <1 || number > 45) {
                throw new IllegalArgumentException("[ERROR] 로또 번호는 1부터 45 사이의 숫자여야 합니다.");
            }
        }
    }

    public static void validateWinningNumbersAreNumeric(String[] parsedWinningNumbers ) {
        for (String s : parsedWinningNumbers) {
            if (!s.matches("\\d+")) {
                throw new IllegalArgumentException("[ERROR] 로또 번호는 숫자여야 합니다.");
            }
        }
    }
}
