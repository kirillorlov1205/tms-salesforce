package service;

import page.HomePage;

public class HomePageService {

    private HomePage homePage;

    public boolean isSideMenuButtonDisplayed() {
        homePage = new HomePage();
        return homePage.isSideMenuButtonDisplayed();
    }

    public AccountServicePage openNewAccountPage() {
        homePage = new HomePage();
        homePage.openNewAccountPage();
        return new AccountServicePage();
    }

    public ContactPageService openNewContactPage() {
        homePage = new HomePage();
        homePage.openNewContactPage();
        return new ContactPageService();
    }
}
