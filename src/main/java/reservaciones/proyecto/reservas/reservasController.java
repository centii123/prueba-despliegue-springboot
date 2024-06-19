package reservaciones.proyecto.reservas;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("reservas")
@Tag(name = "reservas")
@CrossOrigin({"*"})
public class reservasController {
    @Autowired
    reservasService service;

    @Operation(summary = "Obtiene un producto por su id, Requiere producto-getOne")
    @GetMapping("/{id}/")
    public Reservas findById(@PathVariable long id){
       return service.findById(id);
    }

    @Operation(summary = "Obtiene todas los productos, Requiere productos-getAll")
    @GetMapping("/")
    public List<Reservas> findAll(){
        return service.findAll();
    }

    //Create
    @Operation(summary = "Agrega un producto, Requiere productos-save")
    @PostMapping("/")
    public Reservas save (@RequestBody Reservas entity){
       return service.save(entity);
    }

    @Operation(summary = "Actualizar campo completo de un producto, el id va en el body , Requiere productos-update")
    @PutMapping("/")
    public Reservas update (@RequestBody Reservas entity){
        return service.save(entity);
    }

    @Operation(summary = "Elimina un producto, el id va en la url, Requiere productos-delete")
    @DeleteMapping("/{id}/")
    public void deeteById(@PathVariable long id){
        service.deleteById(id);
    }

}
