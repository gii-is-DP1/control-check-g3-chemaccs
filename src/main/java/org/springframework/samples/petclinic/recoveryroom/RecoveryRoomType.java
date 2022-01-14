package org.springframework.samples.petclinic.recoveryroom;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.samples.petclinic.model.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "recoveryroomstype")
public class RecoveryRoomType extends BaseEntity{
    
    @NotNull
    @Column(name= "name", unique = true)
    @Size(min = 5, max = 50)
    String name;
}
