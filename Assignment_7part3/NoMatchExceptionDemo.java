package Assignment_7part3;

class NOMATCHEXCP extends Exception {
    private int lineNum;
    private String input;

    public NOMATCHEXCP(int lineNum, String input) {
        super("No Match Exception: Line " + lineNum + " - '" + input + "' does not match 'Mexico'");
        this.lineNum = lineNum;
        this.input = input;
    }

    public int getLineNum() {
        return lineNum;
    }

    public String getInput() {
        return input;
    }
}

public class NoMatchExceptionDemo {
    public static void main(String[] args) {
        try {
            checkString("Japan"); // Change this to test with different inputs
        } catch (NOMATCHEXCP e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkString(String input) throws NOMATCHEXCP {
        if (!"Mexico".equals(input)) {
            throw new NOMATCHEXCP(Thread.currentThread().getStackTrace()[1].getLineNumber(), input);
        } else {
            System.out.println(input + " matches 'Mexico'");
        }
    }
}