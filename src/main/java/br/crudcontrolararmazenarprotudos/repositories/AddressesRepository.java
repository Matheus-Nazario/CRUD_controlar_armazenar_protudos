package br.crudcontrolararmazenarprotudos.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.crudcontrolararmazenarprotudos.entities.Addresses;

@Repository
public interface AddressesRepository extends CrudRepository<Addresses, String> {

}