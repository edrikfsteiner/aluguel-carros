package grupoA.api.entities;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "forma_pagamento")
@Entity(name = "FormaPagamento")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "cd_forma_pagamento")
public class FormaPagamento {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cd_forma_pagamento;

    private String tipo_pagamento;
}
