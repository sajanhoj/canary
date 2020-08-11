package steps

import pages.canaryLogin
import static cucumber.api.groovy.EN.*

canaryLogin canLogin = new canaryLogin()

Given(~/^user login in the UI$/) { ->
    //DO NOTHING
    System.out.println("go to login screen")
}

When(~/^user entered the valid password "([^"]*)" "([^"]*)"$/) { String id, String pass ->
    canLogin.canaryLogin1(id, pass)
    System.out.println("user entered the valid credentials")
}

Then(~/^User is able to login$/) { ->
    //DO NOTHING
    System.out.println("user is able to login")
}

Then(~/^User append a comment$/) { ->
    canLogin.appendComment()
    System.out.println("user is able to append a comment")
}


