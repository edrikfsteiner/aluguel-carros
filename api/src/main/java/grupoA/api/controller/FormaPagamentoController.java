package grupoA.api.controller;

import grupoA.api.dtos.FormaPagamentoDTO;
import grupoA.api.entities.FormaPagamento;
import grupoA.api.services.FormaPagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/formapagamento")
public class FormaPagamentoController {
    @Autowired
    private FormaPagamentoService formaPagamentoService;

    @PostMapping
    public ResponseEntity<FormaPagamento> createPagamento(@RequestBody FormaPagamentoDTO formaPagamentoDTO){
        FormaPagamento formaPagamento = formaPagamentoService.save(formaPagamentoDTO);
        return ResponseEntity.ok(formaPagamento);
    }

    @GetMapping
    public ResponseEntity<List<FormaPagamento>> getAllPagamento(){
        List<FormaPagamento> formaPagamentos = formaPagamentoService.getFormaPagamento();
        return ResponseEntity.ok(formaPagamentos);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<FormaPagamento> deletePagamento(@PathVariable int id){
        if (!formaPagamentoService.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        formaPagamentoService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<FormaPagamento> updatePagamento(@PathVariable int id, @RequestBody FormaPagamentoDTO formaPagamentoDTO){
        FormaPagamento formaPagamento = formaPagamentoService.updateFormaPagamento(id, formaPagamentoDTO);
        if (formaPagamento != null) {
            return ResponseEntity.ok(formaPagamento);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
