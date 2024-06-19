package reservaciones.proyecto.habitaciones;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface habitacionesRepository extends JpaRepository <Habitaciones, Long> {
    List<Habitaciones> findAll();
}
