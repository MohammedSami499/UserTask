package com.example.users.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column( nullable = false)
    private String name;
    @Column( nullable = false)
    private String email;

    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
            @JoinColumn(
            name = "user_id",
            referencedColumnName = "id"
    )
    private Set<PhoneNumbers> phoneNumbers;

    @ManyToMany(
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL)
    @JoinTable(
            name = "user_role",
            joinColumns = @JoinColumn(
                    name = "user_id",
                    referencedColumnName = "id"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id",
                    referencedColumnName = "roleId"
            )
    )
    private Set<Roles> roles;
}
