package grupoA.api.entities;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "cor")
@Entity(name = "Cor")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id_cor")
public class Cor {
    @Id  @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id_cor;

    private String cor;

}
