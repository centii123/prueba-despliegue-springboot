package reservaciones.proyecto.habitaciones;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;
import lombok.Data;
import reservaciones.proyecto.reservas.Reservas;

@Data
@Entity
public class Habitaciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length=100)
    private String nombre; 

    @Column(length=50)
    private String tipoHabitacion; 

    private Integer nHabitaciones; 

    @Column(columnDefinition = "DECIMAL(10, 2)")
    private BigDecimal precio; 

    @Column(columnDefinition = "smallint")
    private Integer disponibilidad; 

    @JsonIgnoreProperties("habitacion")
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "habitacion")
    private List<Reservas> reservas;
}
