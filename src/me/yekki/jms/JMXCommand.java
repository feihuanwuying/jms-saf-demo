package me.yekki.jms;


import me.yekki.JMSClientException;

public interface JMXCommand extends Runnable, Constants {

    public void connect(boolean isEdit, boolean isDomainRuntime) throws JMSClientException;
    public void disconnect() throws JMSClientException;
}
