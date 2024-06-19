package reservaciones.proyecto.reservas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class reservasService {
     @Autowired
    reservasRepository repository;
    
    public Reservas save(Reservas entity){
        return repository.save(entity);
    }

    public void deleteById(long id){
        repository.deleteById(id);
    }

    public Reservas findById(long id){
        return repository.findById(id).orElse(null);
    }

    public List<Reservas> findAll(){
        return repository.findAll();
    }


}
