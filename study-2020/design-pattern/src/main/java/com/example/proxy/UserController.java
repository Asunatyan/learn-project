package com.example.proxy;


public class UserController implements IUserController {
    //...省略其他属性和方法...
    private MetricsCollector metricsCollector; // 依赖注入

    public String login(String telephone, String password) {
        return "111";
        //...返回UserVo数据...
    }

    public String register(String telephone, String password) {
        //...返回UserVo数据...
        return "2222";
    }
}
