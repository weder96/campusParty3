package com.wsousa.campus.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseContent<T> {
    int recordCount;
    T data;
}
