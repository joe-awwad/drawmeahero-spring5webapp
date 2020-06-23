package leo.spring5webapp.drawmeahero.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Objects;

@Data
public class BaseEntity {

    @Id
    private String id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseEntity that = (BaseEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
