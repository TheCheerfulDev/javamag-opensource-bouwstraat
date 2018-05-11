/*
 * Copyright 2018 Mark Hendriks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package nl.markhendriks.javamagopensourcebouwstraat;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        this.calculator = new Calculator();
    }

    @Test
    public void addTest() {
        final int a = 10;
        final int b = 2;

        assertThat(12, is(this.calculator.add(a, b)));
    }

    @Test
    public void subtractTest() {
        final int a = 10;
        final int b = 2;

        assertThat(8, is(this.calculator.subtract(a, b)));
    }

    @Test
    public void multiplyTest() {
        final int a = 10;
        final int b = 2;

        assertThat(20, is(this.calculator.multiply(a, b)));
    }
}