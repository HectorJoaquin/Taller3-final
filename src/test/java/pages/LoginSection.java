package pages;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class LoginSection {

    public TextBox emailTextBox = new TextBox(By.xpath("//input[@id='element-0']"),"[Email] textbox in Login section");
    public TextBox passwordTextBox = new TextBox(By.xpath("//input[@id='element-2']"),"[Password] textbox in Login section");
    public Button loginButton = new Button(By.xpath("//button[@type='submit']"),"[Login] button in Login section");


}
