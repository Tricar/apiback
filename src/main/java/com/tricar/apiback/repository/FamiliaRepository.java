package com.tricar.apiback.repository;

import com.tricar.apiback.model.Familia;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author D@joh
 */
@Repository
public interface FamiliaRepository extends JpaRepository<Familia, Serializable> {

    //Consulta personalizada para realizar la búsqueda por nombre de una familia
    @Query("select f from Familia f where f.familia = ?1")
    Familia findByNombre(String nombre);
}
