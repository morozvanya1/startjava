package CodingBat;

public class Warmup {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return !(aSmile ^ bSmile);
    }

    public int sumDouble(int a, int b) {
        return a == b ? (a + b) * 2 : (a + b);
    }

    public int diff21(int n) {
        return n > 21 ? (n - 21) * 2 : (21 - n);
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        return (hour > 20 || hour < 7) && talking;
    }

    public boolean makes10(int a, int b) {
        return (a == 10) || (b == 10) || (a + b == 10);
    }

    public boolean nearHundred(int n) {
        return !(Math.abs(n - 100) > 10) || !(Math.abs(n - 200) > 10);
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0) && (b < 0);
        }
        return (a < 0 && !(b < 0)) || (!(a < 0) && b < 0);
    }

    public String notString(String str) {
        return (str.length() > 2) && str.substring(0,3).equals("not") ? str : "not " + str;
    }

    public String missingChar(String str, int n) {
        if (str.length() >= n) {
            if (n == 0) {
                return str.substring(n+1);
            }
            return str.substring(0,n) + str.substring(n+1);
        }
        return str;
    }

}