package com.module.service.test;

import com.module.service.Service;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.Matchers.*;

/**
 * Created by Pablo Valiente
 */
@RunWith(JUnit4.class)
public class TestService {
    @Test
    public void testingBasicService() {
        Assert.assertThat(new Service().printRandom(), is(not(0)));
    }
}
