package reservaciones.proyecto.habitaciones;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class habitacionesService {
     @Autowired
    habitacionesRepository repository;
   
    public Habitaciones save(Habitaciones entity){
        return repository.save(entity);
    }

    public void deleteById(long id){
        repository.deleteById(id);
    }

    public Habitaciones findById(long id){
        return repository.findById(id).orElse(null);
    }

    public List<Habitaciones> findAll(){
        return repository.findAll();
    }


}
