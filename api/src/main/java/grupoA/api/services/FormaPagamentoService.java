package grupoA.api.services;

import grupoA.api.dtos.FormaPagamentoDTO;
import grupoA.api.entities.FormaPagamento;
import grupoA.api.repositories.FormaPagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormaPagamentoService {
    @Autowired
    private FormaPagamentoRepository formaPagamentoRepository;

    public FormaPagamento save(FormaPagamentoDTO formaPagamentoDTO){
        FormaPagamento formaPagamento = new FormaPagamento();
        formaPagamento.setTipo_pagamento(formaPagamentoDTO.formaPagamento());
        return formaPagamentoRepository.save(formaPagamento);
    }

    public List<FormaPagamento> getFormaPagamento(){
        return formaPagamentoRepository.findAll();
    }

    public void delete(int id){
        formaPagamentoRepository.deleteById(id);
    }

    public boolean existsById(int id){
        return formaPagamentoRepository.existsById(id);
    }

    public FormaPagamento updateFormaPagamento(int id, FormaPagamentoDTO formaPagamentoDTO){
        if (formaPagamentoRepository.existsById(id)) {
            FormaPagamento formaPagamento = formaPagamentoRepository.getById(id);
            formaPagamento.setTipo_pagamento(formaPagamentoDTO.formaPagamento());
            return formaPagamentoRepository.save(formaPagamento);
        }
        return null;
    }

}
