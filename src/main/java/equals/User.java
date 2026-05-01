package equals;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private int age;

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User other = (User) obj;
        return age == other.getAge() && (Objects.equals(name, other.name));
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
