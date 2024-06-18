package grupoA.api.repositories;

import grupoA.api.entities.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeiculoRepository  extends JpaRepository<Veiculo, String> {
}
