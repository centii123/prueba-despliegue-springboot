package reservaciones.proyecto.reservas;

import java.util.Date;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;
import lombok.Data;
import reservaciones.proyecto.authz.entity.User;
import reservaciones.proyecto.habitaciones.Habitaciones;
import reservaciones.proyecto.pagos.pagos;

@Data
@Entity
public class Reservas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(iso = ISO.DATE_TIME)
    private Date fechaEntrada;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(iso = ISO.DATE_TIME)
    private Date fechaSalida;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonIgnoreProperties("reservas")
    private User user;
    
    @ManyToOne
    @JoinColumn(name = "habitacion_id")
    @JsonIgnoreProperties("reservas")
    private Habitaciones habitacion;
    
    @JsonIgnoreProperties("reserva")
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "reserva")
    private List<pagos> pagos;
    
}
