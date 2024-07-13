package com.rocketseat.planner.participant;

import com.rocketseat.planner.trip.Trip;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table (name = "participants")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Participant {

    // ID
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    // IS CONFIRMED
    @Column(name = "is_confirmed" , nullable = false)
    private Boolean isConfirmed;

    // OWNER NAME
    @Column(nullable = false)
    private String name;

    // OWNER EMAIL
    @Column(nullable = false)
    private String email;

    // FOREIGN KEY
    @ManyToOne
    @JoinColumn (name = "trip_id", nullable = false )
    private Trip trip;

    public Participant(String email, Trip trip){
        this.email = email;
        this.trip = trip;
        this.isConfirmed = false;
        this.name = "";

    }

}

