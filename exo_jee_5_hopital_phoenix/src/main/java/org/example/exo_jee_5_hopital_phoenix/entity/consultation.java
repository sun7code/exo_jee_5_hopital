package org.example.exo_jee_5_hopital_phoenix.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "consultations")
public class consultation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private patient patient;

    private Date date;

    private String doctorName;

    private String diagnosis;

    @OneToOne(mappedBy = "consultation", cascade = CascadeType.ALL)
    private prescription prescription;
}