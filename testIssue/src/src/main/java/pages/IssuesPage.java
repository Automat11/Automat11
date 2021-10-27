package src.main.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IssuesPage extends IssueUtil {

	
	// lokatory
	public static final By BUTTON_NEW_ISSUES = By.xpath("//span[text()='New issue']");
	public static final By INPUT_ISSUE_TITLE = By.xpath("//input[@aria-label='Title']");
	public static final By INPUT_ISSUE_DESCRIPTION = By.xpath("//textarea[@id='issue_body']");
	
	public static final By BUTTON_SUBMIT_NEW_ISSUE = By.xpath("//div[@class='flex-items-center flex-justify-end mx-2 mb-2 px-0 d-none d-md-flex']"
			+ "//button[@type='submit' and contains(text(),'Submit new issue')]");
	public static final By INPUT_ISSUE_COMMENT = By.xpath("//textarea[@id='new_comment_field']");
	public static final By BUTTON_SUBMIT_ISSUE_COMMENT = By.xpath("//button[@type='submit' and contains(text(),'Comment')]");
	
	
	// konstruktor
	public IssuesPage(WebDriver driver) {
		super(driver);
	}
	
	// za³o¿enie nowej sprawy
	public void createNewIssue (String title, String description) {
		clickElement(BUTTON_NEW_ISSUES);
		sendText(INPUT_ISSUE_TITLE, title);
		sendText(INPUT_ISSUE_DESCRIPTION, description);
		clickElement(BUTTON_SUBMIT_NEW_ISSUE);		
	}

	// dodanie komentarza
	public void addNewComment (String comment) {
		sendText(INPUT_ISSUE_COMMENT, comment);
		clickElement(BUTTON_SUBMIT_ISSUE_COMMENT);
	}
}
