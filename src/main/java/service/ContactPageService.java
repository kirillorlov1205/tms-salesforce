package service;

import model.Contact;
import page.ContactPage;

public class ContactPageService {

    private ContactPage contactPage;

    public ContactPageService createContact(Contact contact) {
        contactPage = new ContactPage();
        contactPage
                .fillContactLastName(contact.getLastName())
                .fillContactTitle(contact.getTitle())
                .fillContactPhone(contact.getPhone())
                .clickSaveButton();
        return this;
    }

    public boolean isCreatedContactNameDisplayed() {
        contactPage = new ContactPage();
        return contactPage.isCreatedContactNameDisplayed();
    }
}
