package com.shinowit.tools;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeUtility;

public class HtmlMail {

    private String smtpServer;
    private String emailFrom;
    private String password;


    public void sendMessage(String to,
                            String subject, String messageText)
            throws MessagingException, java.io.UnsupportedEncodingException {

        // Step 1:  Configure the mail session
        java.util.Properties props = new java.util.Properties();
        props.setProperty("mail.smtp.auth", "true");//指定是否需要SMTP验证
        props.setProperty("mail.smtp.host", smtpServer);//指定SMTP服务器
        props.put("mail.transport.protocol", "smtp");
        Session mailSession = Session.getDefaultInstance(props);
        mailSession.setDebug(true);//是否在控制台显示debug信息

        // Step 2:  Construct the message
        InternetAddress fromAddress = new InternetAddress(emailFrom);
        InternetAddress toAddress = new InternetAddress(to);

        MimeMessage testMessage = new MimeMessage(mailSession);
        testMessage.setFrom(fromAddress);
        testMessage.addRecipient(javax.mail.Message.RecipientType.TO, toAddress);
        testMessage.setSentDate(new java.util.Date());
        testMessage.setSubject(MimeUtility.encodeText(subject, "utf-8", "B"));

        testMessage.setContent(messageText, "text/html;charset=utf-8");
        // Step 3:  Now send the message
        Transport transport = mailSession.getTransport("smtp");
        transport.connect(smtpServer, emailFrom, password);
        transport.sendMessage(testMessage, testMessage.getAllRecipients());
        transport.close();

    }

    public String getSmtpServer() {
        return smtpServer;
    }

    public void setSmtpServer(String smtpServer) {
        this.smtpServer = smtpServer;
    }

    public String getEmailFrom() {
        return emailFrom;
    }

    public void setEmailFrom(String emailFrom) {
        this.emailFrom = emailFrom;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}