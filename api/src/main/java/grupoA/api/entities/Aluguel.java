package grupoA.api.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "aluguel")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id_aluguel")
public class Aluguel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_aluguel;

    @ManyToOne
    @JoinColumn(name = "cd_cliente", referencedColumnName = "cd_cliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "placa", referencedColumnName = "placa")
    private Veiculo veiculo;

    @ManyToOne
    @JoinColumn(name = "id_pagamento")
    private Pagamento pagamento;

    @Column(name = "data_inicio")
    private LocalDateTime dataInicio;

    @Column(name = "data_fim")
    private LocalDateTime dataFim;

    private BigDecimal valor;
}
