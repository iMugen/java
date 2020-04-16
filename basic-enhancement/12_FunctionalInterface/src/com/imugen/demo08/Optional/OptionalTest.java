package com.imugen.demo08.Optional;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Daniel Liu 2020/4/16 17:53
 */

class OptionalTest {

    @Test
    public void whenCreateEmptyOptional_thenCorrect(){
        Optional<String> optional = Optional.empty();
        assertFalse(optional.isPresent());
    }


}