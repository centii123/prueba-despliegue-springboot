package reservaciones.proyecto.authz.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import reservaciones.proyecto.authz.entity.Role;




public interface RoleRepository extends CrudRepository <Role, Long> {

    List<Role> findAll();

    
    
}
