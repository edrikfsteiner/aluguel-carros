package grupoA.api.controller;

import grupoA.api.dtos.MarcaDTO;
import grupoA.api.dtos.ModeloDTO;
import grupoA.api.entities.Marca;
import grupoA.api.entities.Modelo;
import grupoA.api.services.ModeloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/modelos")
public class ModeloController {

    @Autowired
    private ModeloService modeloService;

    @PostMapping
    public ResponseEntity<Modelo> createModelo(@RequestBody ModeloDTO modeloDTO) {
        Modelo novoModelo = modeloService.save(modeloDTO);
        return ResponseEntity.ok(novoModelo);
    }

    @GetMapping
    public ResponseEntity<List<Modelo>> getAllModelos() {
        List<Modelo> modelos = modeloService.findAll();
        return ResponseEntity.ok(modelos);
    }
    @DeleteMapping("/{id}")
    public  ResponseEntity<Void> deleteModelo(@PathVariable int id) {
        modeloService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Modelo> updateModelo(@PathVariable int id, @RequestBody ModeloDTO modeloDTO) {
        Modelo modeloAtualizado = modeloService.updateModelo(id, modeloDTO);
        if (modeloAtualizado != null) {
            return ResponseEntity.ok(modeloAtualizado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}