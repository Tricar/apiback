package com.tricar.apiback.repository;

import com.tricar.apiback.model.Anexo;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author D@joh
 */
@Repository
public interface AnexoRepository extends JpaRepository<Anexo, Serializable>{
    
}
