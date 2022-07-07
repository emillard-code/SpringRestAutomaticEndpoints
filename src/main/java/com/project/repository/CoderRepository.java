package com.project.repository;

import com.project.model.Coder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

// The below annotations will enable endpoints without needing to create a controller class.
// GET, POST, DELETE, PUT requests with http://localhost:8080/coders/ will work.
@RepositoryRestResource(collectionResourceRel = "coders", path = "coders")
public interface CoderRepository extends JpaRepository<Coder, Integer> {

}