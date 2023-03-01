package com.solvd.carina.demo.gui.pages;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.carina.demo.gui.components.SearchResultElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultPage extends AbstractPage {

    @FindBy(xpath = "//*[@class='MjjYud']")
    private List<SearchResultElement> searchResultElements;

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public List<SearchResultElement> getSearchResultElements() {
        return searchResultElements;
    }
}
