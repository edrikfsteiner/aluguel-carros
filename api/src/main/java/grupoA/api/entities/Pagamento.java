package grupoA.api.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "pagamento")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) // Ignora Hibernate proxies
@EqualsAndHashCode(of = "id_pagamento")
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_pagamento;

    @ManyToOne
    @JoinColumn(name = "cd_forma_pagamento", referencedColumnName = "cd_forma_pagamento")
    private FormaPagamento formaPagamento;

    private BigDecimal valor;
}
