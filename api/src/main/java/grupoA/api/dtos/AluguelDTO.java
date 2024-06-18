package grupoA.api.dtos;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record AluguelDTO(int cd_cliente, String placa, int id_pagamento, LocalDateTime data_inicio, LocalDateTime data_fim, BigDecimal valor) {
}
