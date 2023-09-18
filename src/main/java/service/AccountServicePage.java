package service;

import model.Account;
import page.AccountPage;

public class AccountServicePage {

    private AccountPage accountPage;

    public AccountServicePage createAccount(Account account) {
        accountPage = new AccountPage();
        accountPage
                .fillAccountName(account.getName())
                .fillAccountWebsite(account.getWebsite())
                .fillAccountIndustry(account.getIndustry())
                .clickSaveButton();
        return this;
    }

    public boolean isCreatedAccountNameDisplayed() {
        accountPage = new AccountPage();
        return accountPage.isCreatedAccountNameDisplayed();
    }
}
