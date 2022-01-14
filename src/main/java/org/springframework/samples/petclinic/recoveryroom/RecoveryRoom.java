package org.springframework.samples.petclinic.recoveryroom;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.samples.petclinic.model.BaseEntity;
import org.springframework.samples.petclinic.model.NamedEntity;
import org.springframework.samples.petclinic.pet.Visit;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="recoveryrooms")
public class RecoveryRoom extends NamedEntity{

    @NotNull
    @Min(value=0)
    double size;

    @NotNull
    boolean secure;

    @NotNull
    @ManyToOne    
    @JoinColumn(name = "recovery_rooms_type_id")
    RecoveryRoomType roomType;
}
