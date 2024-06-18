package grupoA.api.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Table(name = "veiculos")
@Entity(name = "Veiculo")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "placa")
public class Veiculo {
    @Id
    @Column(length = 7)
    private String placa;

    private Date ano;

    @ManyToOne
    @JoinColumn(name = "id_cor")
    private Cor cor;

    @ManyToOne
    @JoinColumn(name = "id_modelo")
    private Modelo modelo;
}
