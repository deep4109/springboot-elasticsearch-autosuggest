package com.example.springbootautosuggestusingelasticsearch.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.annotation.processing.SupportedAnnotationTypes;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(indexName = "product")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {
    private Integer id;
    private String name;
    private Double price ;
    private Integer quantity ;


}
