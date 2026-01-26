package clone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeTest {
    @Test
    public void copyReferences() {
        Employee original = new Employee("Bob", 60000L);
        Employee copy = original;
        copy.raiseSalary(10);
        assertEquals(60010L, original.getSalary());
    }

    @Test
    public void cloneObject() {

        Employee original = new Employee("Bob", 60000L);
        Employee clone = (Employee) original.clone();
        clone.raiseSalary(10);
        assertEquals(60000L, original.getSalary());
        assertEquals(60010L, clone.getSalary());

    }

}