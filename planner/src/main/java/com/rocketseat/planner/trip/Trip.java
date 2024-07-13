package com.rocketseat.planner.trip;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@Entity
@Table(name = "trips")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Trip {

    // ID
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    // DESTINATION
    @Column(nullable = false)
    private String destination;

    // STARTS AT
    @Column(name = "starts_at" , nullable = false)
    private LocalDateTime startsAt;

    // ENDS AT
    @Column(name = "ends_at" , nullable = false)
    private LocalDateTime endsAt;

    // IS CONFIRMED
    @Column(name = "is_confirmed" , nullable = false)
    private Boolean isConfirmed;

    // OWNER NAME
    @Column(name = "owner_name" , nullable = false)
    private String ownerName;

    // OWNER EMAIL
    @Column(name = "owner_email" , nullable = false)
    private String ownerEmail;

    public Trip(TripRequestPayload data){
        this.destination = data.destination();
        this.isConfirmed = false;
        this.ownerEmail = data.owner_email();
        this.ownerName = data.owner_name();
        this.startsAt = LocalDateTime.parse(data.starts_at(), DateTimeFormatter.ISO_DATE_TIME);
        this.endsAt = LocalDateTime.parse(data.ends_at(), DateTimeFormatter.ISO_DATE_TIME);
    }
}
