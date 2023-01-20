package com.algalog.algaapi.domain.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class Customer {
    
    private Long id;
    private String cname;
    private String email;
    private String cellphoneNumber;

}
