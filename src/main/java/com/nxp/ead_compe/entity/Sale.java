package com.nxp.ead_compe.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sINo;

    private Long salesmanId;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "prodID")
    @JsonBackReference
    private Product product;

    @Column(insertable = false, updatable = false)
    private Long prodID;
    private String salesmanName;
    private Long dOS;
    @Transient
    private String date;
}
