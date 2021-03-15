package Wallet;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/cash_withdrawal.feature"}
//        features = {"F:\\kodilla-course\\kodilla-cucumber\\src\\test\\resources\\"}
)
public class WalletRunner {
}