package org.springframework.samples.petclinic.owner;

import java.util.List;

public interface IOwnerService {
    List<Owner> findAllOrderByAddressAsc();
    //List<Owner> findAllOrderByNameDesc();
}
