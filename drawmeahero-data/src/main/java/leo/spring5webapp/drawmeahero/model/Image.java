package leo.spring5webapp.drawmeahero.model;

import lombok.*;
import org.bson.types.Binary;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Image extends BaseEntity {

    private String name;

    private String type;

    private Binary data;
}
