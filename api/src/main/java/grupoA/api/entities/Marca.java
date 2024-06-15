package grupoA.api.entities;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "marca")
@Entity(name = "Marca")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id_marca")
public class Marca {
    @Id  @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id_marca;

    private String marca;

}
