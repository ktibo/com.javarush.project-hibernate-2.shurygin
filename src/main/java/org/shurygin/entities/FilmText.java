package org.shurygin.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

@Getter
@Setter
@Entity
@Table(schema = "movie", name = "film_text")
public class FilmText {
    @Id
    @Column(name = "film_id")
    private Short id;

    @MapsId
    @OneToOne
    @JoinColumn(name = "film_id")
    private Film film;

    private String title;

    @Column(columnDefinition = "text")
    @Type(type = "text")
    private String description;
}
