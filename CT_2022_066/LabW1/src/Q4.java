import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q4 {
    public static void main(String[] args) {

        Date today = new Date();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy");
        System.out.println(simpleDateFormat.format(today));

        JFrame myWindow = new JFrame();
        myWindow.setSize(500,200);
        myWindow.setVisible(true);
        myWindow.setTitle(simpleDateFormat.format(today));
    }
}
