package grupoA.api.controllers;

import grupoA.api.dtos.MarcaDTO;
import grupoA.api.entities.Marca;
import grupoA.api.services.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/marcas")
public class MarcaController {

    @Autowired
    private MarcaService marcaService;

    @PostMapping
    public ResponseEntity<Marca> createMarca(@RequestBody MarcaDTO marcaDTO) {
        Marca marca = marcaService.save(marcaDTO);
        return ResponseEntity.ok(marca);
    }

    @GetMapping
    public ResponseEntity<List<Marca>> getMarcas() {
        List<Marca> marcas = marcaService.getAllMarcas();
        return ResponseEntity.ok(marcas);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMarca(@PathVariable int id) {
        if (!marcaService.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        marcaService.deleteMarca(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Marca> updateMarca(@PathVariable int id, @RequestBody MarcaDTO marcaDTO) {
        Marca marcaAtualizada = marcaService.updateMarca(id, marcaDTO);
        if (marcaAtualizada != null) {
            return ResponseEntity.ok(marcaAtualizada);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
