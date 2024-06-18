package grupoA.api.controller;

import grupoA.api.dtos.EnderecoDTO;
import grupoA.api.entities.Endereco;
import grupoA.api.services.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @GetMapping
    public ResponseEntity<List<EnderecoDTO>> findAll() {
        List<Endereco> enderecos = enderecoService.findAll();
        List<EnderecoDTO> enderecoDTOs = enderecos.stream()
                .map(this::convertToEnderecoDTO)
                .collect(Collectors.toList());
        return ResponseEntity.ok(enderecoDTOs);
    }

    @PostMapping
    public ResponseEntity<EnderecoDTO> createEndereco(@RequestBody EnderecoDTO enderecoDTO) {
        Endereco endereco = convertToEntity(enderecoDTO);
        endereco = enderecoService.save(endereco);
        enderecoDTO = convertToEnderecoDTO(endereco);
        return ResponseEntity.status(HttpStatus.CREATED).body(enderecoDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EnderecoDTO> updateEndereco(@PathVariable("id") int id, @RequestBody EnderecoDTO enderecoDTO) {
        Endereco endereco = convertToEntity(enderecoDTO);
        endereco.setId_endereco( id); // garantindo que o ID do endereco a ser atualizado seja o mesmo do path variable
        endereco = enderecoService.update(endereco);
        enderecoDTO = convertToEnderecoDTO(endereco);
        return ResponseEntity.ok(enderecoDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEndereco(@PathVariable("id") int id) {
        enderecoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    private EnderecoDTO convertToEnderecoDTO(Endereco endereco) {
        return new EnderecoDTO(endereco.getUf(), endereco.getCep(), endereco.getCidade(),
                endereco.getBairro(), endereco.getRua(), endereco.getNumero());
    }

    private Endereco convertToEntity(EnderecoDTO enderecoDTO) {
        return new Endereco(null, enderecoDTO.uf(), enderecoDTO.cep(), enderecoDTO.cidade(),
                enderecoDTO.bairro(), enderecoDTO.rua(), enderecoDTO.numero());
    }
}
