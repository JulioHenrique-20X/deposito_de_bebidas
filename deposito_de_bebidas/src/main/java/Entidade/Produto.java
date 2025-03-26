package Entidade;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String tipo; // Ex: Cerveja, Refrigerante, Destilado
    private String marca;
    private Double preco;
    private Double volume; // ml ou litros
    private Integer quantidadeEstoque;
}

