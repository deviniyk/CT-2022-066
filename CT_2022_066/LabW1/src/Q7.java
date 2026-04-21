import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.util.Calendar.PM;

public class Q7 {
    public static void main(String[] args) {

        Date now = new Date();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss a ");
        System.out.println(simpleDateFormat.format(now));

        JFrame myWindow = new JFrame();
        myWindow.setSize(300,200);
        myWindow.setTitle(simpleDateFormat.format(now));
        myWindow.setVisible(true);

    }
}
