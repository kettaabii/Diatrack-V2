package com.diabete.diabete.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalTime;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Activity")
public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ActivityId;

    @Column
    private String Type;

    @Column
    private Integer Duree;

    @Column
    private String Description;

    @Column
    private String Heropicture;

    @Column
    private String Picture1;

    @Column
    private String Picture2;

    @Column
    private Boolean Done;

    @Column(name = "heurs")
    @DateTimeFormat(pattern = "HH:mm")
    private LocalTime StartTime;

    @Column
    private String Video;


}
