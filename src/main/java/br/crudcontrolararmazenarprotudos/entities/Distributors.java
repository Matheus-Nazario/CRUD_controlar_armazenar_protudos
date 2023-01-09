package br.crudcontrolararmazenarprotudos.entities;

import javax.persistence.*;
/**
 * Os atributos é dados de uma distribuidora
 *
 * @author Matheus Nazário
 */
@Entity(name = "Distributors")
public class Distributors {
    /**
    * Sempre que escrevemos uma entidade utilizando JPA, 
    * precisamos definir qual a chave primária desta e geralmente, 
    * também colocamos uma estratégia para a geração das chaves.
    * Por padrão, quando utilizamos somente a anotação @GeneratedValue sem passar nenhum argumento, 
    * a JPA utiliza a estratégia automática (GenerationType.AUTO). Ou seja, 
    * a implementação da especificação escolherá uma estratégia para geração dos ids.
    */

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idDistributor;
    private String name;
    private String comments;
    // A anotação @ManyToOne indica que temos um relacionamento muitos-para-um entre Funcionario e Departamento .
    @ManyToOne
    private Addresses address;
    private Integer addressNumber;

    public Long getIdDistributor() { return idDistributor; }

    public void setIdDistributor(Long idDistributor) {
        this.idDistributor = idDistributor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Addresses getAddress() {
        return address;
    }

    public void setAddress(Addresses address) {
        this.address = address;
    }

    public Integer getAddressNumber() { return addressNumber; }

    public void setAddressNumber(Integer addressNumber) { this.addressNumber = addressNumber; }
}
