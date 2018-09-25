package guru.springframework.sfgpetclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {

    private Long id; //hibernate recommends the use of Box types

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
