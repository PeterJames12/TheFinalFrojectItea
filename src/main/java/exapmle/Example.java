package exapmle;

import config.EmailSender;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Igor Hnes on 6/24/17.
 */
public class Example {

    public static void main(String[] args) {
        final EmailSender emailSender = new EmailSender();
        List<String> list = new LinkedList<>();
        list.add("Igor");
        emailSender.send(list, "Igor");
    }
}
