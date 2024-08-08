package com.nc.test_api.domain;

import java.time.LocalDate;

import javax.persistence.Transient;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;

@Data
@Entity // jpa entity
@NoArgsConstructor
@Table
public class Custommer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "custommer_generator")
    @SequenceGenerator(name = "custommer_generator", sequenceName = "custommer_sequence", allocationSize = 1)
    private Long Id;
    /**
     * PERFORMANCE CONFIG
     * estas anotaciones generan las primary key automaticamente
     * con generated value asignas una estrategia de generacion de primary key luego
     * asignas el generador
     * en este caso seria sequencGenerator
     * all location size sequencia en entero precargada de la base de datos de
     * sequencias
     * 
     */

    private String name;
    private String mail;
    private String password;
    private LocalDate dob;
    @Transient // omite esta variable de la persistencia
    private Integer age;

    public Custommer(Long id, String name, String mail, String password, LocalDate dob) {
        Id = id;
        this.name = name;
        this.mail = mail;
        this.password = password;
        this.dob = dob;
    }
}

//consumir apis

/**
 * Google Trends:

API: Google Trends API (no oficial) o pytrends (una librería de Python que facilita el acceso a Google Trends).
YouTube:

API: YouTube Data API v3 - Permite acceder a datos sobre videos, canales, listas de reproducción y tendencias.
Amazon:

API: Amazon Product Advertising API - Permite obtener información sobre productos, reseñas y tendencias.
Reddit:

API: Reddit API - Permite acceder a datos sobre publicaciones, comentarios y temas populares en diferentes subreddits.
Instagram:

API: Instagram Graph API - Permite acceder a datos sobre cuentas y contenido, pero requiere permisos especiales para datos más profundos.
Twitter:

API: Twitter API v2 - Permite acceder a datos sobre tweets, usuarios, y tendencias en tiempo real.
Pinterest:

API: Pinterest API - Ofrece acceso a datos sobre pines, tableros y temas populares.
TikTok:

API: TikTok for Developers - Proporciona acceso a datos sobre videos y tendencias, aunque la API es más restrictiva y puede requerir permisos adicionales.
Facebook:

API: Facebook Graph API - Permite acceder a datos sobre publicaciones, páginas y temas populares.
LinkedIn:

API: LinkedIn API - Permite acceder a datos sobre publicaciones, interacciones y temas profesionales.
extraer en base a competidores 
*/