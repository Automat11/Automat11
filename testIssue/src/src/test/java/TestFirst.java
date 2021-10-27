package src.test.java;

import org.testng.annotations.Test;

import src.main.java.pages.IssuesPage;
import src.main.java.pages.MainPage;
import src.main.java.pages.StartPageGitHub;

public class TestFirst extends TestBaseR {
	

	@Test	
	public void getTitleTest() throws InterruptedException {

		StartPageGitHub menu = new StartPageGitHub(this.driver);
		MainPage mpage = new MainPage(this.driver);
		IssuesPage ipage = new IssuesPage(this.driver);
		
		// logowanie
		menu.logIn("Automat11", "TestIssue1#");
		
		// wybranie projektu z g³ównego menu i przejœcie do zak³adki Issues
		mpage.pickProjectFromRepoAndGoIssue();	
		
		// za³o¿enie nowej sprawy
		ipage.createNewIssue("Nowy tytu³", "Bardzo d³ugi opis");
		
		
		
		Thread.sleep(10000);
		
	}
}
