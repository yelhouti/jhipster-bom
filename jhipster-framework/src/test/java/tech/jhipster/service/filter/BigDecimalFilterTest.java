/*
 * Copyright 2016-2020 the original author or authors from the JHipster project.
 *
 * This file is part of the JHipster project, see https://www.jhipster.tech/
 * for more information.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package tech.jhipster.service.filter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BigDecimalFilterTest {

    private BigDecimalFilter filter;

    private BigDecimal value = new BigDecimal(42L);

    @BeforeEach
    public void setup() {
        filter = new BigDecimalFilter();
    }

    @Test
    public void testConstructor() {
        assertThat(filter.getEquals()).isNull();
        assertThat(filter.getNotEquals()).isNull();
        assertThat(filter.getSpecified()).isNull();
        assertThat(filter.getLike()).isNull();
        assertThat(filter.getIn()).isNull();
        assertThat(filter.getNotIn()).isNull();
        assertThat(filter.getGreaterThan()).isNull();
        assertThat(filter.getLessThan()).isNull();
        assertThat(filter.getGreaterThanOrEqual()).isNull();
        assertThat(filter.getLessThanOrEqual()).isNull();
        assertThat(filter.toString()).isEqualTo("BigDecimalFilter []");
    }

    @Test
    public void testCopy() {
        final BigDecimalFilter copy = filter.copy();
        assertThat(copy).isNotSameAs(filter);
        assertThat(copy.getEquals()).isNull();
        assertThat(copy.getNotEquals()).isNull();
        assertThat(copy.getSpecified()).isNull();
        assertThat(copy.getLike()).isNull();
        assertThat(copy.getIn()).isNull();
        assertThat(copy.getNotIn()).isNull();
        assertThat(copy.getGreaterThan()).isNull();
        assertThat(copy.getLessThan()).isNull();
        assertThat(copy.getGreaterThanOrEqual()).isNull();
        assertThat(copy.getLessThanOrEqual()).isNull();
        assertThat(copy.toString()).isEqualTo("BigDecimalFilter []");
    }

    @Test
    public void testSetEquals() {
        Filter<BigDecimal> chain = filter.setEquals(value);
        assertThat(chain).isEqualTo(filter);
        assertThat(filter.getEquals()).isEqualTo(value);
    }

    @Test
    public void testSetNotEquals() {
        Filter<BigDecimal> chain = filter.setNotEquals(value);
        assertThat(chain).isEqualTo(filter);
        assertThat(filter.getNotEquals()).isEqualTo(value);
    }

    @Test
    public void testSetSpecified() {
        Filter<BigDecimal> chain = filter.setSpecified(true);
        assertThat(chain).isEqualTo(filter);
        assertThat(filter.getSpecified()).isEqualTo(true);
    }

    @Test
    public void testSetLike() {
        Filter<BigDecimal> chain = filter.setLike("like");
        assertThat(chain).isEqualTo(filter);
        assertThat(filter.getLike()).isEqualTo("like");
    }

    @Test
    public void testSetIn() {
        List<BigDecimal> list = new LinkedList<>();
        Filter<BigDecimal> chain = filter.setIn(list);
        assertThat(chain).isEqualTo(filter);
        assertThat(filter.getIn()).isEqualTo(list);
    }

    @Test
    public void testSetNotIn() {
        List<BigDecimal> list = new LinkedList<>();
        Filter<BigDecimal> chain = filter.setNotIn(list);
        assertThat(chain).isEqualTo(filter);
        assertThat(filter.getNotIn()).isEqualTo(list);
    }

    @Test
    public void testSetGreaterThan() {
        Filter<BigDecimal> chain = filter.setGreaterThan(value);
        assertThat(chain).isEqualTo(filter);
        assertThat(filter.getGreaterThan()).isEqualTo(value);
    }

    @Test
    public void testSetLessThan() {
        Filter<BigDecimal> chain = filter.setLessThan(value);
        assertThat(chain).isEqualTo(filter);
        assertThat(filter.getLessThan()).isEqualTo(value);
    }

    @Test
    public void testSetGreaterThanOrEqual() {
        Filter<BigDecimal> chain = filter.setGreaterThanOrEqual(value);
        assertThat(chain).isEqualTo(filter);
        assertThat(filter.getGreaterThanOrEqual()).isEqualTo(value);
    }

    @Test
    public void testSetLessThanOrEqual() {
        Filter<BigDecimal> chain = filter.setLessThanOrEqual(value);
        assertThat(chain).isEqualTo(filter);
        assertThat(filter.getLessThanOrEqual()).isEqualTo(value);
    }

    @Test
    public void testEquals() {
        final BigDecimalFilter filter2 = new BigDecimalFilter();
        assertThat(filter).isEqualTo(filter2);
        filter.setEquals(value);
        filter2.setEquals(value);
        assertThat(filter).isEqualTo(filter2);
        filter.setNotEquals(value);
        filter2.setNotEquals(value);
        assertThat(filter).isEqualTo(filter2);
        filter.setSpecified(false);
        assertThat(filter2).isNotEqualTo(filter);
        filter2.setSpecified(false);
        assertThat(filter).isEqualTo(filter2);
        filter.setLike("like");
        assertThat(filter2).isNotEqualTo(filter);
        filter2.setLike("like");
        assertThat(filter).isEqualTo(filter2);
        filter.setIn(Arrays.asList(value, value));
        assertThat(filter2).isNotEqualTo(filter);
        filter2.setIn(Arrays.asList(value, value));
        assertThat(filter).isEqualTo(filter2);
        filter.setNotIn(Arrays.asList(value, value));
        assertThat(filter2).isNotEqualTo(filter);
        filter2.setNotIn(Arrays.asList(value, value));
        assertThat(filter).isEqualTo(filter2);
        filter.setGreaterThan(value);
        assertThat(filter).isNotEqualTo(filter2);
        filter2.setGreaterThan(value);
        assertThat(filter).isEqualTo(filter2);
        filter.setLessThan(value);
        assertThat(filter).isNotEqualTo(filter2);
        filter2.setLessThan(value);
        assertThat(filter).isEqualTo(filter2);
        filter.setGreaterThanOrEqual(value);
        assertThat(filter).isNotEqualTo(filter2);
        filter2.setGreaterThanOrEqual(value);
        assertThat(filter).isEqualTo(filter2);
        filter.setLessThanOrEqual(value);
        assertThat(filter).isNotEqualTo(filter2);
        filter2.setLessThanOrEqual(value);
        assertThat(filter).isEqualTo(filter2);
        final BigDecimalFilter filter3 = new BigDecimalFilter();
        filter3.setEquals(value);
        assertThat(filter3).isNotEqualTo(filter);
        assertThat(filter3).isNotEqualTo(filter2);
    }

    @Test
    public void testHashCode() {
        final BigDecimalFilter filter2 = new BigDecimalFilter();
        assertThat(filter.hashCode()).isEqualTo(filter2.hashCode());
        filter.setEquals(value);
        filter2.setEquals(value);
        assertThat(filter.hashCode()).isEqualTo(filter2.hashCode());
        filter.setNotEquals(value);
        filter2.setNotEquals(value);
        assertThat(filter.hashCode()).isEqualTo(filter2.hashCode());
        filter.setSpecified(false);
        filter2.setSpecified(false);
        assertThat(filter.hashCode()).isEqualTo(filter2.hashCode());
        filter.setLike("like");
        filter2.setLike("like");
        assertThat(filter.hashCode()).isEqualTo(filter2.hashCode());
        filter.setIn(Arrays.asList(value, value));
        filter2.setIn(Arrays.asList(value, value));
        assertThat(filter.hashCode()).isEqualTo(filter2.hashCode());
        filter.setNotIn(Arrays.asList(value, value));
        filter2.setNotIn(Arrays.asList(value, value));
        assertThat(filter.hashCode()).isEqualTo(filter2.hashCode());
        filter.setGreaterThan(value);
        filter2.setGreaterThan(value);
        assertThat(filter.hashCode()).isEqualTo(filter2.hashCode());
        filter.setLessThan(value);
        filter2.setLessThan(value);
        assertThat(filter.hashCode()).isEqualTo(filter2.hashCode());
        filter.setGreaterThanOrEqual(value);
        filter2.setGreaterThanOrEqual(value);
        assertThat(filter.hashCode()).isEqualTo(filter2.hashCode());
        filter.setLessThanOrEqual(value);
        filter2.setLessThanOrEqual(value);
        assertThat(filter.hashCode()).isEqualTo(filter2.hashCode());
    }

    @Test
    public void testToString() {
        filter.setEquals(value);
        filter.setNotEquals(value);
        filter.setSpecified(true);
        filter.setLike("like");
        filter.setIn(new LinkedList<>());
        filter.setNotIn(new LinkedList<>());
        filter.setGreaterThan(value);
        filter.setLessThan(value);
        filter.setGreaterThanOrEqual(value);
        filter.setLessThanOrEqual(value);
        String str = value.toString();
        assertThat(filter.toString()).isEqualTo("BigDecimalFilter [equals=" + str + ", notEquals=" + str + ", specified=true, like=like, in=[], notIn=[], greaterThan=" + str + ", lessThan=" + str + ", greaterThanOrEqual=" + str + ", lessThanOrEqual=" + str + "]");
    }
}
