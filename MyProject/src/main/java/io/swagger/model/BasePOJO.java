package io.swagger.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BasePOJO {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;
}
