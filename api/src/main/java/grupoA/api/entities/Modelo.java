package grupoA.api.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "modelo")
@Entity(name = "Modelo")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id_modelo")
public class Modelo {
    @Id  @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id_modelo;
    private String modelo;

    @ManyToOne
    @JoinColumn(referencedColumnName = "id_marca", name = "id_marca")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) // Ignore Hibernate proxies
    private Marca marca;

}
