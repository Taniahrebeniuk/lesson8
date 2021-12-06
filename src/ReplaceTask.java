public class ReplaceTask {
    public static void main(String[] args) {
        ReplaceTask replaceTask = new ReplaceTask();
        String Str = new String("Abracadabra");
        String a = new String("Abracadabra");
        System.out.print("After replacing all a with @  : ");
        System.out.println(Str.replace('a', '@'));
        replaceTask.replaceNum(a,Str);
    }

    public void replaceNum(String a, String Str) {
        if (a.length() > 30) {
            a = Str.substring(0, 30);
        }
    }
}
