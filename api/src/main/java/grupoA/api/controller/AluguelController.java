package grupoA.api.controller;

import grupoA.api.dtos.AluguelDTO;
import grupoA.api.entities.Aluguel;
import grupoA.api.services.AluguelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alugueis")
public class AluguelController {
    @Autowired
    private AluguelService aluguelService;

    @PostMapping
    public ResponseEntity<Aluguel> createAluguel(@RequestBody AluguelDTO aluguelDTO) {
        Aluguel aluguel = aluguelService.save(aluguelDTO);
        return ResponseEntity.ok(aluguel);
    }

    @GetMapping
    public ResponseEntity<List<Aluguel>> getAllAlugueis() {
        List<Aluguel> alugueis = aluguelService.getAllAlugueis();
        return ResponseEntity.ok(alugueis);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAluguel(@PathVariable int id) {
        if (!aluguelService.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        aluguelService.deleteAluguel(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Aluguel> updateAluguel(@PathVariable int id, @RequestBody AluguelDTO aluguelDTO) {
        Aluguel aluguelAtualizado = aluguelService.updateAluguel(id, aluguelDTO);
        if (aluguelAtualizado != null) {
            return ResponseEntity.ok(aluguelAtualizado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
