package com.juanlumn.example;

import org.junit.Test;

public class ApplicationTest {
    @Test
    public void main() throws Exception {
        Application.main(new String[]{
            "--spring.main.web-environment=false",
            "--spring.autoconfigure.exclude=nothingToExclude",
        });
    }

}