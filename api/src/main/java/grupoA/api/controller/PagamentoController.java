package grupoA.api.controller;

import grupoA.api.dtos.PagamentoDTO;
import grupoA.api.entities.Pagamento;
import grupoA.api.services.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pagamentos")
public class PagamentoController {
    @Autowired
    private PagamentoService pagamentoService;

    @PostMapping
    public ResponseEntity<Pagamento> createPagamento(@RequestBody PagamentoDTO pagamentoDTO){
        Pagamento pagamento = pagamentoService.save(pagamentoDTO);
        return ResponseEntity.ok(pagamento);
    }

    @GetMapping
    public ResponseEntity<List<Pagamento>> getAllPagamentos(){
        List<Pagamento> pagamentos = pagamentoService.getAllPagamentos();
        return ResponseEntity.ok(pagamentos);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePagamento(@PathVariable int id){
        if (!pagamentoService.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        pagamentoService.deletePagamento(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pagamento> updatePagamento(@PathVariable int id, @RequestBody PagamentoDTO pagamentoDTO){
        Pagamento pagamento = pagamentoService.updatePagamento(id, pagamentoDTO);
        if (pagamento != null) {
            return ResponseEntity.ok(pagamento);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
