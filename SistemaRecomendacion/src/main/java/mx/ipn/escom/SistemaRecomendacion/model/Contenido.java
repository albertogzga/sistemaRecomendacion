package mx.ipn.escom.SistemaRecomendacion.model;

import jakarta.persistence.*;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Contenido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String tipo;
    private String descripcion;
    private String autor;
    private double puntuacion;
    private String urlImagen;
    private String enlaceExterno;

}
