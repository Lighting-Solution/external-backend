package com.ls.out.domain.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Repository;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "inquiry")
public class Inquiry {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_sequence_generator")
    @SequenceGenerator(name = "my_sequence_generator", sequenceName = "my_sequence", allocationSize = 1)
    private Integer id;

    private String companyName;

    private String name;

    private String tel;

    private String email;

    private String message;

    private String manager;

    private int inquiryState;
}
