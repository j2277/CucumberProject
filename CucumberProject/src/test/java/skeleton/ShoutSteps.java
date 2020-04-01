package skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.*;

public class ShoutSteps {
	Person sean=new Person();
	
	@Given("Sean and Lucia are {int} metres away")
	public void sean_and_Lucia_are_metres_away(Integer distance) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		sean.setDistance(distance);
	}

	@When("Sean shouts {string} to Lucia")
	public void sean_shouts_to_Lucia(String message) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		sean.setMessage(message);
	}

	@Then("Lucia listen to the message")
	public void lucia_listen_to_the_message() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		String message=sean.getMessage();
		Assert.assertEquals("free coffee", message);
	}
	@Then("Lucia doesnot listen to the message")
	public void lucia_doesnot_listen_to_the_message() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		String message=sean.getMessage();
		Assert.assertNull(message);
	}
	@Given("Sarah has {int} cucumbers in her bag")
	public void sarah_has_cucumbers_in_her_bag(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

}
