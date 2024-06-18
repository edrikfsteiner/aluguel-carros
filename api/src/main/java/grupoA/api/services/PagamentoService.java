package grupoA.api.services;

import grupoA.api.dtos.PagamentoDTO;
import grupoA.api.entities.FormaPagamento;
import grupoA.api.entities.Pagamento;
import grupoA.api.repositories.FormaPagamentoRepository;
import grupoA.api.repositories.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class PagamentoService {
    @Autowired
    private PagamentoRepository pagamentoRepository;

    @Autowired
    private FormaPagamentoRepository formaPagamentoRepository;

    public Pagamento save(PagamentoDTO pagamentoDTO) {
        Pagamento pagamento = new Pagamento();
        FormaPagamento formaPagamento = formaPagamentoRepository.getById(pagamentoDTO.cd_forma_pagamento());
        pagamento.setFormaPagamento(formaPagamento);
        pagamento.setValor(pagamentoDTO.valor());
        return pagamentoRepository.save(pagamento);
    }

    public List<Pagamento> getAllPagamentos() {
        return pagamentoRepository.findAll();
    }

    public void deletePagamento(int id) {
        pagamentoRepository.deleteById(id);
    }

    public boolean existsById(int id) {
        return pagamentoRepository.existsById(id);
    }

    public Pagamento updatePagamento(int id, PagamentoDTO pagamentoDTO) {
        if (pagamentoRepository.existsById(id)) {
            Pagamento pagamento = pagamentoRepository.getById(id);
            FormaPagamento formaPagamento = formaPagamentoRepository.getById(pagamentoDTO.cd_forma_pagamento());
            pagamento.setFormaPagamento(formaPagamento);
            pagamento.setValor(pagamentoDTO.valor());
            return pagamentoRepository.save(pagamento);
        }
        return null;
    }
}
