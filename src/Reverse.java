
public class Reverse {
    public static void main(String[] args) {
        Reverse reverse = new Reverse();
        String st = "Я учусь Java";
        reverse.reverseTask(st);

    }

    public void reverseTask(String st)  {
        char symbols[] = st.toCharArray();

        for(int x= symbols.length-1; x>=0; x--) {

            System.out.print(symbols [x]);
        }
    }
}

