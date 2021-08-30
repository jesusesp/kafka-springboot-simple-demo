package com.unosquare.demo.kafkaclient.service;

public interface IUnicornProducer {

    public void sendNewUnicorn(String message);

    public void sendRunUnicorn(String message);
}
