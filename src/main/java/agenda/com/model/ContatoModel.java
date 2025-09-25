package agenda.com.model;

import jakarta.persistence.*;

@Entity
@Table
public class ContatoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



}
