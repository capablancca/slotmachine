package com.game.slotmachine.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;
    private String role;
    private String username;
    private String email;
//    @OneToMany(mappedBy = "user", cascade = CascadeType.REMOVE)
//    private List<Ticket> tickets;

}
