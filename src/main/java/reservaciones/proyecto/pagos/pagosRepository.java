package reservaciones.proyecto.pagos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface pagosRepository extends JpaRepository <pagos, Long> {
    List<pagos> findAll();
}
