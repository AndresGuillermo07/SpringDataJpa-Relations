package com.jpa.relations.unidirectional.many_to_many;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "uni_Book_many_to_one")
@Table(name = "uni_Book_many_to_one")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    @JoinTable(name = "book_author_unidirectional",
        joinColumns= @JoinColumn(name="book_id"),
        inverseJoinColumns = @JoinColumn(name="author_id")
    )
    private List<Author> authors;
}
