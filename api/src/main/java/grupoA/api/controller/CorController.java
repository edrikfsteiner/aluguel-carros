package grupoA.api.controller;

import grupoA.api.dtos.CorDto;
import grupoA.api.entities.Cor;
import grupoA.api.services.CorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cores")
public class CorController {
    @Autowired
    private CorService corService;

    @PostMapping
    public ResponseEntity<Cor> addCor(@RequestBody CorDto corDto) {
        Cor cor = corService.save(corDto);
        return ResponseEntity.ok(cor);
    }

    @GetMapping
    public ResponseEntity<List<Cor>> findAll() {
        List<Cor> cor = corService.getAllCores();
        return ResponseEntity.ok().body(cor);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCor(@PathVariable int id){
        if (!corService.existsById(id)){
            return ResponseEntity.notFound().build();
        }
        corService.deleteCor(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cor> updateCor(@PathVariable int id, @RequestBody CorDto corDto){
        Cor corAtualizada = corService.updateCor(id, corDto);
        if (corAtualizada != null){
            return ResponseEntity.ok(corAtualizada);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
