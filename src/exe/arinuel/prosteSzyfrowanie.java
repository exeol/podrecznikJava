package exe.arinuel;

public class prosteSzyfrowanie {

    public static void main(String arg[]) {
        String msg = "To jest test";
        String encmsg = "";
        String decmsg = "";
        int key = 88;

        System.out.println("Oryginalna wiadomość to: " + msg);

        for(int i=0; i<msg.length(); i++)
        encmsg = encmsg + (char) (msg.charAt(i) ^ key);

        System.out.println(("Zaszyfrowana wiadomość to: ") + encmsg);

        for(int i =0; i < encmsg.length(); i ++)
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key);

        System.out.println("Odszyfrowana wiadomość to: " + decmsg
        );


    }
}
