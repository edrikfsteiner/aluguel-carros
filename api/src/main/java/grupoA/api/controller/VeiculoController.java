package grupoA.api.controller;

import grupoA.api.dtos.VeiculoDTO;
import grupoA.api.entities.Veiculo;
import grupoA.api.services.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/veiculos")
public class VeiculoController {

    @Autowired
    private VeiculoService veiculoService;

    @PostMapping
    public ResponseEntity<Veiculo> createVeiculo(@RequestBody VeiculoDTO veiculoDto) {
        Veiculo novoVeiculo = veiculoService.save(veiculoDto);
        return ResponseEntity.ok(novoVeiculo);
    }

    @GetMapping
    public ResponseEntity<List<Veiculo>> getAllVeiculos() {
        List<Veiculo> veiculos = veiculoService.findAll();
        return ResponseEntity.ok(veiculos);
    }

    @GetMapping("/{placa}")
    public ResponseEntity<Veiculo> getVeiculoByPlaca(@PathVariable String placa) {
        Veiculo veiculo = veiculoService.findByPlaca(placa);
        return ResponseEntity.ok(veiculo);
    }

    @DeleteMapping("/{placa}")
    public ResponseEntity<Void> deleteVeiculo(@PathVariable String placa) {
        veiculoService.deleteByPlaca(placa);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{placa}")
    public ResponseEntity<Veiculo> updateVeiculo(@PathVariable String placa, @RequestBody VeiculoDTO veiculoDto) {
        Veiculo veiculoAtualizado = veiculoService.updateVeiculo(placa, veiculoDto);
        if (veiculoAtualizado != null) {
            return ResponseEntity.ok(veiculoAtualizado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
