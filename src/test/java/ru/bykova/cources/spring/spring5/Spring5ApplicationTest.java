package ru.bykova.cources.spring.spring5;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import lombok.experimental.FieldDefaults;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static lombok.AccessLevel.PRIVATE;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.*;

//@ContextConfiguration(classes = JavaConfig.class)
//@WithMockUser(authorities="ADMIN")
//@AutoConfigureMockMvc
@SpringBootTest
@ExtendWith(SpringExtension.class)
@FieldDefaults(level = PRIVATE, makeFinal = true)
@AllArgsConstructor(onConstructor = @__(@Autowired))
class Spring5ApplicationTest { //for ru.vlapin.courses.spring.springfundamwntals5.SpringFundamentals5Application

    Person person;

    @Test
    @SneakyThrows
    @DisplayName("Person injects correctly")
    void testName() {
        // given
        assertThat(person.getName(), is("Уася"));
        // when
        System.out.println(person);
        // then
    }
}