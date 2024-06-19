package reservaciones.proyecto.reservas;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface reservasRepository extends JpaRepository <Reservas, Long>{
    List<Reservas> findAll();
}
