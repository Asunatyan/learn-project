package com.example.proxy;

public interface IUserController {
    String login(String telephone, String password);

    String register(String telephone, String password);
}
