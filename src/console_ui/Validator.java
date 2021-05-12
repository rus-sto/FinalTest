package console_ui;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    private static final Pattern NUMBER_PATTERN = Pattern.compile("\\d+");//регулярное выражение
    private static final Pattern LETTER_PATTERN = Pattern.compile("\\S+");
    private static final Pattern PHONE_PATTERN = Pattern.compile("^(\\+375|80)(29|25|44|33)(\\d{3})(\\d{2})(\\d{2})$");
    private static final Pattern EMAIL_PATTERN = Pattern.compile("([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$");
    private static final Pattern ROLE_PATTERN = Pattern.compile("(USER)|(CUSTOMER)|(ADMIN)|(PROVIDER)|(SUPER_ADMIN)");
    private static Matcher matcher;

    private Validator() {
    }

    public static boolean isNumber(String answer) {
        matcher = NUMBER_PATTERN.matcher(answer);
        return matcher.matches();

    }
    public static boolean isRole(String answer) {
        matcher = ROLE_PATTERN.matcher(answer);
        return matcher.matches();

    }
    public static boolean isLetter(String answer) {
        matcher = LETTER_PATTERN.matcher(answer);
        return matcher.matches();

    }

    public static boolean isPhone(String answer) {
        matcher = PHONE_PATTERN.matcher(answer);
        return matcher.matches();
    }
    public static boolean isEmail(String answer) {
        matcher = EMAIL_PATTERN.matcher(answer);
        return matcher.matches();
    }

        public static boolean isNotEmptyString(String answer) {
        return !answer.isEmpty();
    }


}
