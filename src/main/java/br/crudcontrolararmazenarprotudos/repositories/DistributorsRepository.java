package br.crudcontrolararmazenarprotudos.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.crudcontrolararmazenarprotudos.entities.Distributors;

@Repository
public interface DistributorsRepository extends CrudRepository<Distributors, Long> {

}
