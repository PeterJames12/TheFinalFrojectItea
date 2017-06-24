package config;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.List;

/**
 * @author Igor Hnes on 6/24/17.
 */
public class EmailSender {


    public void send(List<String> list, String subject) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("joyukr@ukr.net");
        message.setFrom("summerjava570@gmail.com");

        message.setText(list.toString());
        message.setSubject(subject);
        EmailConfig emailConfig = new EmailConfig();
        JavaMailSenderImpl javaMailSender = emailConfig.mailSender();
        javaMailSender.send(message);
    }
}
