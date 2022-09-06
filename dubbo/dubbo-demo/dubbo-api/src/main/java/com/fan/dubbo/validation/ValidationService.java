package com.fan.dubbo.validation;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public interface ValidationService {
    void save(ValidationParameter validationParameter);

    void update(ValidationParameter validationParameter);

    void delete(@Min(1L) long l,@NotNull @Size(min = 2,max = 16) String s);
}
