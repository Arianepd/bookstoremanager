package com.zrtech.bookstoremanager.entities;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import java.time.LocalDateTime;

@Data
@Embeddable
public class Audit {

    @Column(name = "created_at")
    private LocalDateTime createdAT;

    @Column(name = "updated_at")
    private LocalDateTime updatedAT;

    @PrePersist
    public void prePersist(){
        this.createdAT = LocalDateTime.now();
    }

    @PostUpdate
    public void postUpdate(){
        this.updatedAT = LocalDateTime.now();



    }

}
