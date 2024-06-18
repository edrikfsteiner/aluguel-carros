package grupoA.api.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "cliente")
@Entity(name = "Cliente")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "cd_cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cd_cliente;

    private String nm_cliente;
    private Long telefone;
    private String email;
    private Long cpf;

    @ManyToOne
    @JoinColumn(name = "id_endereco", referencedColumnName = "id_endereco")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Endereco endereco;
}
