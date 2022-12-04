package com.demoqa.tests;

import com.demoqa.pages.WebTestPage;
import io.qameta.allure.Step;

import static com.demoqa.tests.TestData.*;
import static com.demoqa.tests.TestData.city;

public class StepTest {

    WebTestPage webTestPage = new WebTestPage();

    @Step("Открываем страницу demoqa.com")
    public void openMainPage() {
        webTestPage.openPage();
    }

    @Step("Заполняем форму")
    public void fillInTheForm() {
        webTestPage.setFirstName(firstName)
                .setlastName(lastName)
                .setUserEmail(userEmail)
                .setGenterWrapper(genterWrapper)
                .setUserNumber(userNumber)
                .setBirthDate(birthDay, birthMonth, birthYear)
                .setSubjects(subjects)
                .setHobbies(hobbies)
                .setFile(filePath)
                .setAddress(address)
                .setStateCity(state, city)
                .clickSubmit();
    }

    @Step("Проверяем результат заполнения")
    public void checkResultsTable() {
        webTestPage.checkResultsTable()
                .checkResult("Student Name", firstName + " " + lastName)
                .checkResult("Student Email", userEmail)
                .checkResult("Gender", genterWrapper)
                .checkResult("Mobile", userNumber)
                .checkResult("Date of Birth", birthDay + " " + birthMonth + "," + birthYear)
                .checkResult("Subjects", subjects)
                .checkResult("Picture", fileName)
                .checkResult("Address", address)
                .checkResult("State and City", state + " " + city);
    }
}
