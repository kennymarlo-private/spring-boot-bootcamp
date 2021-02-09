package com.bootcamp.springboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "mail")
public class MailConfig {
    private String hostName;
    private int port;
    private String from;

    public MailConfig () {}

    public MailConfig(String hostName, int port, String from) {
        this.hostName = hostName;
        this.port = port;
        this.from = from;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }
}
