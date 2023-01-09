package br.crudcontrolararmazenarprotudos.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.crudcontrolararmazenarprotudos.entities.Products;

@Repository
public interface ProductsRepository extends CrudRepository<Products, Long> {

}
