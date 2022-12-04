package com.demoqa.tests;

import com.demoqa.pages.WebTestPage;
import org.junit.jupiter.api.Test;


public class WebTestWithTestData extends TestBase{
    WebTestPage webTestPage = new WebTestPage();

    @Test
    void testRegistrationForm() {
        StepTest steps = new StepTest();

        steps.openMainPage();
        steps.fillInTheForm();
        steps.checkResultsTable();

    }
}
