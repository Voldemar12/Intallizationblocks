package statilisashionblock;
import java.util.Date;
public class example {
    private static String stringField;
    private static Date dateField;
    static int field = 30;

    private static final String A_STRING_CONSTANT;

    static {
        field = 50;
        stringField = getEmptyString();
        dateField = new Date();
        //A_STRING_CONSTANT = "unknown";
    }

    static {
        field = 100;
        stringField = "Hello";
        dateField = new Date();
        A_STRING_CONSTANT = "known";
    }

    private static String getEmptyString() {
        return "empty";
    }

}
