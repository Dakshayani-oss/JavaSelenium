package TestNG;


	import java.awt.Robot;
	import java.awt.event.KeyEvent;

	import org.sikuli.script.FindFailed;
	import org.sikuli.script.Pattern;
	import org.sikuli.script.Screen;

	public class SikuliEx {

	    public static void main(String[] args) throws Throwable {
	        Screen scr = new Screen();

	        // Click on Mini Bar
	        Pattern miniBar = new Pattern("C:\\Users\\dakshayani\\OneDrive\\Pictures\\Screenshots\\Screenshot 2024-12-12 111102.png");
	        scr.click(miniBar);

	        // Type "Notepad" in the Search Bar
	        Pattern search = new Pattern("C:\\Users\\dakshayani\\OneDrive\\Pictures\\Screenshots\\Screenshot 2024-12-12 111102.png");
	        scr.type(search, "Notepad");

	        // Simulate pressing Enter
	        Robot rob = new Robot();
	        rob.keyPress(KeyEvent.VK_ENTER);
	        rob.keyRelease(KeyEvent.VK_ENTER);

	        // Type "Shobha" on the Page
	        Pattern page = new Pattern("C:\\Users\\dakshayani\\OneDrive\\Pictures\\Screenshots\\Screenshot 2024-12-12 111102.png");
	        scr.type(page, "Shobha");
	    }
	}

