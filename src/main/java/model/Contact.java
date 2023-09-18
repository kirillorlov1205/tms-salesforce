package model;

public class Contact {

    private String lastName = "lastTestName";
    private String title = "testTitle";
    private String phone = "testPhone";

    public Contact() {
    }

    public Contact(String lastName, String title, String phone) {
        this.lastName = lastName;
        this.title = title;
        this.phone = phone;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
