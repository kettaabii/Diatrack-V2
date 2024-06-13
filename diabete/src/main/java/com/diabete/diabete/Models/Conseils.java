package com.diabete.diabete.Models;

import jakarta.persistence.*;
import lombok.*;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Conseils {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int conseilId;
    private String Title;
    private String description;
    private String Article;
    private String picture;
    private String status;

}
