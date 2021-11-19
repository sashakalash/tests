package test.java;


import classes.Education;
import classes.Person;
import classes.Sex;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.hamcrest.core.IsInstanceOf.instanceOf;

public class MainTest {
    final Person person = new Person("Steeve", "Jobs", 34, Sex.MAN, Education.ELEMENTARY);

    @Test
    public void InstanceTest() {
        assertTrue(person instanceof Person);

        assertThat(person, instanceOf(Person.class));
    }


    @Test
    public void GetNameTest() {
        String name = "Steeve";
        String surname = "Jobs";

        String expectedName = person.getName();
        String expectedSurName = person.getFamily();

        assertNotNull(expectedName);
        assertNotNull(expectedSurName);

        assertThat(name, equalTo(expectedName));
        assertThat(surname, equalTo(expectedSurName));

        assertAll("name",
                () -> assertEquals(name, expectedName),
                () -> assertEquals(surname, expectedSurName)
        );

    }

    @Test
    public void EnumTest() {
        Education education = Education.ELEMENTARY;

        assertTrue(education instanceof Education);

        assertThat(education, instanceOf(Education.class));

    }
}