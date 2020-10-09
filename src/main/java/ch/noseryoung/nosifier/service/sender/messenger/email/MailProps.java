package ch.noseryoung.nosifier.service.sender.messenger.email;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("mail")
public class MailProps {
    private String user;

    private String displayedName;

    private String password;

    private String smtp;

    private String imap;

    private int port;

    private int portIMAP;

    private boolean debug;

    private boolean starttls;

    private boolean auth;

    private String url;

    public String getUser() {
        return user;
    }

    public MailProps setUser(String user) {
        this.user = user;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public MailProps setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getSmtp() {
        return smtp;
    }

    public MailProps setSmtp(String smtp) {
        this.smtp = smtp;
        return this;
    }

    public String getImap() {
        return imap;
    }

    public MailProps setImap(String imap) {
        this.imap = imap;
        return this;
    }

    public int getPort() {
        return port;
    }

    public MailProps setPort(int port) {
        this.port = port;
        return this;
    }

    public int getPortIMAP() {
        return portIMAP;
    }

    public MailProps setPortIMAP(int portIMAP) {
        this.portIMAP = portIMAP;
        return this;
    }

    public boolean isDebug() {
        return debug;
    }

    public MailProps setDebug(boolean debug) {
        this.debug = debug;
        return this;
    }

    public boolean isStarttls() {
        return starttls;
    }

    public MailProps setStarttls(boolean starttls) {
        this.starttls = starttls;
        return this;
    }

    public boolean isAuth() {
        return auth;
    }

    public MailProps setAuth(boolean auth) {
        this.auth = auth;
        return this;
    }

    public String getDisplayedName() {
        return displayedName;
    }

    public MailProps setDisplayedName(String displayedName) {
        this.displayedName = displayedName;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public MailProps setUrl(String url) {
        this.url = url;
        return this;
    }
}
