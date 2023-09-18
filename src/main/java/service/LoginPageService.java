package service;

import model.User;
import page.LoginPage;

public class LoginPageService {

    private LoginPage loginPage;

    public HomePageService login(User user) {
        loginPage = new LoginPage();
        loginPage.openPage(loginPage.getLoginPageUrl())
                .fillInUserName(user.getUsername())
                .fillInPassword(user.getPassword())
                .clickLoginButton();
        return new HomePageService();
    }
}
