package ua.logos.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "book")
public class Book extends BaseEntity{


    private String title;

    private String description;

    private BigDecimal price;

    private String imageUrl;

    private String isbn;

    private String author;


    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
