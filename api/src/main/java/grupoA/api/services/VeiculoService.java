package grupoA.api.services;

import grupoA.api.dtos.VeiculoDTO;
import grupoA.api.entities.Cor;
import grupoA.api.entities.Modelo;
import grupoA.api.entities.Veiculo;
import grupoA.api.repositories.CorRepository;
import grupoA.api.repositories.ModeloRepository;
import grupoA.api.repositories.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculoService {
    @Autowired
    private VeiculoRepository veiculoRepository;

    @Autowired
    private CorRepository corRepository;

    @Autowired
    private ModeloRepository modeloRepository;

    public Veiculo save(VeiculoDTO veiculoDto) {
        Veiculo veiculo = new Veiculo();
        veiculo.setPlaca(veiculoDto.placa());
        veiculo.setAno(veiculoDto.ano());

        Cor cor = corRepository.findById(veiculoDto.id_cor())
                .orElseThrow(() -> new IllegalArgumentException("Cor não encontrada para o ID: " + veiculoDto.id_cor()));
        veiculo.setCor(cor);

        Modelo modelo = modeloRepository.findById(veiculoDto.id_modelo())
                .orElseThrow(() -> new IllegalArgumentException("Modelo não encontrado para o ID: " + veiculoDto.id_modelo()));
        veiculo.setModelo(modelo);

        return veiculoRepository.save(veiculo);
    }

    public List<Veiculo> findAll() {
        return veiculoRepository.findAll();
    }

    public Veiculo findByPlaca(String placa) {
        return veiculoRepository.findById(placa)
                .orElseThrow(() -> new IllegalArgumentException("Veículo não encontrado para a placa: " + placa));
    }

    public void deleteByPlaca(String placa) {
        if (veiculoRepository.existsById(placa)) {
            veiculoRepository.deleteById(placa);
        } else {
            throw new IllegalArgumentException("Veículo não encontrado para a placa: " + placa);
        }
    }

    public Veiculo updateVeiculo(String placa, VeiculoDTO veiculoDto) {
        Veiculo veiculo = veiculoRepository.findById(placa)
                .orElseThrow(() -> new IllegalArgumentException("Veículo não encontrado para a placa: " + placa));

        veiculo.setAno(veiculoDto.ano());

        Cor cor = corRepository.findById(veiculoDto.id_cor())
                .orElseThrow(() -> new IllegalArgumentException("Cor não encontrada para o ID: " + veiculoDto.id_cor()));
        veiculo.setCor(cor);

        Modelo modelo = modeloRepository.findById(veiculoDto.id_modelo())
                .orElseThrow(() -> new IllegalArgumentException("Modelo não encontrado para o ID: " + veiculoDto.id_modelo()));
        veiculo.setModelo(modelo);

        return veiculoRepository.save(veiculo);
    }
}
