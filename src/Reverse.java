

public class Reverse {
    public static void main(String[] args) {
        String st = "Я учусь Java";
        reverseTask(st);

    }

    public static void reverseTask(String st)  {
        char symbols[] = st.toCharArray();

        for(int x= symbols.length-1; x>=0; x--) {

            System.out.print(symbols [x]);
        }
    }
}

