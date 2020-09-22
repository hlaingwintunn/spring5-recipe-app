package hwt.guru.spring5recipeapp.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;
}
