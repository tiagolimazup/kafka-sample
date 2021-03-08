package br.com.zup.orange.kafka;

import java.text.MessageFormat;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

class Cat {

    @JsonProperty
    int id;

    @JsonProperty
    String name;

    @JsonProperty
    int age;

    @JsonCreator
    Cat(@JsonProperty("id") int id,
        @JsonProperty("name") String name,
        @JsonProperty("age") int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Cat [id={0}, name={1}, age={2}]", id, name, age);
    }
}
