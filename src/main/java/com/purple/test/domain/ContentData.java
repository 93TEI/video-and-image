package com.purple.test.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class ContentData {

    @Id
    @Column
    private String key;
    @Column
    private String value;

    @Builder
    public ContentData(String key, String value){
        this.key = key;
        this.value = value;
    }
}
