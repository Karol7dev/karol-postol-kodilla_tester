package seasonchecker;

import io.cucumber.java8.En;

public class IsItSummerStep implements En {
    private String today;
    private String answer;

    public IsItSummerStep() {
        Given("today is last day of December", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.today = "last day of December";
        });

        When("I ask whether it's Summer", () -> {
            SeasonChecker seasonChecker = new SeasonChecker();
            this.answer = seasonChecker.checkIfSummer(this.today);
        });

        Then("I should be told {string}", (String string) -> {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java8.PendingException();
        });
    }
}