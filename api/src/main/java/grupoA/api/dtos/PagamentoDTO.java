package grupoA.api.dtos;

import java.math.BigDecimal;

public record PagamentoDTO(int cd_forma_pagamento, BigDecimal valor) {
}
