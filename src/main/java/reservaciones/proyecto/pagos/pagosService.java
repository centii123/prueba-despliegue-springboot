package reservaciones.proyecto.pagos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class pagosService {
     @Autowired
    pagosRepository repository;
   
    public pagos save(pagos entity){
        return repository.save(entity);
    }

    public void deleteById(long id){
        repository.deleteById(id);
    }

    public pagos findById(long id){
        return repository.findById(id).orElse(null);
    }

    public List<pagos> findAll(){
        return repository.findAll();
    }


}
