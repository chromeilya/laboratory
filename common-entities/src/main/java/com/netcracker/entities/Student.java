package com.netcracker.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * Created by ilkh0715 on 30.10.2016.
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode

@Entity
@Table(name = "T_STUDENT")
public class Student implements Serializable {

    private static final Long serialVersionUID = 25463461234L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "F_ID")
    private Integer id;

    @Size(min = 3, max = 20)
    @Column(name = "F_NAME")
    private String name;

    @Size(min = 3, max = 20)
    @Column(name = "F_SURNAME")
    private String surname;

}
