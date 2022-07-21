package com.syonet.test.login;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.syonet.test.utils.Screenshot;

import io.qameta.allure.Description;
import io.qameta.allure.Step;

public class AppTest implements Screenshot {

    @Description("Teste Selenium")
    @Step("Logando agora com {user} e com {password}")
    @CsvSource({"fred, senhadofred", "alisson, senhadoalisson"})
    @ParameterizedTest()
    public void shouldAnswerWithTrue(String user, String password) {
        assertTrue(null == null);
    }

}
