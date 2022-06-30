import java.io.File;
import java.util.Scanner;

public class AltTabMain {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("test"));
        L1List list = new L1List();
        String app;
        int n = 0;
        while (sc.hasNext()) {
            app = sc.nextLine();
            if (app.contains("Run")) {
                Node runApp = new Node(app.substring(4));
                list.insert(runApp, 0);
                n++;
                System.out.println(runApp.value);
            } else if (app.contains("Delete")) {
                list.remove(0);
            } else if (app.contains("Alt")) {
                int locationRes = AltTabMain.count(app, "Tab") % n;
                Node resApp = list.get(locationRes);
                System.out.println(resApp.value);
                list.remove(locationRes);
                list.insert(resApp, 0);

            }
        }
    }

    public static int count(String str, String subStr) {
        return (str.length() - str.replace(subStr, "").length()) / subStr.length();
    }
}
