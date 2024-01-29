package com.example.demomongodb.model;

import com.example.demomongodb.entity.SampleEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class SampleModel extends SampleEntity {
}
