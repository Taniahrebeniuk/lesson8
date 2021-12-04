public class ReplaceTask {
    public static void main(String[] args) {

        String Str = new String("Abracadabra");
        String a = new String("Abracadabra");
        System.out.print("After replacing all a with @  : ");
        System.out.println(Str.replace('a', '@'));
        replaceNum(a,Str);
    }

    public static void replaceNum(String a, String Str) {
        if (a.length() > 30) {
            a = Str.substring(0, 30);
        }
    }
}
