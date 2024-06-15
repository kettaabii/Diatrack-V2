package com.diabete.diabete.Models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Data
public class Conseils {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int conseilId;
    private String Title;
    private String Article;
    private String picture;
    private String status;

}
