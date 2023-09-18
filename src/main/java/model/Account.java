package model;

public class Account {

    private String name = "testName";
    private String website = "testWebsite";
    private String industry = "Apparel";

    public Account() {
    }

    public Account(String name, String website, String industry) {
        this.name = name;
        this.website = website;
        this.industry = industry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }
}
